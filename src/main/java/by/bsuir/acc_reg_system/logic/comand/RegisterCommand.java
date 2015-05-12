package by.bsuir.acc_reg_system.logic.comand;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * Created by Vladislav on 11.05.15.
 */
public class RegisterCommand implements Command {


    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        Customer customer = new Customer();
        customer.setName(req.getParameter("name"));
        customer.setLastName(req.getParameter("lastname"));
        customer.setAddress(req.getParameter("address"));
        customer.setE_mail(req.getParameter("email"));
        customer.setPassword(req.getParameter("password"));

        Factory.getInstance().getCustomerDAO().addCustomer(customer);
    }
}
