package com.tus.bookstore.cart;

import com.netflix.discovery.converters.Auto;
import com.tus.bookstore.cart.dao.CartDao;
import com.tus.bookstore.cart.entity.Cart;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookstoreCartApplicationTests {


    private RestTemplate restTemplate;

    @Autowired
    private CartDao cartDao;
    @Test
    public void contextLoads() {
        Cart cart = new Cart();
        cart.setCartId(1);
        cart.setCartPid(1);
        cart.setCartUid(1);
        cart.setCartName("ds");
        cart.setCartPname("pname");
        cart.setCartQuantity(1);
        cart.setTotalPrice(100);
        cartDao.save(cart);
    }

    public void teste(){

    }

    @Test
    public void testController(){

    }


}
