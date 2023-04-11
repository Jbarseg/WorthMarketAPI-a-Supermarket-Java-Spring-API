package com.github.jbarseg.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.github.jbarseg.domain.CategoryDomain;
import com.github.jbarseg.persistence.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
        @Mapping(source = "idCategory", target = "categoryId"),
        @Mapping(source = "description", target = "category"),
        @Mapping(source = "status", target = "categoryStatus"),
    })
    CategoryDomain toCategory (Category category);

    List<CategoryDomain> toCategoriesDomain (List<Category> categories);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    Category toDomainCategory (CategoryDomain category);
}