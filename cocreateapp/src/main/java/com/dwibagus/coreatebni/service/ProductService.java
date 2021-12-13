package com.dwibagus.coreatebni.service;

import com.dwibagus.coreatebni.dto.input.Input;
import com.dwibagus.coreatebni.dto.output.Output;

import java.util.List;

public interface ProductService {
    Output getOne(Long id);


    Output addOne(Input input);

}