/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.Producto;
import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioServiceImp;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Renzzo
 */
@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioServiceImp repo;
    
   
    
    
    @GetMapping("/list") 
    public List<Usuario> buscarUsuario(){
        return repo.findAll();
    }
    
    
    @GetMapping(path = "/{id}") 
    public Optional<Usuario> buscarPorID(@PathVariable("id") Integer id){
        return repo.findbyId(id);
    }
    
    @GetMapping("/listByEmail") //http://localhost:8083/Usuario/listByEmail?email=admin@gmail.com
    public Optional<Usuario> buscarPorEmail(@RequestParam("email") String email){
        return repo.findByEmail(email);
    }
    
    //para creacion
    @PostMapping("/save")
    public String guardarUsuario(@RequestBody Usuario bean){
        bean.setUsername(UserTransform(bean.getNombre(), bean.getEmail()));
         this.repo.guardarUsuario(bean);
         return "Usuario "+bean.getNombre() +" guardado";
    }
    
    public String UserTransform(String nombre, String email){
        
            String first =nombre.substring(0, 3).toLowerCase();
            String second = email.substring(email.length() - 3).toLowerCase();
           return first + second;
    }
    
    
}
