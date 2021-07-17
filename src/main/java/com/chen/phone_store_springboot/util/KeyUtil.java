package com.chen.phone_store_springboot.util;

import java.util.Random;

public class KeyUtil {

    /**
     * synchronized确保线程安全不会有重复的，因为肯会生成多个订单
     * @return
     */
    public static synchronized String createUniqueKey(){
        Random random = new Random();
        Integer key = random.nextInt(900000)+100000; //随机数
        return System.currentTimeMillis() + String.valueOf(key); //系统生成时间毫秒数+转成string类型的随机数
    }
}
