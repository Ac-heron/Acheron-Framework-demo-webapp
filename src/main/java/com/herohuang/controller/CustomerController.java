package com.herohuang.controller;

import com.herohuang.framework.annotation.Action;
import com.herohuang.framework.annotation.Controller;
import com.herohuang.framework.annotation.Inject;
import com.herohuang.framework.bean.Data;
import com.herohuang.framework.bean.Param;
import com.herohuang.framework.bean.View;
import com.herohuang.model.Customer;
import com.herohuang.service.CustomerService;

import java.util.List;
import java.util.Map;

/**
 * desc
 *
 * @author Acheron
 * @date 25/07/2017
 * @since 1.0.0
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index() {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer_list.jsp").addModel("customerList", customerList);
    }

    @Action("get:/ajax")
    public Data ajax(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        return new Data(customerList);
    }


    @Action("post:/customer_create")
    public Data createSubmit(Param param) {
        Map<String, Object> fieldMap = param.getMap();

        String result = null;
        return new Data(result);
    }
}
