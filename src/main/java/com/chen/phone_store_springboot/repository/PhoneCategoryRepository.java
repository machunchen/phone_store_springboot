package com.chen.phone_store_springboot.repository;

import com.chen.phone_store_springboot.entity.PhoneCategory;
import org.springframework.data.jpa.repository.JpaRepository;

//第一个参数是实体类的类型，第二个类型是主键的类型
public interface PhoneCategoryRepository extends JpaRepository<PhoneCategory,Integer> {
    public PhoneCategory findByCategoryType(Integer categoryType);
}
