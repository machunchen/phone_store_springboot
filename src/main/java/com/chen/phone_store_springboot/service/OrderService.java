package com.chen.phone_store_springboot.service;

import com.chen.phone_store_springboot.dto.OrderDTO;
import com.chen.phone_store_springboot.vo.OrderDetailVO;

public interface OrderService {

    public OrderDTO create(OrderDTO orderDTO);

    public OrderDetailVO findOrderDetailByOrderId(String orderId);

    public String pay(String orderId);
}
