package com.trinhtrung.library.service;

import com.trinhtrung.library.dto.CategoryDto;
import com.trinhtrung.library.model.Category;

import java.util.List;

public interface CategoryService {
    /*Admin*/
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enabledById(Long id);
    List<Category> findAllByActivated();

    /*Customer*/
    List<CategoryDto> getCategoryAndProduct();


}