package com.tus.bookstore.user.entity;


import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;

import javax.persistence.*;

/**
 * 
 * 
 * @author qi zhong
 * @email A00291066@student.ait.ie
 * @date 2022-04-24 05:21:09
 */
@Data
@Entity
@Table(name = "bs_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;
	/**
	 * 
	 */
	private String userPassword;
	/**
	 * 
	 */
	private String userName;
	/**
	 * 
	 */
	private String userSex;
	/**
	 * 
	 */
	private String userAddress;
	/**
	 * 
	 */
	private Integer userStatus;
	/**
	 *
	 */
	private String UserEmail;

}
