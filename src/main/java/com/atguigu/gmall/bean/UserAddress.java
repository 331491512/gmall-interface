package com.atguigu.gmall.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserAddress implements Serializable { // 注意序列化
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String userId;
    private String Address;
}
