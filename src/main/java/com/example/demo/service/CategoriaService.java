/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Categoria;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Renzzo
 */
@Repository
public interface CategoriaService extends CrudRepository<Categoria, Integer>{
    
  //  public abstract ArrayList<Categoria> findByCodigo(Integer codigo);
}
