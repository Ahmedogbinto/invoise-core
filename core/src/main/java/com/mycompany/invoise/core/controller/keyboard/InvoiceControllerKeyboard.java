package com.mycompany.invoise.core.controller.keyboard;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Scanner;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public String createInvoiceUsing(Invoice invoice){
        System.out.println( "Quel est le nom de votre client" );
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        invoice = new Invoice();
        invoice.setCustomerName(customerName);


        invoiceService.createInvoice(invoice);

        return null;

    }

}
