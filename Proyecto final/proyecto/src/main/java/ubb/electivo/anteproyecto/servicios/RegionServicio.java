package ubb.electivo.anteproyecto.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.electivo.anteproyecto.entidades.Region;
import ubb.electivo.anteproyecto.repositorios.RegionRepositorio;


@Service
public class RegionServicio {
	
	@Autowired
	private RegionRepositorio regionRepositorio;
	
	public List<Region> getAllRegion(){
		return this.regionRepositorio.findAll();
	}
	
	public Region insertRegion(Region region) {
		this.regionRepositorio.save(region);
		return region;
	}
	
	public void eliminarRegion(long id)
	{
	    this.regionRepositorio.deleteById(id); 
	}
	
	

}



