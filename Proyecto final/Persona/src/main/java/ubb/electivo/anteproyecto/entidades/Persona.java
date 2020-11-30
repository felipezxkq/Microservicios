package ubb.electivo.anteproyecto.entidades;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona", schema = "persona")
public class Persona {
	@Id
	private String rut;
	
	@Column(name = "primer_nombre")
	private String primerNombre;
	
	@Column(name = "segundo_nombre")
	private String segundoNombre;
	
	@Column(name = "primer_apellido")
	private String primerApellido;
	
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	
	@Column(name = "numero_tef")
	private String numeroTef;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "fecha_nac")
	private Date fechaNacimiento;
	
	@Column(name = "activo")
	private Integer activo;

	@ManyToOne
	private Ciudad ciudad;
	
	public Persona() {}

	public Persona(String rut, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String numeroTef, String direccion, Date fechaNacimiento, Integer activo, Ciudad ciudad) {
		super();
		this.rut = rut;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.numeroTef = numeroTef;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.activo = activo;
		this.ciudad = ciudad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getNumeroTef() {
		return numeroTef;
	}

	public void setNumeroTef(String numeroTef) {
		this.numeroTef = numeroTef;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre
				+ ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", numeroTef="
				+ numeroTef + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo
				+ ", ciudad=" + ciudad + "]";
	}
	
	
	
	
	
}
