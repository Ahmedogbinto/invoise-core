package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);

        invoiceControllerInterface.createInvoiceUsing();


    }

}

