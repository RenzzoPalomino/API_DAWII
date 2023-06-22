/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Categoria;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Renzzo
 */
@Service
public class CategoriaServiceImp {
    
    @Autowired
    CategoriaService categoriaservice;
    
    public ArrayList<Categoria> obtenerCategorias(){
        return (ArrayList<Categoria>)categoriaservice.findAll();
    }
    
    public Categoria guardarCategoria(Categoria cat){
        return categoriaservice.save(cat);
    }
    
    public Optional<Categoria> obtenerId(Integer id){
        return categoriaservice.findById(id);
    }
    
    public boolean eliminarCategoria(Integer id){
        try {
            categoriaservice.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
