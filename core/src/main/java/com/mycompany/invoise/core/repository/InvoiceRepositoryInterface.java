package com.mycompany.invoise.core.repository;


import com.mycompany.invoise.core.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface{
    void create(Invoice invoice);

    Invoice getById(String number);

    List<Invoice> list();
}
