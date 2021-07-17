package com.chen.phone_store_springboot.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class PhoneInfoVO {

    /**
     * 借助工具类@JsonProperty把定义的属性转化为前端定义和识别的属性
     * 详细说明可以见PhoneCategoryVO
     */
    @JsonProperty("id")
    private Integer phoneId;

    @JsonProperty("title")
    private String phoneName;

    @JsonProperty("price")
    private String phonePrice;

    @JsonProperty("desc")
    private String phoneDescription;

    private List<Map<String,String>> tag;

    @JsonProperty("thumb")
    private String phoneIcon;
}
