package ubb.electivo.anteproyecto.entidades.projections;

import ubb.electivo.anteproyecto.entidades.*;

import org.springframework.data.rest.core.config.Projection;

@Projection(
				name = "geolocalizacionProjection",
				types = { Ciudad.class, Region.class, Direccion.class, Provincia.class }		
		)

public interface GeolocalizacionProjection {
	String getNombreCiudad();
	String getRegionNombre();
	String getDireccionNombre();
	String getProvinciaNombre();
}
