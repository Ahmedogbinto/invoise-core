package com.mycompany.invoise.core.repository.database;
// A cause de spring-data-jdbc nous avons opéré la magie de supprimer la classes InvoiceRepositoryDatabase.java
/*
import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Projection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

   @Autowired
   private JdbcTemplate jdbcTemplate;

    //creer une facture avec Spring jdbc
    public Invoice create(Invoice invoice){
        // KeyHolder
        KeyHolder kh = new GeneratedKeyHolder();

        jdbcTemplate.update(connection ->{
            PreparedStatement ps=connection.prepareStatement("INSERT INTO INVOICE(CUSTOMER_NAME,ORDER_NUMBER) VALUES(?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,invoice.getCustomerName());
            ps.setString(2,invoice.getOrderNumber());
            return ps;
        }, kh);
        invoice.setNumber(kh.getKey().toString());
        return invoice;
    }

    //Afficher la liste des factures avec spring jdbc
    @Override
    public List<Invoice> list() {

        return jdbcTemplate.query("SELECT INVOICE_NUMBER,CUSTOMER_NAME FROM INVOICE",
                (rs,rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME")));

    }


 // obtenir le detail d'une facture avec spring jdbc
    public Invoice getById(String number) {
        // la methode queryForObject retourne un objet de type invoice
        // la methode barrée veut dire quelle est dépréciée ou depassée). On peut enlever cette maturité de l'IDE dans le Settings.
       return jdbcTemplate.queryForObject("SELECT INVOICE_NUMBER,CUSTOMER_NAME,ORDER_NUMBER FROM INVOICE WHERE INVOICE_NUMBER=?",
                new Object[]{number},
                (rs,rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")),
                rs.getString("CUSTOMER_NAME"),rs.getString("ORDER_NUMBER")));

    }
}
*/