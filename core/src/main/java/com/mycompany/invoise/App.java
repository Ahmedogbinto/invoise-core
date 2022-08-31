package com.mycompany.invoise;

import com.mycompany.invoise.invoiceController.InvoiceControllerInterface;
import com.mycompany.invoise.invoiceController.InvoiceControllerKeyboard;
import com.mycompany.invoise.invoiceController.InvoiceControllerDouchette;
import com.mycompany.invoise.invoiceController.InvoiceControllerWeb;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.repository.InvoiceRepositoryMemory;
import com.mycompany.invoise.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.InvoiceServiceNumber;
import com.mycompany.invoise.service.InvoiceServicePrefixe;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le type de controlleur: (Douchette, Keyboard ou web)?");
        String controllerType = scanner.nextLine();
        System.out.println("Quel est le type de service: (number ou prefixe) ?");
        String serviceType = scanner.nextLine();
        System.out.println("Quel est le type de repository (memory ou database)?");
        String repositoryType = scanner.nextLine();

        InvoiceControllerInterface invoiceControllerInterface = null;
        switch (controllerType) {
            case "keyboard":
                invoiceControllerInterface = new InvoiceControllerKeyboard();
                break;

            case "web":
                invoiceControllerInterface = new InvoiceControllerWeb();
                break;

            case "douchette":
                invoiceControllerInterface = new InvoiceControllerDouchette();
                break;
        }

        InvoiceServiceInterface invoiceServiceInterface = null;
        switch (serviceType) {
            case "number":
                invoiceServiceInterface = new InvoiceServiceNumber();
                break;

            case "prefix":
                invoiceServiceInterface = new InvoiceServicePrefixe();
                break;
        }

        InvoiceRepositoryInterface invoiceRepositoryInterface = null;
        switch (repositoryType) {
            case "memory":
                invoiceRepositoryInterface = new InvoiceRepositoryMemory();
                break;
            case "database":
                invoiceRepositoryInterface = new InvoiceRepositoryDatabase();
                break;
        }
// injection des dependences
        invoiceControllerInterface.setInvoiceServiceInterface(invoiceServiceInterface);
        invoiceServiceInterface.setInvoiceRepositoryInterface(invoiceRepositoryInterface);

        invoiceControllerInterface.createInvoiceUsing();
    }
}
