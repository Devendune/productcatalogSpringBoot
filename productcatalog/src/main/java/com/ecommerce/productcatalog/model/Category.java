package com.ecommerce.productcatalog.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public int id() {
        return id;
    }

    public void setId(int category_id) {
        this.id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy="category",
    cascade =CascadeType.ALL,
            fetch=FetchType.LAZY
    )
    private Set<Product> products;

}
