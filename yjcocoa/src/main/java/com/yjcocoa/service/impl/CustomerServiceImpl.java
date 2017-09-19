package com.yjcocoa.service.impl;

import com.yjcocoa.mapper.CustomerMapper;
import com.yjcocoa.po.Customer;
import com.yjcocoa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * CustomerServiceImpl.java
 * <p>
 * Created by didi on 2017/9/15.
 * Copyright © 2017年 YJCocoa. All rights reserved.
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public void addCustomer(Customer customer) {
        this.customerMapper.addCustomer(customer);
        int i = 1/0;// 事务回滚
    }

}