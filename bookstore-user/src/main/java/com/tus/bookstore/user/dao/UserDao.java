package com.tus.bookstore.user.dao;

import com.tus.bookstore.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * @author qi zhong
 * @email A00291066@student.ait.ie
 * @date 2022-04-24 05:21:09
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {
	
}
