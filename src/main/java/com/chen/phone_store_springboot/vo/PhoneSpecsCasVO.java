package com.chen.phone_store_springboot.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PhoneSpecsCasVO {

    /**
     * 借助工具类@JsonProperty把定义的属性转化为前端定义和识别的属性
     * 详细说明可以见PhoneCategoryVO
     */

    @JsonProperty("s1")
    private Integer specsId;

    @JsonProperty("price")
    private BigDecimal specsPrice;

    @JsonProperty("stock_num")
    private Integer specsStock;
}
