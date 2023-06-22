/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Renzzo
 */
@Repository
public interface UsuarioService {
     List<Usuario> findAll();
    public void guardarUsuario(Usuario usuario);
    Optional<Usuario> findbyId(Integer id);
    Optional<Usuario> findByEmail(String email);
}
