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
import ubb.electivo.anteproyecto.servicios.PersonaServicio;
import ubb.electivo.anteproyecto.entidades.Ciudad;
import ubb.electivo.anteproyecto.entidades.Persona;
import ubb.electivo.anteproyecto.entidades.Region;
import ubb.electivo.anteproyecto.dto.PersonaDTO;
import ubb.electivo.anteproyecto.entidades.projections.PersonaProjection;

@RestController
@RequestMapping("/api")
public class PersonaController {
	
	@Autowired
	PersonaServicio personaServicio;
	
	@GetMapping(value = "leer-persona")
	public List<Persona> retornarTodasLasPersonas(){
		return this.personaServicio.getAllPersona();
	}
	
	@PostMapping(value = "insertar-persona")
	public Persona insertarPersona(@RequestBody Persona persona) {
		return this.personaServicio.insertPersona(persona);
	}
	
	@DeleteMapping(value = "eliminar-persona")
	public void eliminarPersona(@RequestParam Long personaId) {
		this.personaServicio.eliminarPersona(personaId);
	}
	
	@GetMapping(value = "listar-persona-dto")
	public List<PersonaDTO> listarPersonaDto(){
		return this.personaServicio.traerPersonaDto();
	}
	
	@PutMapping(value = "actualizar-persona")
	public Persona actualizarPersona(@RequestParam Long personaId, @RequestParam String nuevoNombre, @RequestParam String nuevoCorreo, @RequestParam Long direccionId) {
		return this.personaServicio.actualizarPersona(personaId, nuevoNombre, nuevoCorreo, direccionId);
	}
	
	@GetMapping(value = "leer-persona-top-por-id")
	public PersonaDTO retornarPersonaPorId(Long idPersona){
		return this.personaServicio.traerPersonaporId(idPersona);
	}
	
	@GetMapping(value = "personas-del-bio-bio")
	public List<PersonaProjection> retornarPersonaDelBioBio(){
		return this.personaServicio.personasDeLaRegionDelBioBio();
	}


}
