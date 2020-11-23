package ubb.electivo.anteproyecto.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.electivo.anteproyecto.entidades.Provincia;
import ubb.electivo.anteproyecto.entidades.Region;
import ubb.electivo.anteproyecto.repositorios.ProvinciaRepositorio;


@Service
public class ProvinciaServicio {
	
	@Autowired
	private ProvinciaRepositorio provinciaRepositorio;
	public List<Provincia> getAllProvincia(){
		return this.provinciaRepositorio.findAll();
	}
	
	public Provincia insertProvincia(Provincia provincia) {
		this.provinciaRepositorio.save(provincia);
		return provincia;
	}
	
	public void eliminarProvincia(long id)
	{
	    this.provinciaRepositorio.deleteById(id); 
	}

}
