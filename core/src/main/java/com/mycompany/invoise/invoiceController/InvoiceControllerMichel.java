package com.mycompany.invoise.invoiceController;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.InvoiceServiceMichel;



public class InvoiceControllerMichel implements InvoiceControllerInterface{
    private InvoiceServiceInterface invoiceServiceMichel;

    public InvoiceServiceInterface getInvoiceServiceMichel() {
        return invoiceServiceMichel;
    }

    public void setInvoiceServiceMichel(InvoiceServiceInterface invoiceServiceMichel) {
        this.invoiceServiceMichel = invoiceServiceMichel;
    }

    public void createInvoiceUsing(){
        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceServiceMichel.createInvoice(invoice);

    }
}
