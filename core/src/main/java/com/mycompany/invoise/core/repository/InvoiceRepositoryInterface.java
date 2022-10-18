package com.mycompany.invoise.core.repository;


import com.mycompany.invoise.core.entity.invoice.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {

// "invoice.customer" est le nom de l'EntityGraph que nous voulons suivre
    @EntityGraph(value = "invoice.customer" , type = EntityGraph.EntityGraphType.FETCH) //fetch invoice.customer nous permet d'éviter les proxy au niveau de la classe customer
    Iterable<Invoice> findAll();

    /*Invoice create(Invoice invoice);

    Invoice getById(String number);

    List<Invoice> list();*/
}
