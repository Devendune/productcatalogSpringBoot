package com.ecommerce.productcatalog.service;

import com.ecommerce.productcatalog.model.Product;
import com.ecommerce.productcatalog.repository.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProdRepository prodRepository;

    public List<Product> getAllProducts()
    {
        return prodRepository.findAll();
    }


    public List<Product> getProductsByCatId(int id)
    {
        return prodRepository.findByCategoryId(id);
    }

}
