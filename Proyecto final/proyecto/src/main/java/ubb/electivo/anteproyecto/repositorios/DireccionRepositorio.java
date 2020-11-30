package ubb.electivo.anteproyecto.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ubb.electivo.anteproyecto.entidades.Direccion;
import ubb.electivo.anteproyecto.entidades.projections.GeolocalizacionProjection;

@Repository
public interface DireccionRepositorio extends JpaRepository<Direccion, Long>{
	
	@Query(value = "SELECT nombre_region FROM geolocalizacion.region WHERE activo=0", nativeQuery = true)
    public List<String> regionesInactivas();
	
	@Query(value = "SELECT nombre_direccion FROM geolocalizacion.direccion WHERE activo=0", nativeQuery = true)
    public List<String> direccionesInactivas();
	
	@Query(value = "SELECT nombre_ciudad FROM geolocalizacion.ciudad WHERE activo=0", nativeQuery = true)
    public List<String> ciudadesInactivas();
	
	@Query(value = "SELECT nombre_provincia FROM geolocalizacion.provincia WHERE activo=0", nativeQuery = true)
    public List<String> provinciasInactivas();

}
