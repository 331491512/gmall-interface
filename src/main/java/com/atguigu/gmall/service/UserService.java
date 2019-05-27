package com.atguigu.gmall.service;

import java.util.List;

import com.atguigu.gmall.bean.UserAddress;

public interface UserService {
    /**
     * 获取用户地址列表
     * 
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
