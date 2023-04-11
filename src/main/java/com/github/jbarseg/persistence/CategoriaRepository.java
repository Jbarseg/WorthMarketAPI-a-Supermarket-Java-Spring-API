package com.github.jbarseg.persistence;

import java.util.List;
import java.util.Optional;

import org.checkerframework.checker.nullness.Opt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.jbarseg.domain.CategoryDomain;
import com.github.jbarseg.domain.repository.CategoryRepository;
import com.github.jbarseg.persistence.crud.CategoryCrudRepository;
import com.github.jbarseg.persistence.entity.Category;
import com.github.jbarseg.persistence.mapper.CategoryMapper;

@Repository
public class CategoriaRepository implements CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDomain> getAll() {
        List<Category> categories = (List<Category>) categoryCrudRepository.findAll();
        return categoryMapper.toCategoriesDomain(categories);
    }

    @Override
    public CategoryDomain save(CategoryDomain categoryDomain) {
        Category category = categoryMapper.toDomainCategory(categoryDomain);
        return categoryMapper.toCategory(categoryCrudRepository.save(category));
    }

    @Override
    public void delete(int idCategory) {
        categoryCrudRepository.findById(idCategory);
    }

    @Override
    public Optional<CategoryDomain> getCategory(int idCategory){
        return categoryCrudRepository.findById(idCategory).map(category -> categoryMapper.toCategory(category));
    }
}
