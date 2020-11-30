package ubb.electivo.anteproyecto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ubb.electivo.anteproyecto.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
