package ubb.electivo.anteproyecto.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;

import ubb.electivo.anteproyecto.entidades.Ciudad;
import ubb.electivo.anteproyecto.entidades.Region;
import ubb.electivo.anteproyecto.repositorios.CiudadRepositorio;



@Service
public class CiudadServicio {
	
	@Autowired
	private CiudadRepositorio ciudadRepositorio;
	public List<Ciudad> getAllCiudad(){
		return this.ciudadRepositorio.findAll();
	}
	
	public Ciudad insertCiudad(Ciudad ciudad) {
		this.ciudadRepositorio.save(ciudad);
		return ciudad;
	}
	
	public Ciudad desactivarCiudad(Long ciudadId) {
		Optional<Ciudad> ciudadDesactivadaOptional = this.ciudadRepositorio.findById(ciudadId);
		Ciudad ciudadDesactivada = new Ciudad();
		if(ciudadDesactivadaOptional.isPresent()) {
			ciudadDesactivada = ciudadDesactivadaOptional.get();
			ciudadDesactivada.setActivo(Integer.parseInt("0"));
			this.ciudadRepositorio.save(ciudadDesactivada);
		}
		return ciudadDesactivada;
	}
	
	public void eliminarCiudad(long id)
	{
	    this.ciudadRepositorio.deleteById(id); 
	}
	
	

}
