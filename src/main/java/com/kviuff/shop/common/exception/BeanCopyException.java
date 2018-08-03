package com.kviuff.shop.common.exception;

public class BeanCopyException extends RuntimeException {

    public BeanCopyException(){
        super();
    }

    public BeanCopyException(Exception e){
        super(e);
    }
}
