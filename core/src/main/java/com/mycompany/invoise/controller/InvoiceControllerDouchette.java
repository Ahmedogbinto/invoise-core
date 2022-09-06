package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceControllerDouchette implements InvoiceControllerInterface{
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void createInvoiceUsing() {
        System.out.println("Vous utilisez une douchette!");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Koffi Olomide");
        invoiceService.createInvoice(invoice);
    }
}
