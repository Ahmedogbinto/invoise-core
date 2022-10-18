package com.mycompany.invoise.core.service.prefix;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }
    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Value("${invoice.lastNumber}")
    private long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Invoice createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(prefix+(++lastNumber)));

        invoiceRepository.save(invoice);

        System.out.println("la facture a bien été ajouté");
    return invoice;
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }
}
