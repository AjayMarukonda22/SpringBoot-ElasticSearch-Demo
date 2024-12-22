package org.example.elasticsearch.services;

import org.example.elasticsearch.models.Product;
import org.example.elasticsearch.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product search(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isEmpty())
            return null;
        Product product = optionalProduct.get();
        return product;
    }
    public Product save(Product product) {
        return  productRepository.save(product);
    }
}
