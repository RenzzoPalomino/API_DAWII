/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.DetalleOrden;
import com.example.demo.entity.Orden;
import com.example.demo.service.DetalleServiceImp;
import com.example.demo.service.OrdenServiceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Renzzo
 */
@RestController
@RequestMapping("/Orden")
public class OrdenController {
    @Autowired
    private OrdenServiceImp repo;
    
    @Autowired
    DetalleServiceImp repodetalle;
    
    @GetMapping("/list")
    public List<Orden> obtenerOrdenes(){
        return repo.findAll();
    }
    @GetMapping("/Detalle/list")
    public List<DetalleOrden> obtenerDetalleOrden(){
        return repodetalle.findAll();
    }
    
    
}
