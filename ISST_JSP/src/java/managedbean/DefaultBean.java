package managedbean;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class DefaultBean extends AbstractBean {

	private static final long serialVersionUID = -2633611967469176418L;
	
	public String inicio(){
		return ("index");
	}	
	
	public String nuevaReceta(){
		return ("nuevaReceta");
	}
	
	public String verRecetas(){
		return ("verRecetas");
	}
	
}
