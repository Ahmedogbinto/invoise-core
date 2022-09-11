package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.prefix.InvoiceServicePrefix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoise.repository.database",/*"com.mycompany.invoise.service.prefix",*/"com.mycompany.invoise.controller.web"})
@PropertySource("classpath:application.properties")
public class App {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");           // Utilisation du fichier applicationContext.xml

        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);                  // Utilisation de la classe de configuratin AppConfig
        InvoiceControllerInterface invoiceControllerInterface = context.getBean(InvoiceControllerInterface.class);

        invoiceControllerInterface.createInvoiceUsing();
    }

    @Bean
    public InvoiceServiceInterface configureInvoiceService(){
        return new InvoiceServicePrefix();
    }
}

