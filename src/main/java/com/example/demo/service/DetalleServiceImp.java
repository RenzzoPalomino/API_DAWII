/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.dao.DetalleOrdenDao;
import com.example.demo.entity.DetalleOrden;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Renzzo
 */
@Service
public class DetalleServiceImp implements DetalleService{

    @Autowired
    private DetalleOrdenDao detalleordenDao;
    
    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleordenDao.save(detalleOrden);
    }

    @Override
    public List<DetalleOrden> findAll() {
        return (List<DetalleOrden>) detalleordenDao.findAll();
    }
    
    
    
}
