package ubb.electivo.anteproyecto.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "decorador", schema = "persona")
public class Decorador {
	
	@Id
	private String rutDecorador;
	
	@Column(name = "activo")
	private Integer activo;
	
	@OneToOne
	private Persona persona;
	
	@OneToOne
	private Especialidad especialidad;
	
	public Decorador() {}

	public Decorador(String rutDecorador, Integer activo, Persona persona, Especialidad especialidad) {
		super();
		this.rutDecorador = rutDecorador;
		this.activo = activo;
		this.persona = persona;
		this.especialidad = especialidad;
	}

	public String getRutDecorador() {
		return rutDecorador;
	}

	public void setRutDecorador(String rutDecorador) {
		this.rutDecorador = rutDecorador;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Decorador [rutDecorador=" + rutDecorador + ", activo=" + activo + ", persona=" + persona
				+ ", especialidad=" + especialidad + "]";
	}
	
	
	
	

}
