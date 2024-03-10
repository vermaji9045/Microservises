package com.example.service;

import com.example.DtoClass.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
    CustomerDto FetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
