package by.bsuir.acc_reg_system.dao;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Order;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Vladislav on 15.04.15.
 */
public interface CustomerDAO {

    public void addCustomer(Customer customer) throws SQLException;
    public void updateCustomer(int customer_id, Customer customer) throws SQLException;
    public Customer getCustomerById(int customer_id) throws SQLException;
    public Collection getAllCustomers() throws SQLException;
    public void deleteCustomer(Customer customer) throws SQLException;
    //public Collection getCustomersByOrder(Order order) throws SQLException;
}
