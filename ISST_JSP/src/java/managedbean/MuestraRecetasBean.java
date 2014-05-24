package managedbean;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import ejb.PeticionRecetaBean;
import entity.Receta;
import exception.RecetaNotFoundException;

@Named
@SessionScoped
public class MuestraRecetasBean extends AbstractBean {

	private static final long serialVersionUID = -2633611867469166418L;

	@EJB
	private PeticionRecetaBean peticionRecetaBean;
	
	private List<Receta> recetas;
	
	public List<Receta> submit() throws RecetaNotFoundException{			
		return peticionRecetaBean.getListaRecetas(1);
	}

	public PeticionRecetaBean getPeticionRecetaBean() {
		return peticionRecetaBean;
	}

	public void setPeticionRecetaBean(PeticionRecetaBean peticionRecetaBean) {
		this.peticionRecetaBean = peticionRecetaBean;
	}

	public List<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(List<Receta> recetas) {
		this.recetas = recetas;
	}
	
}
