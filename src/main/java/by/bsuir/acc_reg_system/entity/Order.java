package by.bsuir.acc_reg_system.entity;

import java.sql.Date;

/**
 * Created by Vladislav on 15.04.15.
 */
public class Order {

    private int IdOrder;
    private Date deadLine;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public int getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(int idOrder) {
        IdOrder = idOrder;
    }
}
