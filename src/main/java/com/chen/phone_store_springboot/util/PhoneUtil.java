package com.chen.phone_store_springboot.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneUtil {

    public static List<Map<String,String>> createTag(String tag){
        //用&对tags数组进行分割
        String[] tags = tag.split("&");
        //将数组转成list集合
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map;
        for (String s : tags) {
            map = new HashMap<>();
            map.put("name",s);
            list.add(map);
        }
        return list;
    }
}
