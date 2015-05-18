package by.bsuir.acc_reg_system.logic.comand;

import by.bsuir.acc_reg_system.entity.*;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class AuthorizationCommand implements Command{

    private static Customer customer;

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ServletException, IOException {

        if (req.getParameter("email").equals("admin@root.co") && req.getParameter("password").equals("root")) {

            AdminGetOrdersCommand adminTools = new AdminGetOrdersCommand();
            adminTools.execute(req, resp);
            req.getSession(true).setAttribute("email", "admin@root.co");
            req.getRequestDispatcher("/adminTools.jsp").forward(req, resp);

        } else {
            customer = Factory.getInstance().getCustomerDAO().checkEmailAndPassword(req.getParameter("email"), req.getParameter("password"));

            if (customer == null) {

                req.setAttribute("err", "Incorrect password or E-mail!");
                req.getRequestDispatcher("/enter.jsp").forward(req, resp);

            } else {
                req.getSession().setAttribute("name", customer.getName());
                req.getSession().setAttribute("myEmail", customer.getE_mail());

                GetOrdersCommand getOrdersCommand = new GetOrdersCommand();
                getOrdersCommand.execute(req, resp);
                req.getRequestDispatcher("/personalAccount.jsp").forward(req, resp);
            }
        }
    }
}
