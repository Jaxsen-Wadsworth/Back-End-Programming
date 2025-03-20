package com.example.demo.bootstrap;

import com.example.demo.dao.*;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private CustomerRepository customerRepository;
    private CartRepository cartRepository;

    public BootStrapData(CustomerRepository customerRepository, CartRepository cartRepository) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (customerRepository.count() == 1) {
            Customer Alpha = new Customer("Alpha", "A", "123 My Street", "12345", "0123456789");
            customerRepository.save(Alpha);
            Customer Beta = new Customer("Beta", "B", "123 My Street", "12345", "0123456789");
            customerRepository.save(Beta);
            Customer Lambda = new Customer("Lambda", "L", "123 My Street", "12345", "0123456789");
            customerRepository.save(Lambda);
            Customer Delta = new Customer("Delta", "D", "123 My Street", "12345", "0123456789");
            customerRepository.save(Delta);
            Customer Omega = new Customer("Omega", "O", "123 My Street", "12345", "0123456789");
            customerRepository.save(Omega);
        }
//        System.out.print("Started in Bootstrap");
//        System.out.print("Number of Customers" + customerRepository.count());
    }
}
