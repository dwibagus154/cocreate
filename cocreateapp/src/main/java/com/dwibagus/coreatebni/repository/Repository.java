package com.dwibagus.coreatebni.repository;

import com.dwibagus.coreatebni.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Product, Long> {
}
