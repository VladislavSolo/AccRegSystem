package by.bsuir.acc_reg_system.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladislav on 15.04.15.
 */
public class Customer {

    private int IdCustomer;
    private String name;
    private String lastName;
    private String address;
    private  String e_mail;
    private Set orders = new HashSet();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getIdCustomer() {
        return IdCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        IdCustomer = idCustomer;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getOrders() {
        return orders;
    }

    public void setOrders(Set orders) {
        this.orders = orders;
    }
}
