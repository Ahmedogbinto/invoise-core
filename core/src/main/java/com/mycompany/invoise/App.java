package com.mycompany.invoise;

import com.mycompany.invoise.invoiceController.InvoiceController;
import com.mycompany.invoise.invoiceController.InvoiceControllerChambouletout;
import com.mycompany.invoise.invoiceController.InvoiceControllerMichel;
import com.mycompany.invoise.repository.InvoiceRepository;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Dans quel type de configuration vous trouvez-vous?");
        int conf = scanner.nextInt();
        if(conf==1){
            InvoiceController invoiceController = new InvoiceController();
            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoiceUsing();
        }
        else if(conf ==2){
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
            invoiceControllerMichel.setInvoiceServiceMichel(invoiceServiceMichel);
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceServiceMichel.setInvoiceRepository(invoiceRepository);
            invoiceControllerMichel.createInvoiceUsing();
        }
        else if (conf==3){
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
            invoiceControllerMichel.setInvoiceServiceMichel(invoiceServiceMichel);
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceServiceMichel.setInvoiceRepository(invoiceRepository);
            invoiceControllerMichel.createInvoiceUsing();
        }
        else if (conf==4){
            InvoiceControllerChambouletout invoiceControllerChambouletout = new InvoiceControllerChambouletout();
            InvoiceService invoiceService = new InvoiceService();
            invoiceControllerChambouletout.setInvoiceServiceInterface(invoiceService);
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceControllerChambouletout.createInvoiceUsing();

        }

    }
}
