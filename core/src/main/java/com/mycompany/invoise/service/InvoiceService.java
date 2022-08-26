package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepository;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceService implements InvoiceServiceInterface {

    private InvoiceRepository invoiceRepository = new InvoiceRepository();
    private static long lastNumber = 0L;

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));

        invoiceRepository.create(invoice);

        System.out.println("la facture a bien été ajouté, le nom du client c'est "+invoice.getCustomerName()+" et le numero de facture est "+invoice.getNumber());
    }
}
