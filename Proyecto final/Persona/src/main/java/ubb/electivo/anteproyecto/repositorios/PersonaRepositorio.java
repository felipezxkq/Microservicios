package ubb.electivo.anteproyecto.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ubb.electivo.anteproyecto.dto.PersonaDTO2;

import ubb.electivo.anteproyecto.entidades.Persona;


@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long>{
	



}
