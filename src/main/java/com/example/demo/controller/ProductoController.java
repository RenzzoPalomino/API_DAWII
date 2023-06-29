/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoServiceImp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Renzzo
 */
@RestController
@RequestMapping("/Producto")
public class ProductoController {
    
    @Autowired
    private ProductoServiceImp repo;
    
    @GetMapping("/list")
    public List<Producto> obtenerCategorias(){
        return repo.listarproductos();
    }
    
    @GetMapping(path = "/list/{id}")
    public Optional<Producto> obtenerById(@PathVariable("id")Integer id){
        return repo.encontrarProducto(id);
    }
    
    @PostMapping("/save")
    public String guardarProducto(@RequestBody Producto producto){
        repo.guardarProducto(producto);
        
        return "Producto "+producto.getNombre()+" guardado.";
    }
    
    
    @DeleteMapping("/delete/{id}")
    public String eliminarProducto(@PathVariable("id") Integer id){
        try {
            repo.eliminarProductoPorID(id);
            return "Registro de codigo: "+id+" eliminado correctamente";
        } catch (Exception e) {
            return "error en la eliminacion";
        }
    }
    
    
    
}
