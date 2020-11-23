package ubb.electivo.anteproyecto.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "direccion", schema = "geolocalizacion")
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_direccion")
	private String nombreDireccion;
	@Column(name = "activo")
	private Integer activo;
	
	@ManyToOne
	private Ciudad ciudad;
	
	public Direccion() {}
	
	public Direccion(Long id, String nombreDireccion, Integer activo, Ciudad ciudadId) {
		super();
		this.id = id;
		this.nombreDireccion = nombreDireccion;
		this.activo = activo;
		this.ciudad = ciudadId;
	}
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", nombreDireccion=" + nombreDireccion + ", activo=" + activo + ", ciudadId="
				+ ciudad + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreDireccion() {
		return nombreDireccion;
	}
	public void setNombreDireccion(String nombreDireccion) {
		this.nombreDireccion = nombreDireccion;
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
	public void setCiudadId(Ciudad ciudadId) {
		this.ciudad = ciudad;
	}
	
	
}
