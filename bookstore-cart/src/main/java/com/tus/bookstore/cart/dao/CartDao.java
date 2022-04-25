package com.tus.bookstore.cart.dao;

import com.tus.bookstore.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 
 * 
 * @author qi zhong
 * @email A00291066@student.ait.ie
 * @date 2022-04-24 05:21:08
 */
@Repository
public interface CartDao extends JpaRepository<Cart,Integer> {

    Optional<Cart> findByCartUid(int userId);
}
