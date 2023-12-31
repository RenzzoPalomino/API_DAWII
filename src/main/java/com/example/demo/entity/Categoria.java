/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Renzzo
 */

@Data
@Entity
@Table(name="categoria")
public class Categoria {
     private static final long serialVersionUID=1L;

	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_categoria")
	private Integer codigo;
	@Column(name = "nombre_categoria")
	private String categoria;
}
