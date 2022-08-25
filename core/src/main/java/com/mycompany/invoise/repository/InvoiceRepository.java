package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {
    private static List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice){
        invoices.add(invoice);

        System.out.println("La la facture a bien été aajouté");
    }
}
