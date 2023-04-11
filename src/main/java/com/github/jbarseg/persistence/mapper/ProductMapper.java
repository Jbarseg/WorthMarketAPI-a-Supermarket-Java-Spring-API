package com.github.jbarseg.persistence.mapper;

import java.util.List;

import com.github.jbarseg.persistence.entity.Category;
import org.mapstruct.*;

import com.github.jbarseg.domain.ProductDomain;
import com.github.jbarseg.persistence.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    String map(Category value);

    @Mappings({
        @Mapping(source = "idProduct", target = "productId"),
        @Mapping(source = "name", target = "productName"),
        @Mapping(source = "idCategory", target = "productCategoryId"),
        @Mapping(source = "salePrice", target = "productPrice"),
        @Mapping(source = "stock", target = "productStock"),
        @Mapping(source = "status", target = "productStatus"),
        @Mapping(source = "category", target = "productCategory"), 
    })

    ProductDomain toDomainProduct (Product product);
    List<ProductDomain> toDomainProducts(List<Product>products);

    @InheritInverseConfiguration
    @Mapping(target = "barCode", ignore = true)
    Product toProduct (ProductDomain productDomain);

    @Named("mapCategoryToString")
    default String mapCategoryToString(Category category) {
        return category.getDescription();
    }
}
