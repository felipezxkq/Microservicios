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
import ubb.electivo.anteproyecto.servicios.ProvinciaServicio;
import ubb.electivo.anteproyecto.entidades.Provincia;
import ubb.electivo.anteproyecto.entidades.Region;

@RestController
@RequestMapping("/api")
public class ProvinciaController {
	
	@Autowired
	ProvinciaServicio provinciaServicio;
	
	@GetMapping(value = "leer-provincia")
	public List<Provincia> retornarTodasLasProvincias(){
		return this.provinciaServicio.getAllProvincia();
	}
	
	@PostMapping(value = "insertar-provincia")
	public Provincia insertarPovincia(@RequestBody Provincia provincia) {
		return this.provinciaServicio.insertProvincia(provincia);
	}
	
	@DeleteMapping(value = "eliminar-provincia")
	public void eliminarProvincia(@RequestParam Long provinciaId) {
		this.provinciaServicio.eliminarProvincia(provinciaId);
	}

}
