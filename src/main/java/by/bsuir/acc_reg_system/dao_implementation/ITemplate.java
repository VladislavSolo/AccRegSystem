package by.bsuir.acc_reg_system.dao_implementation;

import by.bsuir.acc_reg_system.dao.TemplateDAO;
import by.bsuir.acc_reg_system.entity.Orders;
import by.bsuir.acc_reg_system.entity.Product;
import by.bsuir.acc_reg_system.entity.Template;
import by.bsuir.acc_reg_system.persistence.HibernateUtil;
import org.hibernate.Hibernate;
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
public class ITemplate implements TemplateDAO{

    public void addTemplate(Template template) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(template);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
    }

    public void updateTemplate(int template_id, Template template) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(template);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Template getTemplateById(int template_id) throws SQLException {
        Session session = null;
        Template template = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            template = (Template) session.load(Template.class, template_id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return template;
    }

    public Collection getAllTemplates() throws SQLException {
        Session session = null;
        List templates = new ArrayList<Template>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            templates = session.createCriteria(Template.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return templates;
    }

    public void deleteTemplate(Template template) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(template);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public Collection getTemplatesByOrder(Orders orders) throws SQLException {
        Session session = null;
        List templates = new ArrayList<Template>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            int id = orders.getTemplate().getIdTemplate();
            Query query = session.createQuery("from Template where IDTemplate = :ID").setInteger("ID", id);
            templates = (List<Template>) query.list();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return templates;
    }

    public Collection getTemplatesByProduct(Product product) throws  SQLException {

        Session session = null;
        List templates = new ArrayList<Template>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            int idProduct= product.getIdProduct();
            Query query = session.createQuery("from Template where IDProduct = :IDProduct ").setInteger("IDProduct", idProduct);
            templates = (List<Template>) query.list();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return templates;
    }

}
