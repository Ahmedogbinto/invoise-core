package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepository;

public class InvoiceServiceMichel {
    private InvoiceRepository invoiceRepository = new InvoiceRepository();

    private static long lastNumber = 112L;

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf("INV_"+(++lastNumber)));

        invoiceRepository.create(invoice);

        System.out.println("la facture a bien été ajouté, le nom du client c'est "+invoice.getCustomerName()+" et le numero de facture est "+invoice.getNumber());
    }







}
