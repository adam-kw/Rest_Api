package com.example.kzad4.service.impl;

import com.example.kzad4.domain.dao.Product;
import com.example.kzad4.repository.ProductRepository;
import com.example.kzad4.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product findProduct(Long id) {
        return productRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Product not found by id: " + id));
    }

    @Override
    public Page<Product> getPage(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product, Long id) {
        Product tempProduct = findProduct(id);
        tempProduct.setPrice(product.getPrice());
        tempProduct.setDescription(product.getDescription());
        return saveProduct(tempProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
