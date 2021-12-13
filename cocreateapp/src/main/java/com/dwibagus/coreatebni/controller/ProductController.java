package com.dwibagus.coreatebni.controller;


import com.dwibagus.coreatebni.dto.input.Input;
import com.dwibagus.coreatebni.dto.output.Output;
import com.dwibagus.coreatebni.service.ProductService;
import com.dwibagus.coreatebni.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping("{id}")
    public Output getOne(@PathVariable Long id){
        return productService.getOne(id);
    }

    @PostMapping
    public String addOne(@RequestBody Input input){
        productService.addOne(input);
        return "contoh";
    }


}
