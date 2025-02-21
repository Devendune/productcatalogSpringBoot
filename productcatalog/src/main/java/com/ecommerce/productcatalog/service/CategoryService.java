package com.ecommerce.productcatalog.service;

import com.ecommerce.productcatalog.model.Category;
import com.ecommerce.productcatalog.repository.CatgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService
{
    @Autowired
    private CatgRepository catgRepository;

    public List<Category> getAllCategories()
    {
        return catgRepository.findAll();
    }
}
