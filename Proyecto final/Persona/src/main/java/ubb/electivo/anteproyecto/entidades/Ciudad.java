package ubb.electivo.anteproyecto.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad", schema = "persona")
public class Ciudad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombreCiudad;
	@Column(name = "activo")
	private Integer activo;
	
	@ManyToOne
	private Region region;
	
	
	public Ciudad() {}	
	
	public Ciudad(Long id, String nombreCiudad, Integer activo, Region region) {
		super();
		this.id = id;
		this.nombreCiudad = nombreCiudad;
		this.activo = activo;
		this.region = region;
	}
	
	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombreCiudad=" + nombreCiudad + ", activo=" + activo + ", provinciaId="
				+ region + "]";
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
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	
	

}
