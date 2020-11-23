package ubb.electivo.anteproyecto.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "region", schema = "geolocalizacion")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_region")
	private String nombreRegion;
	@Column(name = "activo")
	private Integer activo;
	
	public Region() {}
	
	public Region(Long id, String nombreRegion, Integer activo) {
		super();
		this.id = id;
		this.nombreRegion = nombreRegion;
		this.activo = activo;
	}
	
	@Override
	public String toString() {
		return "Region [id=" + id + ", nombreRegion=" + nombreRegion + ", activo=" + activo +"]";
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	

}
