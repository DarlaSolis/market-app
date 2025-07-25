package com.tecdesoftware.market.persistence.crud;

import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Esta anotación le dice a Spring que este archivo se enlaza con la BD
@Repository
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Obtener una lista de productos filtrados por id de categoría y ordenados ascendentemente por nombre
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStockIsLessThan, Boolean estado);
}