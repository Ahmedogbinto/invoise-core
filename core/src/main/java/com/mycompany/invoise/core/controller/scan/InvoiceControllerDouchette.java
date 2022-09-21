package com.mycompany.invoise.core.controller.scan;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

// @Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {
    @Autowired
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
