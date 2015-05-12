package by.bsuir.acc_reg_system.logic.comand;

import by.bsuir.acc_reg_system.entity.Orders;
import by.bsuir.acc_reg_system.entity.OwnerTemplate;
import by.bsuir.acc_reg_system.entity.Product;
import by.bsuir.acc_reg_system.entity.Template;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Vladislav on 12.05.15.
 */
public class DeleteOrderCommand implements Command {


    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

        String idString = req.getParameter("idDelete");

        int id = Integer.parseInt(idString);

        Orders order = Factory.getInstance().getOrderDAO().getOrderById(id);

        if (order.getTemplate() != null) {

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

        } else {

            Collection ownerTemplates = Factory.getInstance().getOwnerTemplateDAO().getOwnerTemplatesByOrder(order);

            Iterator iterator3 = ownerTemplates.iterator();

            while (iterator3.hasNext()) {

                OwnerTemplate ownerTemplate = (OwnerTemplate) iterator3.next();

                Factory.getInstance().getOwnerTemplateDAO().deleteOwnerTemplate(ownerTemplate);
            }
        }

        Factory.getInstance().getOrderDAO().deleteOrder(order);
    }
}
