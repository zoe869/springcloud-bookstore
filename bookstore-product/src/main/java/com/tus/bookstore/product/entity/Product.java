package com.tus.bookstore.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "bs_product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name="PRODUCT_NAME")
    private String product_name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRODUCT_ID")
    private Integer id;
    @Column(name="PRODUCT_IMAGE")
    private String image;
    @Column(name="PRODUCT_PRICE")
    private Double price;
    @Column(name="PRODUCT_DESCRIPTION")
    private String description;

}
