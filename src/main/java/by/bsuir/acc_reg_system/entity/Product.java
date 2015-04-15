package by.bsuir.acc_reg_system.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladislav on 15.04.15.
 */
public class Product {

    private int IdProduct;
    private String name;
    private String type;
    private Set templates = new HashSet();

    public int getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(int idProduct) {
        IdProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getTemplates() {
        return templates;
    }

    public void setTemplates(Set templates) {
        this.templates = templates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
