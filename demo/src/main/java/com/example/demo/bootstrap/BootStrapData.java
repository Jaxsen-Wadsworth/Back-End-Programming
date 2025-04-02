package com.example.demo.bootstrap;

import com.example.demo.dao.*;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BootStrapData implements CommandLineRunner {
    private CustomerRepository customerRepository;
    private CartRepository cartRepository;
    private final DivisionRepository divisionRepository;
    private Division division;
   // private List<Division> divisionList = null;

    @Autowired
    public BootStrapData(CustomerRepository customerRepository, CartRepository cartRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Division> divisionList = divisionRepository.findAll();
        if (customerRepository.count() == 1) {
            Customer Alpha = new Customer("Alpha", "A", "123 My Street", "12345", "0123456789");
            Alpha.setDivision(divisionList.get(0));//-2 accounts for the missing elements (0,1) in database
            customerRepository.save(Alpha);
            Customer Beta = new Customer("Beta", "B", "123 My Street", "12345", "0123456789");
            Beta.setDivision(divisionList.get(66));
            customerRepository.save(Beta);
            Customer Lambda = new Customer("Lambda", "L", "123 My Street", "12345", "0123456789");
            Lambda.setDivision(divisionList.get(52));
            customerRepository.save(Lambda);
            Customer Delta = new Customer("Delta", "D", "123 My Street", "12345", "0123456789");
            Delta.setDivision(divisionList.get(15));
            customerRepository.save(Delta);
            Customer Omega = new Customer("Omega", "O", "123 My Street", "12345", "0123456789");
            Omega.setDivision(divisionList.get(34));
            customerRepository.save(Omega);
        }
//        System.out.print("Started in Bootstrap");
//        System.out.print("Number of Customers" + customerRepository.count());
    }
}
