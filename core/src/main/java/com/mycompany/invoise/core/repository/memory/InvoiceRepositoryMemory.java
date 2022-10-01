package com.mycompany.invoise.core.repository.memory;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
    private static List<Invoice> invoices = new ArrayList<>();

    public Invoice create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("La la facture a bien été cééé avec pour numero de facture "+invoice.getNumber()+" et pour nom "+invoice.getCustomerName());
    return  invoice;
    }
    @Override
    public List<Invoice> list() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Invoice getById(String number) {
        throw new UnsupportedOperationException();
    }
}


