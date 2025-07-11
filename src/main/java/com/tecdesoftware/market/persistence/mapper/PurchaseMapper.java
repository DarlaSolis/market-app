package com.tecdesoftware.market.persistence.mapper;

import com.tecdesoftware.market.domain.Purchase;
import com.tecdesoftware.market.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "idCompra", target ="purchaseId"),
            @Mapping(source = "idCliente", target ="clientId"),
            @Mapping(source = "fecha", target ="purchaseDate"),
            @Mapping(source = "medioPago", target ="paymentMethod"),
            @Mapping(source = "comentario", target ="comment"),
            @Mapping(source = "estado", target ="state"),
            @Mapping(source = "productos", target ="items"),

    })
    Purchase toPurchase(Compra compra);

    //Recibe una lista de compras y las traduce a Purchases
    List<Purchase> toPurchases(List<Compra> compras);
    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore= true)
    Compra toCompra(Purchase purchase);

}
