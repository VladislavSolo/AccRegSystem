package by.bsuir.acc_reg_system.logic;

import by.bsuir.acc_reg_system.entity.*;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

public class PersonalAccount {

    private static PersonalAccount personalAccount;
    private static Customer customer;



    public static PersonalAccount sharedAccount() {

        if (personalAccount == null) {

            customer = new Customer();


            return new PersonalAccount();
        } else {

            return personalAccount;
        }
    }

    public boolean checkAccount(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ServletException, IOException {

        customer = Factory.getInstance().getCustomerDAO().checkEmailAndPassword(req.getParameter("email"), req.getParameter("password"));

        if ( customer == null) {
            return false;
        } else {
            req.getSession().setAttribute("name", customer.getName());
            this.showOrders(req);
            return true;
        }
    }

    public void showOrders(HttpServletRequest req) throws SQLException {


    }

    public void deleteOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException {

        String idString = req.getParameter("id");
        int id = Integer.parseInt(idString);

        try {
            Orders order = Factory.getInstance().getOrderDAO().getOrderById(id);

            Collection templates = Factory.getInstance().getTemplateDAO().getTemplatesByOrder(order);

            Iterator iterator1 = templates.iterator();

            while (iterator1.hasNext()) {

                Template template = (Template) iterator1.next();

                Collection products = Factory.getInstance().getProductDAO().getProductsByTemplate(template);

                Iterator iterator2 = products.iterator();

                while (iterator2.hasNext()) {

                    Product product = (Product) iterator2.next();
                    Factory.getInstance().getProductDAO().deleteProduct(product);
                }

                Factory.getInstance().getTemplateDAO().deleteTemplate(template);
            }

            Factory.getInstance().getOrderDAO().deleteOrder(order);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
