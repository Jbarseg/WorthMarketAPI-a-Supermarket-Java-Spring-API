package com.github.jbarseg.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.jbarseg.domain.CategoryDomain;
import com.github.jbarseg.domain.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/all")
    public ResponseEntity<List<CategoryDomain>> getAll() {
        return new ResponseEntity<>(categoryService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<CategoryDomain> save (@RequestBody CategoryDomain categoryDomain){
        return new ResponseEntity<>(categoryService.save(categoryDomain), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{categoryId}")
    public ResponseEntity delete (@PathVariable("categoryId") int categoryId){
        if (categoryService.delete(categoryId)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
