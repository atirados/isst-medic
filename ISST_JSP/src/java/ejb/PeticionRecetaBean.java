package ejb;

import entity.Receta;
import exception.RecetaNotFoundException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
////

@Stateless
public class PeticionRecetaBean {

    @PersistenceContext
    private EntityManager em;
    private static final Logger logger =
            Logger.getLogger("clientemedico.ejb.RecetaBean");

    public PeticionRecetaBean() throws Exception {
    }

    public void creaReceta(String recetaId, String nombrePaciente, int tarjetaSanitaria,
			String nombreMedico, int numeroColegiado, String fechaExpedicion,
			String nombreMedicamento, String posologia, String tipo,
			String medicamentoAlternativo) {
        try {
            Receta receta = new Receta(recetaId, nombrePaciente, tarjetaSanitaria,
            		nombreMedico, numeroColegiado,
                    fechaExpedicion, nombreMedicamento, posologia, tipo, 
                    medicamentoAlternativo);
            logger.log(Level.INFO, "Created receta {0}", recetaId);
            em.persist(receta);
            logger.log(Level.INFO, "Persisted receta {0}", recetaId);
            
            System.out.println("Entro a crear post de receta");
            //enviarReceta(receta);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
    }
    
    public void modificaReceta(Receta receta) {
    	try {
    		em.merge(receta);
    	} catch (Exception ex) {
    		throw new EJBException(ex.getMessage());
    	}
    }

    @SuppressWarnings("unchecked")
    public List<Receta> getListaRecetas(int numTarjeta) throws RecetaNotFoundException {
        try {
            return (List<Receta>) em.createNamedQuery("buscaRecetasPaciente")
                    .setParameter("t", numTarjeta)
                    .getResultList();
            //return (List<Receta>) em.createNamedQuery("buscaRecetas").getResultList();
        } catch (Exception ex) {
            throw new RecetaNotFoundException(
                    "No se encontró la receta: " + ex.getMessage());
        }
    }

    public Receta getReceta(int numeroReceta) throws RecetaNotFoundException {
        Receta recetaPedida = em.find(Receta.class, numeroReceta);

        if (recetaPedida == null) {
            throw new RecetaNotFoundException("No se encontró la receta: " + numeroReceta);
        }

        return recetaPedida;
    }
    
    
    static final String targetURL = "http://localhost:8080/isst/recetas";
    ////////////////////////////////
    public void enviarReceta(Receta rec) {
        try {

	URL targetUrl = new URL(targetURL);

        HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
        httpConnection.setDoOutput(true);
        httpConnection.setRequestMethod("POST");
        httpConnection.setRequestProperty("Content-Type", "application/json");

        //Se obtienen los datos de una receta y se pasan a JSON
        JSONObject objJSON = new JSONObject();
        JSONArray list = new JSONArray();
        JSONObject receta = new JSONObject();
        
        
        receta.put("id", rec.getRecetaId());
        receta.put("nombrePaciente", rec.getNombrePaciente());
        receta.put("tarjetaSS", rec.getTarjetaSanitaria());
        receta.put("nombreMedico", rec.getNombreMedico());
        receta.put("numeroColegiado", rec.getNumeroColegiado());
        receta.put("fechaExpedicion", rec.getFechaExpedicion());
        receta.put("nombreMedicamento", rec.getNombreMedicamento());
        receta.put("posologia", rec.getPosologia());
        receta.put("tipo", rec.getTipo());
        receta.put("medicamentoAlternativo", rec.getMedicamentoAlternativo());
        receta.put("expedido", "false");

        //list.add(receta);
        objJSON.put("recetas",list);
        objJSON.put("numeroRectas", 1);
        
        String input = receta.toString();

        OutputStream outputStream = httpConnection.getOutputStream();
        outputStream.write(input.getBytes());
        outputStream.flush();

        if (httpConnection.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + httpConnection.getResponseCode());
        }

        BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                (httpConnection.getInputStream())));

        String output;
        System.out.println("Output from Server:\n");
        while ((output = responseBuffer.readLine()) != null) {
            System.out.println(output);
        }

        httpConnection.disconnect();

    }
    catch (MalformedURLException e) {
        e.printStackTrace();
    }
    catch (IOException e) {
	e.printStackTrace();
    }   catch (JSONException ex) {
            Logger.getLogger(PeticionRecetaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    ///////////////////////////////
}
