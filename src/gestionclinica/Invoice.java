/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;


public class Invoice {
    private Patient patient;
    private User Doctor;
    private Order order;
    private String date;
    private boolean copago;

    public Invoice() {
    }

    public Invoice(Patient patient, User Doctor, Order order, String date, boolean copago) {
        this.patient = patient;
        this.Doctor = Doctor;
        this.order = order;
        this.date = date;
        this.copago = copago;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public User getDoctor() {
        return Doctor;
    }

    public void setDoctor(User Doctor) {
        this.Doctor = Doctor;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isCopago() {
        return copago;
    }

    public void setCopago(boolean copago) {
        this.copago = copago;
    }

    @Override
    public String toString() {
        return "Invoice{" + "patient=" + patient + ", Doctor=" + Doctor + ", order=" + order + ", date=" + date + ", copago=" + copago + '}';
    }
    
    
    
}
