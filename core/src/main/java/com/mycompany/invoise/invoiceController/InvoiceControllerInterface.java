package com.mycompany.invoise.invoiceController;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    void createInvoiceUsing();
    void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface);
}
