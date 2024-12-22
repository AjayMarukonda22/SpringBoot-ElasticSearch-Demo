package org.example.elasticsearch.repositories;

import org.example.elasticsearch.models.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface ProductRepository extends ElasticsearchRepository<Product, Long> {

}
