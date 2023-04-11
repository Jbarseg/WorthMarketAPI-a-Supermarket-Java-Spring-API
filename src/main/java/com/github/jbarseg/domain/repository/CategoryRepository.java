package com.github.jbarseg.domain.repository;

import java.util.List;
import java.util.Optional;

import com.github.jbarseg.domain.CategoryDomain;

public interface CategoryRepository {
    List<CategoryDomain> getAll();
    CategoryDomain save (CategoryDomain categoryDomain);
    Optional<CategoryDomain> getCategory(int categoryDomainId);
    void delete (int idCategory);
    
}
