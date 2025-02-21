package com.ecommerce.productcatalog.config;

import com.ecommerce.productcatalog.model.Category;
import com.ecommerce.productcatalog.model.Product;
import com.ecommerce.productcatalog.repository.CatgRepository;
import com.ecommerce.productcatalog.repository.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner
{
    @Autowired
    private ProdRepository productRepository;

    @Autowired
    private CatgRepository catgRepository;

    @Override
    public void run(String... args) throws Exception
    {
        productRepository.deleteAll();
        catgRepository.deleteAll();

        Category electronics=new Category();
        electronics.setName("television");

        Category automobile=new Category();
        automobile.setName("Car");

        Category home=new Category();
        home.setName("1BHK");

        catgRepository.saveAll(Arrays.asList(electronics,automobile,home));

        Product headGear=new Product();
        headGear.setName("helmet");
        headGear.setDescrp("Protect head");
        headGear.setImageUrl("");
        headGear.setPrice(2000);
        headGear.setCategory(automobile);

        Product ornament=new Product();
        ornament.setPrice(20000);
        ornament.setName("ring");
        ornament.setImageUrl("");
        ornament.setDescrp("Ring for your finger");
        ornament.setCategory(home);

        Product blender=new Product();
        blender.setPrice(20000);
        blender.setName("blending food");
        blender.setImageUrl("");
        blender.setDescrp("Blender for your home");
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(headGear,ornament,blender));
    }
}
