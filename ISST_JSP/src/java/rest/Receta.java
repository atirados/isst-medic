package rest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="recetas")
public class Receta {
	
	@XmlAttribute(name="nombreMedico") private String nombreMedico;
	@XmlAttribute(name="numeroColegiado") private String numeroColegiado;
	@XmlAttribute(name="fechaExpedicion") private String fechaExpedicion;
	@XmlAttribute(name="id") private String id;
	@XmlAttribute(name="expedido") private String expedido;
	@XmlAttribute(name="nombreMedicamento") private String nombreMedicamento;
	@XmlAttribute(name="nombrePaciente") private String nombrePaciente;
	@XmlAttribute(name="medicamentoAlternativo") private String medicamentoAlternativo;
	@XmlAttribute(name="tipo") private String tipo;
	@XmlAttribute(name="posologia") private String posologia;
	@XmlAttribute(name="tarjetaSS") private String tarjetaSS;
	
	
	@Override
	public String toString() {
		return "Receta [fechaExpedicion=" + fechaExpedicion + ", id=" + id
				+ ", expedido=" + expedido + ", nombreMedicamento="
				+ nombreMedicamento + ", nombrePaciente=" + nombrePaciente
				+ ", medicamentoAlternativo=" + medicamentoAlternativo
				+ ", tipo=" + tipo + ", posologia=" + posologia
				+ ", tarjetaSS=" + tarjetaSS + ", nombreMedico=" + nombreMedico
				+ ", numeroColegiado=" + numeroColegiado + "]";
	}
	
	public String getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExpedido() {
		return expedido;
	}

	public void setExpedido(String expedido) {
		this.expedido = expedido;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getMedicamentoAlternativo() {
		return medicamentoAlternativo;
	}

	public void setMecamentoAlternativo(String mecamentoAlternativo) {
		this.medicamentoAlternativo = mecamentoAlternativo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPosologia() {
		return posologia;
	}

	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}

	public String getTarjetaSS() {
		return tarjetaSS;
	}

	public void setTarjetaSS(String tarjetaSS) {
		this.tarjetaSS = tarjetaSS;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(String numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

}
