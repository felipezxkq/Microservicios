package ubb.electivo.anteproyecto.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad", schema = "geolocalizacion")

public class Ciudad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_ciudad")
	private String nombreCiudad;
	@Column(name = "activo")
	private Integer activo;
	
	@ManyToOne
	private Provincia provincia;
	
	
	public Ciudad() {}	
	
	public Ciudad(Long id, String nombreCiudad, Integer activo, Provincia provinciaId) {
		super();
		this.id = id;
		this.nombreCiudad = nombreCiudad;
		this.activo = activo;
		this.provincia = provinciaId;
	}
	
	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombreCiudad=" + nombreCiudad + ", activo=" + activo + ", provinciaId="
				+ provincia + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvinciaId(Provincia provinciaId) {
		this.provincia = provinciaId;
	}
	
	

}
