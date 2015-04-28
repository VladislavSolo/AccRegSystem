package by.bsuir.acc_reg_system.entity;

import java.io.Serializable;

/**
 * Created by Vladislav on 15.04.15.
 */
public class OwnerTemplate implements Serializable {

    private int IdOwnerTemplate;
    private String name;
    private String note;
    private Orders orders;

    public int getIdOwnerTemplate() {
        return IdOwnerTemplate;
    }

    public void setIdOwnerTemplate(int idOwnerTemplate) {
        IdOwnerTemplate = idOwnerTemplate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
