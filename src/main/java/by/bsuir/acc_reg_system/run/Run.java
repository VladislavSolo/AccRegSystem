package by.bsuir.acc_reg_system.run;

import by.bsuir.acc_reg_system.entity.*;
import by.bsuir.acc_reg_system.persistence.Factory;

import javax.persistence.criteria.Order;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;


public class Run {
    public static void main (String args[]) throws SQLException {

            Orders order = Factory.getInstance().getOrderDAO().getOrderById(1);
            Collection templates = Factory.getInstance().getTemplateDAO().getTemplatesByOrder(order);
            Iterator iterator2 = templates.iterator();

            while (iterator2.hasNext()) {

                Template template = (Template) iterator2.next();

                System.out.println("DeadLine " + order.getDeadLine() + " ID " + order.getIdOrder() +
                                    " Name " + template.getName() + " Type " + template.getType()
                );
            }
        }
    }
