package ubb.electivo.anteproyecto.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ubb.electivo.anteproyecto.servicios.RegionServicio;
import ubb.electivo.anteproyecto.entidades.Region;

@RestController
@RequestMapping("/api")
public class RegionController {
	
	@Autowired
	RegionServicio regionServicio;
	
	@GetMapping(value = "leer-region")
	public List<Region> retornarTodasLasRegiones(){
		return this.regionServicio.getAllRegion();
	}
	
	@PostMapping(value = "insertar-region")
	public Region insertarRegion(@RequestBody Region region) {
		return this.regionServicio.insertRegion(region);
	}
	
	@DeleteMapping(value = "eliminar-region")
	public void eliminarRegion(@RequestParam Long regionId) {
		this.regionServicio.eliminarRegion(regionId);
	}

}
