package com.example.kzad4.service;

import com.example.kzad4.domain.dao.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Product findProduct(Long id);
    Page<Product> getPage(Pageable pageable);
    Product saveProduct(Product product);
    Product updateProduct(Product product, Long id);
    void deleteProduct(Long id);

}
