package by.bsuir.acc_reg_system.persistence;

import by.bsuir.acc_reg_system.dao.*;
import by.bsuir.acc_reg_system.dao_implementation.*;

public class Factory {

    private static CustomerDAO customerDAO = null;
    private static OrderDAO orderDAO = null;
    private static OwnerTemplateDAO ownerTemplateDAO = null;
    private static ProductDAO productDAO = null;
    private static TemplateDAO templateDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public CustomerDAO getCustomerDAO(){
        if (customerDAO == null){
            customerDAO = new CustomerImpl();
        }
        return customerDAO;
    }

    public OrderDAO getOrderDAO(){
        if (orderDAO == null){
            orderDAO = new OrderImpl();
        }
        return orderDAO;
    }

    public OwnerTemplateDAO getOwnerTemplateDAO(){
        if (ownerTemplateDAO == null){
            ownerTemplateDAO = new OwnerTemplateImpl();
        }
        return ownerTemplateDAO;
    }

    public ProductDAO getProductDAO(){
        if (productDAO == null){
            productDAO = new ProductImpl();
        }
        return productDAO;
    }

    public TemplateDAO getTemplateDAO(){
        if (templateDAO == null){
            templateDAO = new TemplateImpl();
        }
        return templateDAO;
    }
}
