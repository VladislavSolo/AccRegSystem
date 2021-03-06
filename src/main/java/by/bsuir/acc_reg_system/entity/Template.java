package by.bsuir.acc_reg_system.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladislav on 15.04.15.
 */
public class Template implements Serializable {

    private int IdTemplate;
    private String name;
    private String type;
    private String format;
    private String size;
    private Product product;
    private Set orders = new HashSet();

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getIdTemplate() {
        return IdTemplate;
    }

    public void setIdTemplate(int idTemplate) {
        IdTemplate = idTemplate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Set getOrders() {
        return orders;
    }

    public void setOrders(Set orders) {
        this.orders = orders;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TemplateName: " + this.name + " Type: " + this.type + " Format: " + this.format +
                " Size: " + this.size;
    }
}
