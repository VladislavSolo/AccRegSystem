package by.bsuir.acc_reg_system.dao;

import by.bsuir.acc_reg_system.entity.Order;
import by.bsuir.acc_reg_system.entity.Template;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Vladislav on 15.04.15.
 */
public interface TemplateDAO {

    public void addTemplate(Template template) throws SQLException;
    public void updateTemplate(int template_id, Template template) throws SQLException;
    public Template getTemplateById(int template_id) throws SQLException;
    public Collection getAllTemplates() throws SQLException;
    public void deleteTemplate(Template template) throws SQLException;
    public Collection getTemplatesByOrder(Order order) throws SQLException;
    //public Collection getBussesByRoute(Route route) throws SQLException;
}
