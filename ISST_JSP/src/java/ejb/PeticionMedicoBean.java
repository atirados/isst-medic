package ejb;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Medico;
import exception.MedicoNotFoundException;

@Stateless
public class PeticionMedicoBean {

	@PersistenceContext
	private EntityManager em;
	private static final Logger logger =
			Logger.getLogger("clientemedico.ejb.PeticionMedicoBean");

	public PeticionMedicoBean() throws Exception {
	}

	public void createMedico(int numeroColegiado, String nombre, String pass){
		try {
            Medico medico = new Medico(numeroColegiado, nombre,	pass);
            logger.log(Level.INFO, "Created medico {0}", numeroColegiado);
            em.persist(medico);
            logger.log(Level.INFO, "Persisted medico {0}", numeroColegiado);
        } catch (Exception ex) {
            throw new EJBException(ex.getMessage());
        }
	}
	
	public boolean compruebaCredenciales(int numeroColegiado, String pass) throws MedicoNotFoundException {
        try {
        	logger.log(Level.INFO, "Searched for doctor {0}", numeroColegiado);
            @SuppressWarnings("unchecked")
			List<Medico> temp = em.createNamedQuery("buscaMedico")
            		.setParameter("n", numeroColegiado)
            		.getResultList();
                        
            if(temp.get(0).getPass().equals(pass)){ 
            	logger.log(Level.INFO, "Algo {0}", temp.get(0).getNombre());
            	return true;
            } else {
            	return false;
            }
        } catch (Exception ex) {
            throw new MedicoNotFoundException(
                    "No se encontró al médico: " + ex.getMessage());
        }
	}
}