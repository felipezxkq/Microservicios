package ubb.electivo.anteproyecto.servicios;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ubb.electivo.anteproyecto.entidades.Ciudad;
import ubb.electivo.anteproyecto.entidades.Persona;
import ubb.electivo.anteproyecto.entidades.Direccion;
import ubb.electivo.anteproyecto.entidades.Region;
import ubb.electivo.anteproyecto.repositorios.PersonaRepositorio;
import ubb.electivo.anteproyecto.repositorios.DireccionRepositorio;
import ubb.electivo.anteproyecto.dto.PersonaDTO;
import ubb.electivo.anteproyecto.entidades.projections.PersonaProjection;


@Service
public class PersonaServicio {
	
	@Autowired
	private PersonaRepositorio personaRepositorio;
	public List<Persona> getAllPersona(){
		return this.personaRepositorio.findAll();
	}
	
	@Autowired
	private DireccionRepositorio direccionRepositorio;
	public List<Direccion> getAllDireccion(){
		return this.direccionRepositorio.findAll();
	}
	
	public Persona insertPersona(Persona persona) {
		this.personaRepositorio.save(persona);
		return persona;
	}
	
	public void eliminarPersona(long id)
	{
	    this.personaRepositorio.deleteById(id); 
	}
	
	public List<PersonaDTO> traerPersonaDto(){
		List<PersonaDTO> listPersonaDto = new LinkedList<>();
		for(Persona indexPersona: this.getAllPersona()) {
			PersonaDTO personaDto = new PersonaDTO();
			personaDto.setNombrePersona(indexPersona.getNombrePersona());
			personaDto.setEmail(indexPersona.getEmail());
			personaDto.setNombreDireccion(indexPersona.getDireccion().getNombreDireccion());
			personaDto.setNombreCiudad(indexPersona.getDireccion().getCiudad().getNombreCiudad());
			personaDto.setNombreProvincia(indexPersona.getDireccion().getCiudad().getProvincia().getNombreProvincia());
			personaDto.setNombreRegion(indexPersona.getDireccion().getCiudad().getProvincia().getRegion().getNombreRegion());
			listPersonaDto.add(personaDto);
		}
		return listPersonaDto;
	}
	
	public Persona actualizarPersona(Long personaId, String nuevoNombre, String nuevoEmail, Long nuevaDireccionId) {
		Optional<Persona> personaActualizadaOptional = this.personaRepositorio.findById(personaId);
		Optional<Direccion> direccionOptional = this.direccionRepositorio.findById(nuevaDireccionId);
		Persona personaActualizada = new Persona();
		Direccion nuevaDireccion = new Direccion();
		if(personaActualizadaOptional.isPresent()) {
			personaActualizada = personaActualizadaOptional.get();
			nuevaDireccion = direccionOptional.get();
			personaActualizada.setNombrePersona(nuevoNombre);
			personaActualizada.setEmail(nuevoEmail);
			personaActualizada.setDireccion(nuevaDireccion);
			this.personaRepositorio.save(personaActualizada);
		}
		return personaActualizada;
	}
	
	public PersonaDTO traerPersonaporId(Long personaId) {
		PersonaDTO personaDto = new PersonaDTO();
		Optional<Persona> personaOptional = this.personaRepositorio.findById(personaId);
				
		if(personaOptional.isPresent()) {
			Persona indexPersona = personaOptional.get();
			personaDto.setNombrePersona(indexPersona.getNombrePersona());
			personaDto.setEmail(indexPersona.getEmail());
			personaDto.setNombreDireccion(indexPersona.getDireccion().getNombreDireccion());
			personaDto.setNombreCiudad(indexPersona.getDireccion().getCiudad().getNombreCiudad());
			personaDto.setNombreProvincia(indexPersona.getDireccion().getCiudad().getProvincia().getNombreProvincia());
			personaDto.setNombreRegion(indexPersona.getDireccion().getCiudad().getProvincia().getRegion().getNombreRegion());			
		}		

		return personaDto;
	}
	
	public List<PersonaProjection> personasDeLaRegionDelBioBio() {
		return personaRepositorio.personasDeRegionBioBio();
		
	}


}
