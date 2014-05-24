package ejb;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Paciente;
import exception.PacienteNotFoundException;


@Stateless
public class PeticionPacienteBean {

	@PersistenceContext
	private EntityManager em;
	private static final Logger logger =
			Logger.getLogger("clientemedico.ejb.PeticionPacienteBean");

	public PeticionPacienteBean() throws Exception {
	}

	public Paciente getPaciente(int numeroTarjetaSanitaria) throws PacienteNotFoundException {
        try {
        	logger.log(Level.INFO, "Searched for pacient {0}", numeroTarjetaSanitaria);
            return (Paciente) em.createNamedQuery("buscaPaciente")
            		.setParameter("tarjetaSanitaria", numeroTarjetaSanitaria)
            		.getResultList();
            
        } catch (Exception ex) {
            throw new PacienteNotFoundException(
                    "No se encontró al paciente: " + ex.getMessage());
        }
	}
}