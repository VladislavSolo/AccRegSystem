package by.bsuir.acc_reg_system.run;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Order;
import by.bsuir.acc_reg_system.persistence.Factory;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;


public class Run {
    public static void main (String args[]) throws SQLException {

        Collection customers = Factory.getInstance().getCustomerDAO().getAllCustomers();
        Iterator iterator = customers.iterator();

        while (iterator.hasNext()) {

            Customer customer = (Customer) iterator.next();

            Collection orders = Factory.getInstance().getOrderDAO().getOrdersByCustomer(customer);
            Iterator iterator2 = orders.iterator();

            while (iterator2.hasNext()) {

                Order order = (Order) iterator2.next();
                System.out.printf("Name: " + customer.getName() + "  LastName: " + customer.getLastName() +
                        "  Address: " + customer.getAddress() + "  E-mail: " + customer.getE_mail());
            }
        }
    }
}
