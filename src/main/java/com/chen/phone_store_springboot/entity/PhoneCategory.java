package com.chen.phone_store_springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class PhoneCategory {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Integer categoryId;

    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
