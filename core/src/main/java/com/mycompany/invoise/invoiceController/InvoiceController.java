package com.mycompany.invoise.invoiceController;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceService;


import java.util.Scanner;

public class InvoiceController implements InvoiceControllerInterface{


    public void createInvoiceUsing(){
        System.out.println( "Quel est le nom de votre client" );
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);

    }

}
