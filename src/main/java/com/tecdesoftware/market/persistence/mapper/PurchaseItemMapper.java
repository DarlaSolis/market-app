package com.tecdesoftware.market.persistence.mapper;

import com.tecdesoftware.market.domain.PurchaseItem;
import com.tecdesoftware.market.persistence.entity.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses= {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProducto", target ="productId"),
            @Mapping(source = "cantidad", target ="quantity"),
            //Mapping(source = "total", target ="total"), no es necesario ya que tienen el mismo nombre
            @Mapping(source = "active", target ="estado"),
    })
    PurchaseItem toPurchaseItem(CompraProducto producto);

    //Como son lo mismo que la anterior pero a la inversa usaremos:
    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "id.idCompra", ignore = true), 
        @Mapping(target = "compra", ignore = true),
        @Mapping(target = "producto", ignore = true)
    })
    CompraProducto toCompraProducto(PurchaseItem item);
}


