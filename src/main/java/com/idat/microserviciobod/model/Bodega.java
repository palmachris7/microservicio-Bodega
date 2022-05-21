package com.idat.microserviciobod.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "Bodega")
@Entity
public class Bodega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBodega;
    private String nombreBodega;
}
