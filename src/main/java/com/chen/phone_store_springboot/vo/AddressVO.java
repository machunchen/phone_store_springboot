package com.chen.phone_store_springboot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //带参构造
public class AddressVO {

    private Integer id;
    private String areaCode;
    private String name;
    private String tel;
    private String address;
}
