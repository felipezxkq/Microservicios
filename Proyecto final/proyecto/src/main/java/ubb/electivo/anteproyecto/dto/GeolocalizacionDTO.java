package ubb.electivo.anteproyecto.dto;

import java.util.List;

public class GeolocalizacionDTO {
	public List<String> nombreDireccion;
	public List<String> nombreComuna;
	public List<String> nombreProvincia;
	public List<String> nombreRegion;
	
	
	
	@Override
	public String toString() {
		return "GeolocalizacionPDO [nombreDireccion=" + nombreDireccion + ", nombreComuna=" + nombreComuna
				+ ", nombreProvincia=" + nombreProvincia + ", nombreRegion=" + nombreRegion + "]";
	}

	public GeolocalizacionDTO() {}
	
	public GeolocalizacionDTO(List<String> nombreDireccion, List<String> nombreComuna, List<String> nombreProvincia,
			List<String> nombreRegion) {
		super();
		this.nombreDireccion = nombreDireccion;
		this.nombreComuna = nombreComuna;
		this.nombreProvincia = nombreProvincia;
		this.nombreRegion = nombreRegion;
	}
	public List<String> getNombreDireccion() {
		return nombreDireccion;
	}
	public void setNombreDireccion(List<String> nombreDireccion) {
		this.nombreDireccion = nombreDireccion;
	}
	public List<String> getNombreComuna() {
		return nombreComuna;
	}
	public void setNombreComuna(List<String> nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
	public List<String> getNombreProvincia() {
		return nombreProvincia;
	}
	public void setNombreProvincia(List<String> nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	public List<String> getNombreRegion() {
		return nombreRegion;
	}
	public void setNombreRegion(List<String> nombreRegion) {
		this.nombreRegion = nombreRegion;
	}
	
	
	

}
