package com.chen.phone_store_springboot.exception;

import com.chen.phone_store_springboot.enums.ResultEnum;

public class PhoneException extends RuntimeException {

    public PhoneException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
    }

    public PhoneException(String error) {
        super(error);
    }
}
