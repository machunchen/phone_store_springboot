package com.chen.phone_store_springboot.service;

import com.chen.phone_store_springboot.vo.DataVO;
import com.chen.phone_store_springboot.vo.PhoneInfoVO;
import com.chen.phone_store_springboot.vo.SpecsPackageVO;

import java.util.List;

public interface PhoneService {

    public DataVO findDataVO();

    public List<PhoneInfoVO> findPhoneInfoVOByCategoryType(Integer categoryType);

    public SpecsPackageVO findSpecsByPhoneId(Integer phoneId);

    //减库存（Stock）
    public void subStock(Integer specsId,Integer quantity);

}
