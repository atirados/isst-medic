package managedbean;

import ejb.PeticionRecetaBean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CreaRecetasBean extends AbstractBean {

	private static final long serialVersionUID = -2633611964479166418L;

	@EJB
	private PeticionRecetaBean peticionRecetaBean;
	
	private String recetaId;
	private String nombrePaciente;
	private int tarjetaSanitaria;
	private String nombreMedico;
	private int numeroColegiado;
	private String fechaExpedicion;
	private String nombreMedicamento;
	private String posologia;
	private String tipo;
	private String medicamentoAlternativo;
	
	
	public void submit(){	
		
		peticionRecetaBean.creaReceta(recetaId, nombrePaciente, tarjetaSanitaria,
				nombreMedico, numeroColegiado, fechaExpedicion, nombreMedicamento,
				posologia, tipo, medicamentoAlternativo);
		
	}

	public PeticionRecetaBean getPeticionRecetaBean() {
		return peticionRecetaBean;
	}

	public void setPeticionRecetaBean(PeticionRecetaBean peticionRecetaBean) {
		this.peticionRecetaBean = peticionRecetaBean;
	}

	public String getRecetaId() {
		return recetaId;
	}

	public void setRecetaId(String recetaId) {
		this.recetaId = recetaId;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public int getTarjetaSanitaria() {
		return tarjetaSanitaria;
	}

	public void setTarjetaSanitaria(int tarjetaSanitaria) {
		this.tarjetaSanitaria = tarjetaSanitaria;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public int getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	public String getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	public String getPosologia() {
		return posologia;
	}

	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMedicamentoAlternativo() {
		return medicamentoAlternativo;
	}

	public void setMedicamentoAlternativo(String medicamentoAlternativo) {
		this.medicamentoAlternativo = medicamentoAlternativo;
	}

}
