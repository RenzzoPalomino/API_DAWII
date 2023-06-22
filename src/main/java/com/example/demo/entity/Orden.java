package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Renzzo
 */
@Data
@Entity
@Table(name = "tb_orden")
public class Orden implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    
    @Column(name = "fechacreacion")
    private String fechaCreacion;
    @Column(name = "fecharecibida")
    private String fechaRecibida;
    private double total;
    
    @ManyToOne
    private Usuario usuario;
    
    @JsonIgnore
    @OneToMany(mappedBy = "orden")
    private List<DetalleOrden> detalleOrden;
}
