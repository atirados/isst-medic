package entity;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@SessionScoped
@Entity
@Table(name="Medicos")
@NamedQuery(
		name = "buscaMedico",
		query = "SELECT m FROM Medico m WHERE m.numeroColegiado = :n")

public class Medico implements Serializable {

	
	private static final long serialVersionUID = -8063254025582891421L;
	@Id
	@NotNull
	private int numeroColegiado;
	private String nombre;
	private String pass;
	
	public Medico(){}

	public Medico(int numeroColegiado, String nombre, String pass) {
		this.numeroColegiado = numeroColegiado;
		this.nombre = nombre;
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
