package ubb.electivo.anteproyecto.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trabajo_material", schema = "trabajo")
public class Trabajo_material {
	
	@OneToOne
	private Trabajos trabajo;
	
	@OneToOne
	private Material material;
	
	@Column(name = "activo")
	private Integer activo;
	
	@Column(name = "costo_material")
	private Integer costoMaterial;

	public Trabajo_material(Trabajos trabajo, Material material, Integer activo, Integer costoMaterial) {
		super();
		this.trabajo = trabajo;
		this.material = material;
		this.activo = activo;
		this.costoMaterial = costoMaterial;
	}

	public Trabajos getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajos trabajo) {
		this.trabajo = trabajo;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Integer getCostoMaterial() {
		return costoMaterial;
	}

	public void setCostoMaterial(Integer costoMaterial) {
		this.costoMaterial = costoMaterial;
	}

	@Override
	public String toString() {
		return "Trabajo_material [trabajo=" + trabajo + ", material=" + material + ", activo=" + activo
				+ ", costoMaterial=" + costoMaterial + "]";
	}
	
	

}
