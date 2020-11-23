package ubb.electivo.anteproyecto.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "provincia", schema = "geolocalizacion")
public class Provincia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_provincia")
	private String nombreProvincia;
	@Column(name = "activo")
	private Integer activo;
	
	@ManyToOne
	private Region region;
	
	
	@Override
	public String toString() {
		return "Provincia [id=" + id + ", nombreProvincia=" + nombreProvincia + ", activo=" + activo + ", regionId="
				+ region + "]";
	}

	public Provincia() {}
	
	public Provincia(Long id, String nombreProvincia, Integer activo, Region regionId) {
		super();
		this.id = id;
		this.nombreProvincia = nombreProvincia;
		this.activo = activo;
		this.region = regionId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
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

	public void setRegionId(Region regionId) {
		this.region = regionId;
	}
	
	
	
	

}
