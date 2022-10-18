package com.mycompany.invoise.core.repository;


import com.mycompany.invoise.core.entity.customer.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {

    /*Invoice create(Invoice invoice);

    Invoice getById(String number);

    List<Invoice> list();*/
}
