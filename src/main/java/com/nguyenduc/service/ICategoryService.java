package com.nguyenduc.service;

import com.nguyenduc.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(Long id);
}
