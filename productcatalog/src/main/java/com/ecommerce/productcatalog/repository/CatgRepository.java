package com.ecommerce.productcatalog.repository;

import com.ecommerce.productcatalog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatgRepository extends JpaRepository<Category,Integer>
{

}
