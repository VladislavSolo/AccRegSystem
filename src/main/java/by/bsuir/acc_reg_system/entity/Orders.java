package by.bsuir.acc_reg_system.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladislav on 15.04.15.
 */
public class Orders implements Serializable {

    private int IdOrder;
    private String deadLine;
    private Customer customer;
    private Template template;
    private Set ownerTemplates = new HashSet();

    public Set getOwnerTemplates() {
        return ownerTemplates;
    }

    public void setOwnerTemplates(Set ownerTemplates) {
        this.ownerTemplates = ownerTemplates;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int idOrder) {
        IdOrder = idOrder;
    }
}
