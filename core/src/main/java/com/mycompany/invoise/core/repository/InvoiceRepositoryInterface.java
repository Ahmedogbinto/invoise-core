package com.mycompany.invoise.core.repository;


import com.mycompany.invoise.core.entity.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

import java.util.List;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {
    /*Invoice create(Invoice invoice);

    Invoice getById(String number);

    List<Invoice> list();*/
}
