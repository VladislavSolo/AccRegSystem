package by.bsuir.acc_reg_system.dao_implementation;

import by.bsuir.acc_reg_system.dao.OrderDAO;
import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Orders;
import by.bsuir.acc_reg_system.entity.Template;
import by.bsuir.acc_reg_system.persistence.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Vladislav on 15.04.15.
 */
public class IOrder implements OrderDAO{

    public void addOrder(Orders orders) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(orders);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Orders getLastLine() {

        Session session = null;
        Orders orders = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Orders order by IDOrders DESC");
            query.setMaxResults(1);
            orders = (Orders)query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }

    public void updateOrder(int order_id, Orders orders) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(orders);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Orders getOrderById(int order_id) throws SQLException {
        Session session = null;
        Orders orders = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            int id = order_id;
            Query query = session.createQuery("from Orders where IDOrders = :ID").setInteger("ID", id);
            orders = (Orders)query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }

    public Collection getAllOrders() throws SQLException {
        Session session = null;
        List orders = new ArrayList<Orders>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            orders = session.createCriteria(Orders.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }

    public void deleteOrder(Orders orders) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            int id = orders.getIdOrder();
            Query query = session.createQuery("" +
                    "DELETE FROM Orders where IDOrders = :ID" +
                    "").setInteger("ID", id);
            int a = query.executeUpdate();
            session.getTransaction();


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
        List orders = new ArrayList<Orders>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            int idCustomer = customer.getIdCustomer();

            Query query = session.createQuery("" +
                    "from Orders where Customer_IDCustomer = :ID " +
                    "").setInteger("ID", idCustomer);

            orders = query.list();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }

    public Collection getOrdersByTemplateAndCustomer(Template template, Customer customer) throws SQLException {

        Session session = null;
        List orders = new ArrayList<Orders>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            int idTemplate = template.getIdTemplate();
            int idCustomer = customer.getIdCustomer();
            Query query = session.createQuery("" +
                    "from Orders where Template_IDTemplate = :IDTemplate AND Customer_IDCustomer = :IDCustomer" +
                    "").setInteger("IDTemplate", idTemplate).setInteger("IDCustomer", idCustomer);

            orders = query.list();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }
}
