package com.github.jbarseg.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.github.jbarseg.domain.PurchaseItemDomain;
import com.github.jbarseg.persistence.entity.ProductPurchase;

@Component
@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
        @Mapping(source = "id.idProduct", target = "productId"),
        @Mapping(source = "amount", target = "stock"),
        @Mapping(source = "total", target = "totalCost"),
        @Mapping(source = "status", target = "itemStatus")
    })
    PurchaseItemDomain toPurchaseItem (ProductPurchase productPurchase);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "purchase", ignore = true),
        @Mapping(target = "product", ignore = true),
        @Mapping(target = "id.idPurchase", ignore = true),
    })
    ProductPurchase toProductPurchase (PurchaseItemDomain purchaseItemDomain);
}
