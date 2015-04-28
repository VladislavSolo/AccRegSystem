package by.bsuir.acc_reg_system.dao_implementation;

import by.bsuir.acc_reg_system.dao.OwnerTemplateDAO;
import by.bsuir.acc_reg_system.entity.Orders;
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
public class IOwnerTemplate implements OwnerTemplateDAO{

    public void addOwnerTemplate(OwnerTemplate ownerTemplate) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(ownerTemplate);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
    }

    public void updateOwnerTemplate(int ownerTemplate_id, OwnerTemplate ownerTemplate) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(ownerTemplate);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public OwnerTemplate getOwnerTemplateById(int ownerTemplate_id) throws SQLException {
        Session session = null;
        OwnerTemplate ownerTemplate = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            ownerTemplate = (OwnerTemplate) session.load(OwnerTemplate.class, ownerTemplate_id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return ownerTemplate;
    }

    public Collection getAllOwnerTemplates() throws SQLException {
        Session session = null;
        List ownerTemplates = new ArrayList<OwnerTemplate>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            ownerTemplates = session.createCriteria(OwnerTemplate.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return ownerTemplates;
    }

    public void deleteOwnerTemplate(OwnerTemplate ownerTemplate) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(ownerTemplate);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Collection getOwnerTemplatesByOrder(Orders orders) throws SQLException {
        Session session = null;
        List ownerTemplates = new ArrayList<OwnerTemplate>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            int idOrder = orders.getIdOrder();
            Query query = session.createQuery("from OwnerTemplate where Orders_IDOrders = :IDOrder ").setInteger("IDOrder", idOrder);
            ownerTemplates = (List<OwnerTemplate>) query.list();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return ownerTemplates;
    }
}
