package by.bsuir.acc_reg_system.logic;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Orders;
import by.bsuir.acc_reg_system.entity.Product;
import by.bsuir.acc_reg_system.entity.Template;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonalAccount {

    private Customer customer;
    private ArrayList<AccountOrder> list;

    public PersonalAccount() {

        customer = new Customer();
        list = new ArrayList();
    }

    public boolean checkAccount(HttpServletRequest req) throws SQLException {

        customer = Factory.getInstance().getCustomerDAO().checkEmailAndPassword(req.getParameter("email"), req.getParameter("password"));

        if ( customer == null) {
            return false;
        } else {
            this.showOrders(req);
            return true;
        }
    }

    public void showOrders(HttpServletRequest req) throws SQLException {

        req.setAttribute("name", customer.getName());

        Collection orders = Factory.getInstance().getOrderDAO().getOrdersByCustomer(customer);

        ArrayList<Orders> ordersList = new ArrayList();

        ArrayList<Template> templatesList = new ArrayList();

        ArrayList<Product> productsList = new ArrayList();

        Iterator iterator1 = orders.iterator();

        while(iterator1.hasNext()) {

            Orders order = (Orders) iterator1.next();

            ordersList.add(order);

            Collection templates = Factory.getInstance().getTemplateDAO().getTemplatesByOrder(order);

            Iterator iterator2 = templates.iterator();

            while(iterator2.hasNext()) {

                Template template = (Template) iterator2.next();

                templatesList.add(template);

                Collection products = Factory.getInstance().getProductDAO().getProductsByTemplate(template);

                Iterator iterator3 = products.iterator();

                while(iterator3.hasNext()) {

                    Product product = (Product) iterator3.next();

                    productsList.add(product);
                }
            }
        }

        for (int i = 0; i < ordersList.size(); i ++) {

            AccountOrder accountOrder = new AccountOrder();
            accountOrder.setIdOrder(ordersList.get(i).getIdOrder());
            accountOrder.setDeadLine(ordersList.get(i).getDeadLine());
            accountOrder.setTemplateName(templatesList.get(i).getName());
            accountOrder.setTemplateType(templatesList.get(i).getType());
            accountOrder.setTemplateFormat(templatesList.get(i).getFormat());
            accountOrder.setTemplateSize(templatesList.get(i).getSize());
            accountOrder.setProductName(productsList.get(i).getName());
            accountOrder.setProductType(productsList.get(i).getType());
            list.add(accountOrder);
        }

        req.setAttribute("list", this.list);
    }
}
