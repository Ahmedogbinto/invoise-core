package com.mycompany.invoise.core.controller;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    String createInvoiceUsing(Invoice invoice);
    void setInvoiceService(InvoiceServiceInterface invoiceService);

}
