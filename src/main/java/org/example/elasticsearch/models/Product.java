package org.example.elasticsearch.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "products")
public class Product {
    @Id
   private Long id;
    private String title;
    private String description;
    private String category;
    private String image;
    private double price;
}
