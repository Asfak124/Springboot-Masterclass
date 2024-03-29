package com.example.demo.customer;

import com.example.demo.DemoApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService = new CustomerService();

    @GetMapping("/")
    Customer getCustomer()
    {
        return customerService.getCustomer()
    }
}
