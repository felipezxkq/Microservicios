package ubb.electivo.anteproyecto.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "material", schema = "trabajo")

public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "valor_unidad")
	private Integer valorUnidad;
	
	@Column(name = "activo")
	private Integer activo;

	public Material() {}
	public Material(Long id, String descripcion, Integer valorUnidad, Integer activo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.valorUnidad = valorUnidad;
		this.activo = activo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getValorUnidad() {
		return valorUnidad;
	}
	public void setValorUnidad(Integer valorUnidad) {
		this.valorUnidad = valorUnidad;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Material [id=" + id + ", descripcion=" + descripcion + ", valorUnidad=" + valorUnidad + ", activo="
				+ activo + "]";
	}
	
	
	
	

}
