package ubb.electivo.anteproyecto.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ubb.electivo.anteproyecto.servicios.CiudadServicio;
import ubb.electivo.anteproyecto.entidades.Ciudad;
import ubb.electivo.anteproyecto.entidades.Region;

@RestController
@RequestMapping("/api")
public class CiudadController {
	
	@Autowired
	CiudadServicio ciudadServicio;
	
	@GetMapping(value = "leer-ciudad")
	public List<Ciudad> retornarTodasLasCiudades(){
		return this.ciudadServicio.getAllCiudad();
	}

	@PostMapping(value = "insertar-ciudad")
	public Ciudad insertarCiudad(@RequestBody Ciudad ciudad) {
		return this.ciudadServicio.insertCiudad(ciudad);
	}
	
	@PutMapping(value = "desactivar-ciudad")
	public Ciudad desactivarCiudad(@RequestParam Long ciudadId) {
		return this.ciudadServicio.desactivarCiudad(ciudadId);
	}
	
	@DeleteMapping(value = "eliminar-ciudad")
	public void eliminarCiudad(@RequestParam Long ciudadId) {
		this.ciudadServicio.eliminarCiudad(ciudadId);
	}

}
