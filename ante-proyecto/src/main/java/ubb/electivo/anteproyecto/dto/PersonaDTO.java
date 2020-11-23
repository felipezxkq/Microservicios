package ubb.electivo.anteproyecto.dto;

public class PersonaDTO {
	public String nombrePersona;
	public String email;
	public String nombreDireccion;
	public String nombreCiudad;
	public String nombreProvincia;
	public String nombreRegion;
	
	public PersonaDTO() {}
	
	public PersonaDTO(String nombrePersona, String email, String nombreDireccion, String nombreCiudad,
			String nombreProvincia, String nombreRegion) {
		super();
		this.nombrePersona = nombrePersona;
		this.email = email;
		this.nombreDireccion = nombreDireccion;
		this.nombreCiudad = nombreCiudad;
		this.nombreProvincia = nombreProvincia;
		this.nombreRegion = nombreRegion;
	}
	
	public PersonaDTO(String nombrePersona, String nombreDireccion, String nombreCiudad,
			String nombreProvincia, String nombreRegion) {
		super();
		this.nombrePersona = nombrePersona;
		this.nombreDireccion = nombreDireccion;
		this.nombreCiudad = nombreCiudad;
		this.nombreProvincia = nombreProvincia;
		this.nombreRegion = nombreRegion;
	}
	
	@Override
	public String toString() {
		return "PersonaDTO [nombrePersona=" + nombrePersona + ", email=" + email + ", nombreDireccion="
				+ nombreDireccion + ", nombreCiudad=" + nombreCiudad + ", nombreProvincia=" + nombreProvincia
				+ ", nombreRegion=" + nombreRegion + "]";
	}
	
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreDireccion() {
		return nombreDireccion;
	}
	public void setNombreDireccion(String nombreDireccion) {
		this.nombreDireccion = nombreDireccion;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public String getNombreProvincia() {
		return nombreProvincia;
	}
	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	public String getNombreRegion() {
		return nombreRegion;
	}
	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}
	
	

}
