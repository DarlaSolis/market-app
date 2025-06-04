package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    //Estamos implementando la interface
    private ProductoCrudRepository productoCrudRepository;

    //Equivalente a poner Select * From productos
    public List<Producto> getAll(){
        //Castea de iterable a lista
       return (List<Producto>) productoCrudRepository.findAll();
    }
}
