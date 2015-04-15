package by.bsuir.acc_reg_system.entity;

/**
 * Created by Vladislav on 15.04.15.
 */
public class OwnerTemplate {

    private int IdOwnerTemplate;
    private String name;
    private String note;
    private Order order;

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
