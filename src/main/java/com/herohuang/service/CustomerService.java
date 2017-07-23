package com.herohuang.service;

import com.herohuang.helper.DatabaseHelper;
import com.herohuang.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.List;

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);



    public List<Customer> getCustomerList() {
        Connection conn = DatabaseHelper.getConnection();
        try {
            String sql = "select * from customer";
            return DatabaseHelper.queryEntityList(Customer.class, conn, sql);
        } finally {
            DatabaseHelper.closeConncetion(conn);
        }
    }
}
