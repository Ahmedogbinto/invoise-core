package com.mycompany.invoise.controller.web;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller public class InvoiceControllerWeb implements InvoiceControllerInterface {
    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoiceUsing(){
        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }

    @RequestMapping("/invoice-home")
    public @ModelAttribute("invoices") List<Invoice>displayHome(){
        System.out.println(" La méthode display home a bien été invoqué");
        List<Invoice> invoices=invoiceService.getInvoiceList();
        //req.setAttribute("invoices",invoices);    // Pour fournir un element de model a la vue mais ce n<est pqs le plus courant a utiliser
        return invoices;
    }


}

