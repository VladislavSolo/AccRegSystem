package by.bsuir.acc_reg_system.dao;

import by.bsuir.acc_reg_system.entity.Order;
import by.bsuir.acc_reg_system.entity.OwnerTemplate;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Vladislav on 15.04.15.
 */
public interface OwnerTemplateDAO {

    public void addOwnerTemplate(OwnerTemplate ownerTemplate) throws SQLException;
    public void updateOwnerTemplate(int ownerTemplate_id, OwnerTemplate ownerTemplate) throws SQLException;
    public OwnerTemplate getOwnerTemplateById(int ownerTemplate_id) throws SQLException;
    public Collection getAllOwnerTemplates() throws SQLException;
    public void deleteOwnerTemplate(OwnerTemplate ownerTemplate) throws SQLException;
    public Collection getOwnerTemplatesByOrder(Order order) throws SQLException;
    //public Collection getBussesByRoute(Route route) throws SQLException;
}
