package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServicePrefix implements InvoiceServiceInterface {

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }
    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
    private long lastNumber = 112L;
    private String prefix;

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(prefix+(++lastNumber)));

        invoiceRepository.create(invoice);

        System.out.println("la facture a bien été ajouté, le nom du client c'est "+invoice.getCustomerName()+" et le numero de facture est "+invoice.getNumber());
    }







}
