package com.mycompany.invoise.controller;

import com.mycompany.invoise.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    void createInvoiceUsing();
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
