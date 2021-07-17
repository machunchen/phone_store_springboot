package com.chen.phone_store_springboot.repository;

import com.chen.phone_store_springboot.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
