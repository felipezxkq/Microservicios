package ubb.electivo.anteproyecto.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ubb.electivo.anteproyecto.entidades.*;

@Repository
public interface TrabajoMaterialRepositorio extends JpaRepository<Trabajo_material, Long>{
	


}
