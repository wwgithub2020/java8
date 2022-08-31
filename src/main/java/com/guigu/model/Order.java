package com.guigu.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Date: 2022/6/9 22:22
 * @Description: Order
 * @Version 1.0.0
 */
@Data
public class Order implements Serializable {
    private Integer id;

    private Integer userId;

    private String name;

    private Double price;

    private Integer num;
}
