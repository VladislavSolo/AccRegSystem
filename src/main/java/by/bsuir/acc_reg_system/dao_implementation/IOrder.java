package by.bsuir.acc_reg_system.dao_implementation;

import by.bsuir.acc_reg_system.dao.OrderDAO;
import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Order;
import by.bsuir.acc_reg_system.persistence.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Vladislav on 15.04.15.
 */
public class IOrder implements OrderDAO{

    public void addOrder(Order order) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void updateOrder(int order_id, Order order) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Order getOrderById(int order_id) throws SQLException {
        Session session = null;
        Order order = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            order = (Order) session.load(Order.class, order_id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return order;
    }

    public Collection getAllOrders() throws SQLException {
        Session session = null;
        List orders = new ArrayList<Order>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            orders = session.createCriteria(Order.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }

    public void deleteOrder(Order order) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Collection getOrdersByCustomer(Customer customer) throws SQLException {

        Session session = null;
        List orders = new ArrayList<Order>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            int idCustomer = customer.getIdCustomer();
            Query query = session.createQuery("from Orders where Customer_IDCustomer = :IDCustomer").setInteger("IDCustomer", idCustomer);
            orders = (List<Order>) query.list();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }
}