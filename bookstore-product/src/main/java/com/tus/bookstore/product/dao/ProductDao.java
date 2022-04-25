package com.tus.bookstore.product.dao;

import com.tus.bookstore.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

//    @Modifying
//    @Query("update Product u set u.service = ?1 where u.lastname = ?2")
//    int setFixedFirstnameFor(String firstname, String lastname);
}
