package org.example.elasticsearch.controllers;

import org.example.elasticsearch.models.Product;
import org.example.elasticsearch.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{Id}")
    public Product search(@PathVariable("Id") Long id) {
        return productService.search(id);
    }
        @PostMapping
        public Product createProduct(@RequestBody Product product) {
         return productService.save(product);
    }
}
