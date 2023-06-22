/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Renzzo
 */
@Repository
public interface ProductoService{
    public List<Producto> listarproductos(); 
    public void guardarProducto(Producto producto);
    public boolean eliminarProductoPorID(Integer id);
    public boolean eliminarProducto(Producto producto);
    public Producto encontrarProducto(Producto producto);
    public Optional<Producto> get(Integer id);
}
