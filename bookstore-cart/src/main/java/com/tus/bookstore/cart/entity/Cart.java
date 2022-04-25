package com.tus.bookstore.cart.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.persistence.*;


/**
 * 
 *
 */

@Data
@Entity
@Table(name = "bs_cart")
public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CART_ID")
	private Integer cartId;
	/**
	 * 
	 */
	@Column(name="CART_PID")
	private Integer cartPid;

	/**
	 *
	 */
	@Column(name="CART_PNAME")
	private String cartPname;
	/**
	 *
	 */
	@Column(name="CART_UID")
	private Integer cartUid;

	@Column(name="PRODUCT_NAME")
	private String cartName;
	/**
	 *
	 */
	@Column(name="TOTAL_PRICE")
	private double totalPrice;
	/**
	 *
	 */
	@Column(name="CART_QUANTITY")
	private Integer cartQuantity;
}
