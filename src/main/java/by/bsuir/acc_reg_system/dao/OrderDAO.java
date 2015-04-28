package by.bsuir.acc_reg_system.dao;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Orders;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Vladislav on 15.04.15.
 */
public interface OrderDAO {

    public void addOrder(Orders orders) throws SQLException;
    public void updateOrder(int order_id, Orders orders) throws SQLException;
    public Orders getOrderById(int order_id) throws SQLException;
    public Collection getAllOrders() throws SQLException;
    public void deleteOrder(Orders orders) throws SQLException;
    public Collection getOrdersByCustomer(Customer customer) throws SQLException;
    //public Collection getOrdersByRoute(Route route) throws SQLException;

}
