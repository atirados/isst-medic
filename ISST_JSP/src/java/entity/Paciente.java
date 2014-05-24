package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Pacientes")
@NamedQuery(
		name = "buscaPaciente",
		query = "SELECT p FROM Paciente p WHERE p.tarjetaSanitaria = :t")
public class Paciente implements Serializable {

	
	private static final long serialVersionUID = -8063254025502891421L;
	@Id
	@NotNull
	private int tarjetaSanitaria;
	private String nombre;
	private List<Receta> recetas;
	
	public Paciente(){}

	public Paciente(int tarjetaSanitaria, String nombre, List<Receta> recetas) {
		this.tarjetaSanitaria = tarjetaSanitaria;
		this.nombre = nombre;
		this.recetas = recetas;
	}

	public int getTarjetaSanitaria() {
		return tarjetaSanitaria;
	}

	public void setTarjetaSanitaria(int tarjetaSanitaria) {
		this.tarjetaSanitaria = tarjetaSanitaria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(List<Receta> recetas) {
		this.recetas = recetas;
	}

}
