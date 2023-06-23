package com.example.demo.controller;

import com.example.demo.entity.Categoria;
import com.example.demo.service.CategoriaService;
import com.example.demo.service.CategoriaServiceImp;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renzzo
 */
@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    CategoriaServiceImp categoriaservice;
    
    @GetMapping("/list")
    public ArrayList<Categoria> obtenerCategorias(){
        return categoriaservice.obtenerCategorias();
    }
    
    
//    @GetMapping("/listById")        //de este modo: http://localhost:8080/categoria/listById?id=1
//    public Optional<Categoria> obtenerCategoriaxId(@RequestParam("id") Integer id){
//        return categoriaservice.obtenerId(id);
//    }
    
    @GetMapping(path = "/{id}")        //de este modo: http://localhost:8080/categoria/1
    public Optional<Categoria> obtenerCategoriaxId(@PathVariable("id") Integer id){
        return categoriaservice.obtenerId(id);
    }
    
    
    @PostMapping("/save")
    public Categoria guardarCategoria(@RequestBody Categoria cat){
        return this.categoriaservice.guardarCategoria(cat);
    }
    
    
    @DeleteMapping(path = "/eliminar/{id}") //
    public String EliminarCategoria(@PathVariable("id") Integer id){          
        boolean ok=this.categoriaservice.eliminarCategoria(id);
        if(ok){
            return "Se elimino la categoria de id " + id;
        }
        else{
            return "Error en la eliminacion. " +id;
        }
        
    }
    
    
}
