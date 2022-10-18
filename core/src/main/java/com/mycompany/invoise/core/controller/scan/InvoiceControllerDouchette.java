package com.mycompany.invoise.core.controller.scan;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.customer.Customer;
import com.mycompany.invoise.core.entity.invoice.Invoice;
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
    public String createInvoiceUsing(Invoice invoice) {
        System.out.println("Vous utilisez une douchette!");
        invoice = new Invoice();

        Customer customer = new Customer("Ahmed OGBINTO");
        invoice.setCustomer(customer);

        invoiceService.createInvoice(invoice);

        return null;
    }
}
