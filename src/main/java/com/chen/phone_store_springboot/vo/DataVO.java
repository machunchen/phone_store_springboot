package com.chen.phone_store_springboot.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataVO {

    private List<PhoneCategoryVO> categories;

    private List<PhoneInfoVO> phones;
}
