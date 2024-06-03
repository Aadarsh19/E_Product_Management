package com.items.Electronic_Product_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.items.Electronic_Product_Management.Entity.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

}
