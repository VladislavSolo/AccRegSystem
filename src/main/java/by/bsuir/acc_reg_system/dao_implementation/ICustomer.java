package by.bsuir.acc_reg_system.dao_implementation;

import by.bsuir.acc_reg_system.dao.CustomerDAO;
import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.OwnerTemplate;
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
public class ICustomer implements CustomerDAO{

    public void addCustomer(Customer customer) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }



    public void updateCustomer(int customer_id, Customer customer) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(customer);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Customer getCustomerById(int customer_id) throws SQLException {
        Session session = null;
        Customer customer = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            customer = (Customer) session.get(Customer.class, customer_id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return customer;
    }

    public Collection getAllCustomers() throws SQLException {
        Session session = null;
        List customers = new ArrayList<Customer>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            customers = session.createCriteria(Customer.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return customers;
    }

    public void deleteCustomer(Customer customer) throws SQLException {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(customer);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Customer checkEmailAndPassword(String email, String password) {

        Session session = null;
        Customer customer = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            Query query = session.createQuery("from Customer where Email = :email AND Password = :password")
                    .setString("email", email).setString("password", password);
            customer = (Customer)query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return customer;
    }

    public Customer getCustomerByName(String name) {

        Session session = null;
        Customer customer = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            Query query = session.createQuery("from Customer where Name = :name ")
                    .setString("name", name);
            customer = (Customer)query.uniqueResult();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return customer;
    }
}
