package com.mycompany.invoise.core.service.number;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {
    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    // private static long lastNumber = 0L;
    //On ne veut generer ce numero au niveau du service mais au niveau de la base de données, on peut le supprimer.
    public Invoice createInvoice(Invoice invoice){
         // invoice.setNumber(String.valueOf(++lastNumber));
        // invoiceRepository.create(invoice);
       //System.out.println("la facture a bien été ajouté, le nom du client c'est "+invoice.getCustomerName()+" et le numero de facture est "+invoice.getNumber());
    return invoiceRepository.create(invoice);
    }

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.getById(number);
    }
}
