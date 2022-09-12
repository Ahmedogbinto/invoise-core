package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");           // Utilisation du fichier applicationContext.xml
        // ApplicationContext context = new AnnotationConfigApplicationContext(App.class);                  // Utilisation de la classe de configuratin AppConfig

        ApplicationContext context = SpringApplication.run(App.class);
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);

        invoiceControllerInterface.createInvoiceUsing();
    }


}

