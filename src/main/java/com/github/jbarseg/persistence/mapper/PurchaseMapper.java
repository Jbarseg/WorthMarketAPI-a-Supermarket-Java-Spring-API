package com.github.jbarseg.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.github.jbarseg.domain.PurchaseDomain;
import com.github.jbarseg.persistence.entity.Purchase;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
    @Mappings ({
        @Mapping(source = "idPurchase", target = "purchaseId"),
        @Mapping(source = "idClient", target = "clientId"),
        @Mapping(source = "date", target = "purchaseDateTime"),
        @Mapping(source = "paymentMethod", target = "purchasePaymentMethod"),
        @Mapping(source = "comment", target = "purchaseComment"),
        @Mapping(source = "status", target = "purchaseStatus"),
        @Mapping(source = "products", target = "purchaseItems")
    })

    PurchaseDomain toPurchaseDomain(Purchase purchase);

    List<PurchaseDomain> toPurchasesDomain (List<Purchase> purchases);

    @InheritInverseConfiguration
    @Mapping(target = "client", ignore = true)
    Purchase toPurchase (PurchaseDomain purchaseDomain);
}
