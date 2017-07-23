package com.herohuang.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CustomerServiceTest {

    private final com.herohuang.service.CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new com.herohuang.service.CustomerService();
    }

    @Before
    public void init(){

    }

    @Test
    public void getCustomerListTest() {
        List<com.herohuang.model.Customer> customerList = customerService.getCustomerList();
        Assert.assertNotNull(customerList);
        Assert.assertEquals(2,customerList.size());

    }
}
