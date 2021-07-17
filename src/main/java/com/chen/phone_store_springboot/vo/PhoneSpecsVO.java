package com.chen.phone_store_springboot.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PhoneSpecsVO {

    /**
     * 借助工具类@JsonProperty把定义的属性转化为前端定义和识别的属性
     * 详细说明可以见PhoneCategoryVO
     */

    @JsonProperty("id")
    private Integer specsId;

    @JsonProperty("name")
    private String specsName;

    @JsonProperty("imgUrl")
    private String specsIcon;

    @JsonProperty("previewImgUrl")
    private String specsPreview;
}
