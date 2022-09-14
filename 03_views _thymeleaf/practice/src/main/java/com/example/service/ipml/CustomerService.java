package com.example.service.ipml;

import com.example.model.Customer;
import com.example.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerService implements ICustomerService {
    private static  final Map<Integer,Customer> customerList = new HashMap<>();

    static {
        customerList.put(1,new Customer(1,"Bảo","bao@123","Hà Tĩnh"));
        customerList.put(2,new Customer(2,"Quyết","quyet@123","Nghệ An"));
        customerList.put(3,new Customer(3,"Lợi","loi@123","Đà Nẵng"));
        customerList.put(4,new Customer(4,"Thành","thanh@123","Quảng Nam"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerList.values());
    }

    @Override
    public void save(Customer customer) {
       customerList.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerList.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customerList.remove(id);
    }
}
