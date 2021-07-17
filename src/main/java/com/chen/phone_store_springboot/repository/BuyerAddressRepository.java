package com.chen.phone_store_springboot.repository;

import com.chen.phone_store_springboot.entity.BuyerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerAddressRepository extends JpaRepository<BuyerAddress,Integer> {
}
