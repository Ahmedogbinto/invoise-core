package com.mycompany.invoise.controller.scan;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.Scanner;

@Controller public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoiceUsing(){
        System.out.println( "Quel est le nom de votre client" );
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);


        invoiceService.createInvoice(invoice);

    }

}
