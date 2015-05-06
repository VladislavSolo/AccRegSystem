package by.bsuir.acc_reg_system.logic;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

public class Switch {
    private static Switch aSwitch;
    private PersonalAccount personalAccount;

    public static Switch sharedSwitch() {

        if(aSwitch == null) {

            return new Switch();
        } else {

            return aSwitch;
        }
    }

    public void addCustomer(HttpServletRequest req) throws SQLException {

        Customer customer = new Customer();
        customer.setName(req.getParameter("name"));
        customer.setLastName(req.getParameter("lastname"));
        customer.setAddress(req.getParameter("address"));
        customer.setE_mail(req.getParameter("email"));
        customer.setPassword(req.getParameter("password"));

        Factory.getInstance().getCustomerDAO().addCustomer(customer);

    }

    public void logIN(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {

        this.personalAccount = new PersonalAccount();

        if (!this.personalAccount.checkAccount(req)) {

            req.setAttribute("check", "Incorrect E-mail or Password. Try again!");
            req.getRequestDispatcher("/enter.jsp").forward(req, resp);
        } else {

            req.getRequestDispatcher("/PersonalAccount.jsp").forward(req, resp);
        }
    }
}
