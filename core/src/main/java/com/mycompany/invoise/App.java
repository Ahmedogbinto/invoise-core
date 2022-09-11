package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


/**
 * Hello world!
 *
 */
@Configuration
public class App {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");           // Utilisation du fichier applicationContext.xml

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfigPropertySource.class);                  // Utilisation de la classe de configuratin AppConfig
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);

        invoiceControllerInterface.createInvoiceUsing();


    }

}

