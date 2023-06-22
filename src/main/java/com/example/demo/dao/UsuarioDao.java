package com.example.demo.dao;

import com.example.demo.entity.Usuario;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Renzzo
 */
public interface UsuarioDao extends CrudRepository<Usuario, Integer>{
    Optional<Usuario> findByEmail(String email);
    
}
