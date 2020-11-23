package ubb.electivo.anteproyecto.entidades.projections;

import org.springframework.data.rest.core.config.Projection;

import ubb.electivo.anteproyecto.entidades.Ciudad;
import ubb.electivo.anteproyecto.entidades.Direccion;
import ubb.electivo.anteproyecto.entidades.Provincia;
import ubb.electivo.anteproyecto.entidades.Region;
import ubb.electivo.anteproyecto.entidades.Persona;

@Projection(
		name = "personaProjection",
		types = { Persona.class, Direccion.class, Ciudad.class, Provincia.class, Region.class }		
)
public interface PersonaProjection {
	String getNombrePersona();
	String getDireccionNombre();
	String getNombreCiudad();
	String getProvinciaNombre();
	String getRegionNombre();	
	
}
