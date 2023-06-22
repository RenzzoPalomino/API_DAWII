/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.dao;

import com.example.demo.entity.Orden;
import com.example.demo.entity.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Renzzo
 */
public interface OrdenDao extends CrudRepository<Orden, Integer> {
    List<Orden> findByUsuario(Usuario usuario);
    
}
