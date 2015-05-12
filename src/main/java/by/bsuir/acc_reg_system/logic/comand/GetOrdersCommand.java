package by.bsuir.acc_reg_system.logic.comand;

import by.bsuir.acc_reg_system.entity.*;
import by.bsuir.acc_reg_system.logic.OwnerPrinter;
import by.bsuir.acc_reg_system.logic.TemplatePrinter;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GetOrdersCommand implements Command {

    private static ArrayList<TemplatePrinter> list;
    private static ArrayList<OwnerPrinter> ownerList;

    public GetOrdersCommand() {

        list = new ArrayList();
        ownerList = new ArrayList();
    }


    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        String customerName = (String) req.getSession(true).getAttribute("name");

        Customer customer = Factory.getInstance().getCustomerDAO().getCustomerByName(customerName);

        Collection orders = Factory.getInstance().getOrderDAO().getOrdersByCustomer(customer);

        ArrayList<Orders> ordersList = new ArrayList();

        ArrayList<Template> templatesList = new ArrayList();

        ArrayList<Product> productsList = new ArrayList();

        ArrayList<Orders> ownerOrdersList = new ArrayList();

        ArrayList<OwnerTemplate> ownerTemplatesList = new ArrayList();

        Iterator iterator1 = orders.iterator();

        while(iterator1.hasNext()) {

            Orders order = (Orders) iterator1.next();

            if (order.getTemplate() != null) {

                ordersList.add(order);

                Collection templates = Factory.getInstance().getTemplateDAO().getTemplatesByOrder(order);

                Iterator iterator2 = templates.iterator();

                while (iterator2.hasNext()) {

                    Template template = (Template) iterator2.next();

                    templatesList.add(template);

                    Collection products = Factory.getInstance().getProductDAO().getProductsByTemplate(template);

                    Iterator iterator3 = products.iterator();

                    while (iterator3.hasNext()) {

                        Product product = (Product) iterator3.next();

                        productsList.add(product);
                    }
                }
            } else {

                ownerOrdersList.add(order);

                Collection ownerTemplates = Factory.getInstance().getOwnerTemplateDAO().getOwnerTemplatesByOrder(order);

                Iterator iterator4 = ownerTemplates.iterator();

                while (iterator4.hasNext()) {

                    OwnerTemplate template = (OwnerTemplate) iterator4.next();

                    ownerTemplatesList.add(template);
                }
            }
        }

        for (int i = 0; i < ordersList.size(); i ++) {

            TemplatePrinter templatePrinter = new TemplatePrinter();
            templatePrinter.setIdOrder(ordersList.get(i).getIdOrder());
            templatePrinter.setNumber(ordersList.get(i).getNumber());
            templatePrinter.setTemplateName(templatesList.get(i).getName());
            templatePrinter.setTemplateType(templatesList.get(i).getType());
            templatePrinter.setTemplateFormat(templatesList.get(i).getFormat());
            templatePrinter.setTemplateSize(templatesList.get(i).getSize());
            templatePrinter.setProductName(productsList.get(i).getName());
            templatePrinter.setProductType(productsList.get(i).getType());
            list.add(templatePrinter);
        }

        for (int i = 0; i < ownerOrdersList.size(); i ++) {

            OwnerPrinter printer = new OwnerPrinter();
            printer.setIdOrder(ownerOrdersList.get(i).getIdOrder());
            printer.setName(ownerTemplatesList.get(i).getName());
            printer.setNote(ownerTemplatesList.get(i).getNote());
            ownerList.add(printer);
        }

        req.setAttribute("list", this.list);
        req.setAttribute("ownerList", this.ownerList);
    }
}
