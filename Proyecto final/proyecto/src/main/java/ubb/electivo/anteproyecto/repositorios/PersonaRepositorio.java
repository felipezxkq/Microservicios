package ubb.electivo.anteproyecto.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ubb.electivo.anteproyecto.dto.PersonaDTO2;

import ubb.electivo.anteproyecto.entidades.Persona;
import ubb.electivo.anteproyecto.entidades.projections.PersonaProjection;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long>{
	
	@Query(value = "SELECT p.nombre_persona as nombrePersona, d.nombre_direccion as nombreDireccion, c.nombre_ciudad as nombreCiudad, n.nombre_provincia as nombreProvincia, r.nombre_region as nombreRegion"
		+" FROM usuario.persona p, geolocalizacion.direccion d, geolocalizacion.ciudad c, geolocalizacion.provincia n, geolocalizacion.region r"
		+" WHERE r.nombre_region='Region del Bío-Bío' and p.direccion_id = d.id and d.ciudad_id = c.id and c.provincia_id = n.id and n.region_id = r.id"
		, nativeQuery = true)
    public List<PersonaProjection> personasDeRegionBioBio();


}
