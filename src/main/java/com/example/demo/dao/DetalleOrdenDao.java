/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.dao;

import com.example.demo.entity.DetalleOrden;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Renzzo
 */
public interface DetalleOrdenDao extends CrudRepository<DetalleOrden, Integer> {
    
}
