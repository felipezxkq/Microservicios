package ubb.electivo.anteproyecto.servicios;

import ubb.electivo.anteproyecto.entidades.projections.GeolocalizacionProjection;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import ubb.electivo.anteproyecto.entidades.Ciudad;
import ubb.electivo.anteproyecto.entidades.Direccion;
import ubb.electivo.anteproyecto.entidades.Persona;
import ubb.electivo.anteproyecto.entidades.Provincia;
import ubb.electivo.anteproyecto.entidades.Region;
import ubb.electivo.anteproyecto.repositorios.CiudadRepositorio;
import ubb.electivo.anteproyecto.repositorios.DireccionRepositorio;
import ubb.electivo.anteproyecto.repositorios.PersonaRepositorio;
import ubb.electivo.anteproyecto.repositorios.ProvinciaRepositorio;
import ubb.electivo.anteproyecto.repositorios.RegionRepositorio;
import ubb.electivo.anteproyecto.dto.GeolocalizacionDTO;


@Service
public class DireccionServicio {
	
	@Autowired
	private DireccionRepositorio direccionRepositorio;
	public List<Direccion> getAllDireccion(){
		return this.direccionRepositorio.findAll();
	}
	
	@Autowired
	private RegionRepositorio regionRepositorio;
	
	public List<Region> getAllRegion(){
		return this.regionRepositorio.findAll();
	}
	
	@Autowired
	private CiudadRepositorio ciudadRepositorio;
	public List<Ciudad> getAllCiudad(){
		return this.ciudadRepositorio.findAll();
	}
	
	@Autowired
	private ProvinciaRepositorio provinciaRepositorio;
	public List<Provincia> getAllProvincia(){
		return this.provinciaRepositorio.findAll();
	}
	
	public Direccion insertDireccion(Direccion direccion) {
		this.direccionRepositorio.save(direccion);
		return direccion;
	}
	
	public void eliminarDireccion(long id){
	    this.direccionRepositorio.deleteById(id); 
	}
	
	public GeolocalizacionDTO traerLocalizacionesInactivas() {
		GeolocalizacionDTO inactivas = new GeolocalizacionDTO();
		inactivas.setNombreComuna(direccionRepositorio.ciudadesInactivas());
		inactivas.setNombreRegion(direccionRepositorio.regionesInactivas());
		inactivas.setNombreProvincia(direccionRepositorio.provinciasInactivas());
		inactivas.setNombreDireccion(direccionRepositorio.direccionesInactivas());		
		return inactivas;
	}
	
	

}
