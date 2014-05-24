package entity;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Named
@SessionScoped
@Entity
@Table(name = "Recetas")
@NamedQueries({
	// Lista todas las recetas almacenadas
	@NamedQuery(
			name = "buscaRecetas",
			query = "SELECT r FROM Receta r ORDER BY r.recetaId"),
	// Lista todas las recetas de un paciente identificado por su tarjeta
	@NamedQuery(
			name = "buscaRecetasPaciente",
			query = "SELECT r FROM Receta r WHERE " + "r.tarjetaSanitaria"
					+ " = :t ORDER BY r.recetaId"),
})
public class Receta implements Serializable {

	// Necesario este campo al implementar Serializable, si no eclipse se queja
    private static final long serialVersionUID = -4146681491856848589L;
    
    // Identificamos las recetas por un id. 
    @Id
    @NotNull
    private String recetaId;
    
    // Paciente
    private String nombrePaciente;
    private int tarjetaSanitaria;
    // Medico
    private String nombreMedico;
    private int numeroColegiado;
    // Receta
    private String fechaExpedicion;
    private String nombreMedicamento;
    private String posologia;
    // El tipo puede ser simple, receta cronica o receta periodica
    private String tipo;
    private String medicamentoAlternativo;

    public Receta() {}

    public Receta(String recetaId, String nombrePaciente, int tarjetaSanitaria,
			String nombreMedico, int numeroColegiado, String fechaExpedicion,
			String nombreMedicamento, String posologia, String tipo,
			String medicamentoAlternativo) {
		this.recetaId = recetaId;
		this.nombrePaciente = nombrePaciente;
		this.tarjetaSanitaria = tarjetaSanitaria;
		this.nombreMedico = nombreMedico;
		this.numeroColegiado = numeroColegiado;
		this.fechaExpedicion = fechaExpedicion;
		this.nombreMedicamento = nombreMedicamento;
		this.posologia = posologia;
		this.tipo = tipo;
		this.medicamentoAlternativo = medicamentoAlternativo;
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

    public void setNombreMedicamento(String nobreMedicamento) {
        this.nombreMedicamento = nobreMedicamento;
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

    @Override
    public String toString() {
        return recetaId + " " + nombrePaciente + " " + nombreMedicamento;
    }

    public String getMedicamentoAlternativo() {
        return medicamentoAlternativo;
    }

    public void setMedicamentoAlternativo(String medicamentoAlternativo) {
        this.medicamentoAlternativo = medicamentoAlternativo;
    }

    
/**
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (recetaId != null ? recetaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Receta)) {
            return false;
        }
        Receta other = (Receta) object;
        return this.recetaId != null || other.recetaId == null 
                && this.recetaId == null || this.recetaId.equals(other.recetaId);
    }
    **/
}
