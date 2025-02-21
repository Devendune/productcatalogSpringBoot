package com.ecommerce.productcatalog.controller;

import com.ecommerce.productcatalog.model.Product;
import com.ecommerce.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController
{
    @Autowired
    ProductService productService;

    @GetMapping("/")
    private List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/category/{categoryId}")
    private List<Product> getAllProductsbyCatId(@PathVariable("categoryId") int id)
    {
        return productService.getProductsByCatId(id);
    }
}
