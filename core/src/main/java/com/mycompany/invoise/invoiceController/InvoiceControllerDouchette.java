package com.mycompany.invoise.invoiceController;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceControllerDouchette implements InvoiceControllerInterface{
    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    @Override
    public void createInvoiceUsing() {
        System.out.println("Vous utilisez une douchette!");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Koffi Olomide");
        invoiceServiceInterface.createInvoice(invoice);
    }
}
