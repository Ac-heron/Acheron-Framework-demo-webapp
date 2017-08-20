package com.herohuang.service;

import com.herohuang.framework.annotation.Service;
import com.herohuang.framework.annotation.Transaction;
import com.herohuang.framework.bean.FileParam;
import com.herohuang.framework.helper.DatabaseHelper;
import com.herohuang.framework.helper.UploadHelper;
import com.herohuang.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    public List<Customer> getCustomerList() {
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    @Transaction
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    @Transaction
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    @Transaction
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }

    @Transaction
    public boolean createCustomer(Map<String, Object> fieldMap, FileParam fileParam) {
        boolean b = DatabaseHelper.insertEntity(Customer.class, fieldMap);
        if (b) {
            UploadHelper.uploadFile("/tmp/upload", fileParam);
        }
        return b;
    }
}
