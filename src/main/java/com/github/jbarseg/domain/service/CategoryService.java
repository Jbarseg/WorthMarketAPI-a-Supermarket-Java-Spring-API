package com.github.jbarseg.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.jbarseg.domain.CategoryDomain;
import com.github.jbarseg.domain.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDomain> getAll(){
        return categoryRepository.getAll();
    }

    public CategoryDomain save (CategoryDomain categoryDomain){
        return categoryRepository.save(categoryDomain);
    }

    private Optional<CategoryDomain> getCategory(int categoryId) {
        return categoryRepository.getCategory(categoryId);
    }

    public boolean delete (int productId){
        if (getCategory(productId).isPresent()){
            categoryRepository.delete(productId);
            return true;
        } else {
            return false;
        }
    }
    
}
