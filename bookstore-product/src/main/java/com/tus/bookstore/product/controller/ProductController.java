package com.tus.bookstore.product.controller;

import com.tus.bookstore.product.dao.ProductDao;
import com.tus.bookstore.product.entity.Product;
import com.tus.bookstore.product.util.SysResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = "product management")
@EnableHystrix
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    /**
     * get all products information
     * @return
     */
    @ApiOperation(value = "get all products")
    @GetMapping()
    public List<Product> getList(){
        return productDao.findAll();
    }

    /**
     * delete product by id
     * @param id
     * @return
     */
    @ApiOperation(value = "delete product by id")
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id){
        productDao.deleteById(id);
        return new ResponseEntity("delete successful!",HttpStatus.OK);
    }

    @ApiOperation(value = "get product by id")
    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable("id") Integer id){
        return new ResponseEntity(productDao.findById(id),HttpStatus.OK);
    }


    /**
     * create new product
     * @param product
     * @return
     */
    @ApiOperation(value = "create new product")
    @PostMapping
    public ResponseEntity save(@RequestBody Product product){
        Product res = productDao.save(product);
        if (res!=null) {
            productDao.save(product);
            return new ResponseEntity<Product>(productDao.save(product), HttpStatus.OK);
        }
        return new ResponseEntity("Failed to create Product",HttpStatus.OK);
    }




}
