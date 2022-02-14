package Repository;

import Model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceRepo {
    @Autowired
    JdbcTemplate template;

    public void addInvoice(){

    }
    public void updateInvoice(){

    }
    public void deleteInvoice(){

    }
    public List<Invoice> fetchAll(){

    }
    public Invoice fetchById(){

    }
}
