package com.atguigu.gmall.service;

import java.util.List;

import com.atguigu.gmall.bean.UserAddress;

public interface OrderService {
    /**
     * 初始化
     * @param userId
     * @return
     */
    public List<UserAddress> initOrder(String userId);

    public String sayHellow();
}
