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
import ubb.electivo.anteproyecto.servicios.DireccionServicio;
import ubb.electivo.anteproyecto.entidades.Direccion;
import ubb.electivo.anteproyecto.entidades.Region;
import ubb.electivo.anteproyecto.dto.GeolocalizacionDTO;

@RestController
@RequestMapping("/api")
public class DireccionController {
	
	@Autowired
	DireccionServicio direccionServicio;
	
	@GetMapping(value = "leer-direccion")
	public List<Direccion> retornarTodasLasDirecciones(){
		return this.direccionServicio.getAllDireccion();
	}
	
	@PostMapping(value = "insertar-direccion")
	public Direccion insertarDireccion(@RequestBody Direccion direccion) {
		return this.direccionServicio.insertDireccion(direccion);
	}
	
	@DeleteMapping(value = "eliminar-direccion")
	public void eliminarDireccion(@RequestParam Long direccionId) {
		this.direccionServicio.eliminarDireccion(direccionId);
	}
	
	@GetMapping(value = "geolocalizaciones-inactivas")
	public GeolocalizacionDTO localizacionesInactivas(){
		return this.direccionServicio.traerLocalizacionesInactivas();
	}

}
