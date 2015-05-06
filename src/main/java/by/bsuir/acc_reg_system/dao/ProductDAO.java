package by.bsuir.acc_reg_system.dao;

import by.bsuir.acc_reg_system.entity.Customer;
import by.bsuir.acc_reg_system.entity.Product;
import by.bsuir.acc_reg_system.entity.Template;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Vladislav on 15.04.15.
 */
public interface ProductDAO {

    public void addProduct(Product product) throws SQLException;
    public void updateProduct(int product_id, Product product) throws SQLException;
    public Product getProductById(int product_id) throws SQLException;
    public Collection getAllProducts() throws SQLException;
    public void deleteProduct(Product product) throws SQLException;
    public Collection getProductsByTemplate(Template template) throws SQLException;
}
