package by.bsuir.acc_reg_system.logic.comand;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Orders;
import by.bsuir.acc_reg_system.entity.OwnerTemplate;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.persistence.criteria.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * Created by Vladislav on 11.05.15.
 */
public class AddOwnerOrderCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        String customerName = (String) req.getSession(true).getAttribute("name");
        String name = req.getParameter("ownerTemplateName");
        String note = req.getParameter("ownerTemplateNote");
        String number = req.getParameter("ownerTemplateNumber");

        int num = Integer.parseInt(number);

        Customer customer = Factory.getInstance().getCustomerDAO().getCustomerByName(customerName);

        Orders order = new Orders();
        order.setNumber(num);
        order.setCustomer(customer);

        Factory.getInstance().getOrderDAO().addOrder(order);

        Orders orders = Factory.getInstance().getOrderDAO().getLastLine();

        OwnerTemplate ownerTemplate = new OwnerTemplate();
        ownerTemplate.setName(name);
        ownerTemplate.setNote(note);
        ownerTemplate.setOrders(orders);

        Factory.getInstance().getOwnerTemplateDAO().addOwnerTemplate(ownerTemplate);
    }
}
