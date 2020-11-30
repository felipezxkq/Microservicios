package ubb.electivo.anteproyecto.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trabajos", schema = "trabajo")
public class Trabajos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "cantidad_metros")
	private Integer cantidadMetros;
	
	@Column(name = "activo")
	private Integer activo;

	public Trabajos() {}
	public Trabajos(Long id, String descripcion, Integer cantidadMetros, Integer activo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.cantidadMetros = cantidadMetros;
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
	public Integer getCantidadMetros() {
		return cantidadMetros;
	}
	public void setCantidadMetros(Integer cantidadMetros) {
		this.cantidadMetros = cantidadMetros;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Trabajos [id=" + id + ", descripcion=" + descripcion + ", cantidadMetros=" + cantidadMetros
				+ ", activo=" + activo + "]";
	}
	

}
