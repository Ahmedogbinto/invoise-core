package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est la classe controlleur choisi?");
        String controllerClass = scanner.nextLine();
        System.out.println("Quel est la classe Service choisie?");
        String serviceClass = scanner.nextLine();
        System.out.println("Quel est la classe repositorie choisie?");
        String repositoryClass= scanner.nextLine();

        InvoiceControllerInterface invoiceControllerInterface = null;
        InvoiceServiceInterface invoiceServiceInterface = null;
        InvoiceRepositoryInterface invoiceRepositoryInterface = null;

        try{
            invoiceControllerInterface = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
            invoiceServiceInterface = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            invoiceRepositoryInterface = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
        }
        catch(Exception e){
            e.printStackTrace();
        }
// injection des dependences
        invoiceControllerInterface.setInvoiceServiceInterface(invoiceServiceInterface);
        invoiceServiceInterface.setInvoiceRepositoryInterface(invoiceRepositoryInterface);

        invoiceControllerInterface.createInvoiceUsing();
    }
}
