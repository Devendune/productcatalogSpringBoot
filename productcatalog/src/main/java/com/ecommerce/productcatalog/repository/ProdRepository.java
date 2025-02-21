package com.ecommerce.productcatalog.repository;

import com.ecommerce.productcatalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdRepository extends JpaRepository<Product,Integer>
{
    public List<Product> findByCategoryId(int categoryId);
}
