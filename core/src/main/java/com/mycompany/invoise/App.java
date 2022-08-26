package com.mycompany.invoise;

import com.mycompany.invoise.invoiceController.InvoiceController;
import com.mycompany.invoise.invoiceController.InvoiceControllerMichel;

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
            invoiceController.createInvoiceUsing();
        }
        else if(conf ==2){
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            invoiceControllerMichel.createInvoiceUsing();
        }

    }
}
