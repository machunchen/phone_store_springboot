package com.chen.phone_store_springboot.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PhoneCategoryVO {

    /**
     * 这里定义的类名（categoryName和categoryType）必须与PhoneCategory里的一致
     * 但前端定义和识别的是name和type,所以就需要借助工具类@JsonProperty来把
     * categoryName转化为name，把categoryType转化为type
     */
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;
}
