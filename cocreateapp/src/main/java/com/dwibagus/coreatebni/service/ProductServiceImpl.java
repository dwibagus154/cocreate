package com.dwibagus.coreatebni.service;

import com.dwibagus.coreatebni.dto.input.Input;
import com.dwibagus.coreatebni.dto.output.Output;
import com.dwibagus.coreatebni.model.Product;
import com.dwibagus.coreatebni.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    private ModelMapper modelMapper;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public void setModelMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    @Override
    public Output getOne(Long id){
        Product product = productRepository.getById(id);
        Output output = modelMapper.map(product, Output.class);

        return output;
    }
    @Override
    public Output addOne(Input input){
//        Product product = Product
//                .builder()
//                .name(input.getName())
//                .category(input.getCategory())
//                .price(input.getPrice())
//                .build();
        Product product = modelMapper.map(input, Product.class);
        productRepository.save(product);
//        return null;
        return modelMapper.map(input, Output.class);
    }

}
