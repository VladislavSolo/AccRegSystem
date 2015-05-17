package by.bsuir.acc_reg_system.logic.comand;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Orders;
import by.bsuir.acc_reg_system.entity.Product;
import by.bsuir.acc_reg_system.entity.Template;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class AddOrderCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        String numberString = req.getParameter("orderNumber");
        int number = Integer.parseInt(numberString);

        String email = (String) req.getSession(true).getAttribute("myEmail");

        String templateName = req.getParameter("templateName");
        String templateType = req.getParameter("templateType");
        String templateFormat = req.getParameter("templateFormat");
        String productName = req.getParameter("productName");
        String productType = req.getParameter("productType");
        String size;

        if (templateName == null || templateType == null || templateFormat == null || productName == null || productType == null) {

            req.setAttribute("err","Please enter all fields!");

        } else {

            if (templateFormat.equals("A1")) {
                size = "594×841";
            } else if (templateFormat.equals("A2")) {
                size = "420×594";
            } else if (templateFormat.equals("A3")) {
                size = "297×420";
            } else if (templateFormat.equals("A4")) {
                size = "210×297";
            } else if (templateFormat.equals("A5")) {
                size = "148×210";
            } else if (templateFormat.equals("A6")) {
                size = "105×148";
            } else {
                size = templateFormat;
            }

            Product product = new Product();
            product.setName(productName);
            product.setType(productType);

            Factory.getInstance().getProductDAO().addProduct(product);

            Template template = new Template();
            template.setName(templateName);
            template.setType(templateType);
            template.setFormat(templateFormat);
            template.setSize(size);
            template.setProduct(product);

            Factory.getInstance().getTemplateDAO().addTemplate(template);

            Customer customer = Factory.getInstance().getCustomerDAO().getCustomerByEmail(email);

            Orders order = new Orders();
            order.setNumber(number);
            order.setCustomer(customer);
            order.setTemplate(template);

            Factory.getInstance().getOrderDAO().addOrder(order);
        }

    }
}
