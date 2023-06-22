/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.DetalleOrden;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Renzzo
 */
@Repository
public interface DetalleService {
    
    DetalleOrden save (DetalleOrden detalleOrden);
    List<DetalleOrden> findAll();
    
}
