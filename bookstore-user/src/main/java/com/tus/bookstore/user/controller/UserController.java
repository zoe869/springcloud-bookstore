package com.tus.bookstore.user.controller;

import com.tus.bookstore.user.dao.UserDao;
import com.tus.bookstore.user.entity.User;
import com.tus.bookstore.user.service.CartService;
import com.tus.bookstore.user.service.UserService;
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
 */
@Api(tags = "user management")
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @Autowired
    private CartService cartService;

    @ApiOperation(value="user servcice call cart service")
    @GetMapping("hello")
    public String testFeign(){
        return cartService.testFeign();
    }

    /**
     *  list of all users
     */
    @ApiOperation("list of all users")
    @GetMapping()
    public ResponseEntity list(){
        List res=userDao.findAll();
        if (res.size()!=0){
            return new ResponseEntity(res, HttpStatus.OK);
        }
        else{
            return new ResponseEntity("Failed", HttpStatus.OK);
        }
    }


    /**
     * get user by id
     * @param userId
     * @return the user
     */
    @ApiOperation("get user by id")
    @GetMapping("/{userId}")
    public ResponseEntity info(@PathVariable("userId") int userId){
		Optional<User> user = userDao.findById(userId);
        return new ResponseEntity(user,HttpStatus.OK);
    }

    /**
     * create new user
     */
    @ApiOperation("create new user")
    @PostMapping("/user")
    public ResponseEntity save(@RequestBody User user){
        return new ResponseEntity(userDao.save(user),HttpStatus.OK);
    }

    /**
     * delete by user id
     * @param id
     * @return
     */
    @ApiOperation("delete user By Id")
    @DeleteMapping("/user/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        userDao.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
