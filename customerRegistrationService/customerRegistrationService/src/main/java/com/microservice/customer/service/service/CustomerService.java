package com.microservice.customer.service.service;

import java.util.List;

import com.microservice.customer.service.DTO.ResponseDTO;
import com.microservice.customer.service.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    ResponseDTO addCustomer(Customer customer , String trackingId);
    ResponseDTO getCustomerById(String id , String trackingId);
    List<ResponseDTO> getAllCustomers(String trackingId);
    Customer updateCustomerById(String id,Customer customer);
    void deleteCustomerById(String id);
    Customer getByUsername(String username , String trackingId);
}