package managedbean;


import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ejb.PeticionMedicoBean;
import exception.MedicoNotFoundException;

@Named
@SessionScoped
public class LoginBean extends AbstractBean {

	private static final long serialVersionUID = -2633611967469166418L;

	@EJB
	private PeticionMedicoBean peticionMedicoBean;
		
	private int numeroColegiado;
	private String pass;
	
	public String submit() throws MedicoNotFoundException {
		
		boolean temp = peticionMedicoBean
				.compruebaCredenciales(numeroColegiado, pass);
		if(temp) return ("index");
		return("login");
	}
	
	public String prueba(){
		return ("register");
	}

	public PeticionMedicoBean getPeticionMedicoBean() {
		return peticionMedicoBean;
	}

	public void setPeticionMedicoBean(PeticionMedicoBean peticionMedicoBean) {
		this.peticionMedicoBean = peticionMedicoBean;
	}
	
	public int getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
