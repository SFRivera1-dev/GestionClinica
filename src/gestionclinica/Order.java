/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

import java.util.List;

/**
 *
 * @author sfriv
 */
public class Order {
    private String id, date;
    private User doctor;
    private Patient patient;
    private List<OrderItem> orderitem;

    public Order() {
    }

    public Order(String id, String date, User doctor, Patient patient, List<OrderItem> orderitem) {
        this.id = id;
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
        this.orderitem = orderitem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<OrderItem> getOrderitem() {
        return orderitem;
    }

    public void setOrderitem(List<OrderItem> orderitem) {
        this.orderitem = orderitem;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", date=" + date + ", doctor=" + doctor + ", patient=" + patient + ", orderitem=" + orderitem + '}';
    }
    
    
    
}
