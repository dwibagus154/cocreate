package com.dwibagus.coreatebni.controller;


import com.dwibagus.coreatebni.dto.category.CategoryDataType;
import com.dwibagus.coreatebni.dto.input.Input;
import com.dwibagus.coreatebni.dto.output.Output;
import com.dwibagus.coreatebni.service.CategoryService;
import com.dwibagus.coreatebni.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("{id}")
    public CategoryDataType getOne(@PathVariable Long id){
        return categoryService.getOne(id);
    }

    @PostMapping
    public String addOne(@RequestBody CategoryDataType input){
        categoryService.addOne(input);
        return "contoh";
    }
}
