package com.dwibagus.coreatebni.service;

import com.dwibagus.coreatebni.dto.category.CategoryDataType;

public interface CategoryService {
    CategoryDataType getOne(Long id);

    CategoryDataType addOne(CategoryDataType input);
}
