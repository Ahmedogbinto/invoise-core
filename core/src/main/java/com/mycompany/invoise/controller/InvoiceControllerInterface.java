package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

import java.util.List;

public interface InvoiceControllerInterface {
    void createInvoiceUsing();
    void setInvoiceService(InvoiceServiceInterface invoiceService);

}
