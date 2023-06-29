/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.dao.ProductoDAO;
import com.example.demo.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Renzzo
 */
@Service
public class ProductoServiceImp implements ProductoService{

    @Autowired
    private ProductoDAO productodao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> listarproductos() {
        return (List<Producto>) productodao.findAll();
    }

    @Override
    @Transactional
    public void guardarProducto(Producto producto) {
        productodao.save(producto);
    }

    @Override
    @Transactional
    public boolean eliminarProductoPorID(Integer id) {
        try {
            productodao.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Producto> encontrarProducto(Integer producto) {
        return productodao.findById(producto);
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productodao.findById(id);
    }

    @Override
    public boolean eliminarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
