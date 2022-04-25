package com.tus.bookstore.cart.controller;

import com.tus.bookstore.cart.dao.CartDao;
import com.tus.bookstore.cart.entity.Cart;
import com.tus.bookstore.cart.service.CartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 * 
 *
 * @author qi zhong
 * @email A00291066@student.ait.ie
 * @date 2022-04-24 05:21:08
 */
@Api(tags = "cart management")
@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private CartDao cartDao;


    /**
     * get cart by uid
     * @param userId
     * @return the cart
     */
    @ApiOperation(value = "get cart information by user id")
    @GetMapping("/{userId}")
    public ResponseEntity info(@PathVariable("userId") int userId){
        Optional<Cart> cart = cartDao.findByCartUid(userId);
        if (cart.isPresent()){
            return new ResponseEntity(cart.get(),HttpStatus.OK);
        }
        return new ResponseEntity("no cart with user with "+ userId,HttpStatus.OK);
    }

    /**
     * create new cart
     */
    @ApiOperation(value = "create new cart")
    @PostMapping("/cart")
    public ResponseEntity save(@RequestBody Cart cart){
        return new ResponseEntity(cartDao.save(cart),HttpStatus.OK);
    }

    /**
     * delete by cart id
     * @param id
     * @return
     */
    @ApiOperation(value = "delete by cart id")
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id){
        cartDao.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation("")
    @GetMapping
    public ResponseEntity getall(){
        List<Cart> res = cartDao.findAll();
        return new ResponseEntity(res,HttpStatus.OK);
    }


}
