package com.dwibagus.coreatebni.service;

import com.dwibagus.coreatebni.dto.category.CategoryDataType;
import com.dwibagus.coreatebni.dto.output.Output;
import com.dwibagus.coreatebni.model.Category;
import com.dwibagus.coreatebni.model.Product;
import com.dwibagus.coreatebni.repository.CategoryRepository;
import com.dwibagus.coreatebni.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;



    public void setModelMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoryDataType getOne(Long id){
        Category category = categoryRepository.getById(id);
        CategoryDataType output = modelMapper.map(category, CategoryDataType.class);

        return output;
    }

    @Override
    public CategoryDataType addOne(CategoryDataType input){

        Category category = modelMapper.map(input, Category.class);
        categoryRepository.save(category);
//        return null;
        return modelMapper.map(input, CategoryDataType.class);
    }
}
