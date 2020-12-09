package com.sertres.reporte.persistence.crud;

import com.sertres.reporte.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {

    List<Usuario> findByIdUsuario (int idUsuario);

}
