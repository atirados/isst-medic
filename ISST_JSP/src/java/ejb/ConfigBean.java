package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;

@Singleton
//@Startup
@Stateless
public class ConfigBean {

	@EJB
	private PeticionMedicoBean request;
        	
	//@PostConstruct
	public void createData() {
            System.out.println("Inyecto ejb");
            request.createMedico(12, "Carlos", "asd");
            request.createMedico(13, "Carlos2", "asd2");
            request.createMedico(14, "Carlos", "asdasd");
	}
}
