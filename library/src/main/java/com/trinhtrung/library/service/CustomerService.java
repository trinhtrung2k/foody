package com.trinhtrung.library.service;

import com.trinhtrung.library.dto.CustomerDto;
import com.trinhtrung.library.model.Customer;

public interface CustomerService {

    CustomerDto save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer saveInfor(Customer customer);
}

