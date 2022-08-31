package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;


import java.util.Scanner;

public class InvoiceControllerKeyboard implements InvoiceControllerInterface{

    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public void createInvoiceUsing(){
        System.out.println( "Quel est le nom de votre client" );
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);


        invoiceServiceInterface.createInvoice(invoice);

    }

}
