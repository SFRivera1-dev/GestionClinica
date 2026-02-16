/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class ProcOrder extends OrderItem{
    private String item, quantity, frecuency, specialist; 
    private boolean is_specialst;

    public ProcOrder() {
    }

    public ProcOrder(String item, String quantity, String frecuency, String specialist, boolean is_specialst) {
        this.item = item;
        this.quantity = quantity;
        this.frecuency = frecuency;
        this.specialist = specialist;
        this.is_specialst = is_specialst;
    }

    public ProcOrder(String item, String quantity, String frecuency, String specialist, boolean is_specialst, String order_id, String itemnumber, String type) {
        super(order_id, itemnumber, type);
        this.item = item;
        this.quantity = quantity;
        this.frecuency = frecuency;
        this.specialist = specialist;
        this.is_specialst = is_specialst;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(String frecuency) {
        this.frecuency = frecuency;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public boolean isIs_specialst() {
        return is_specialst;
    }

    public void setIs_specialst(boolean is_specialst) {
        this.is_specialst = is_specialst;
    }

    @Override
    public String toString() {
        return "ProcOrder{" + "item=" + item + ", quantity=" + quantity + ", frecuency=" + frecuency + ", specialist=" + specialist + ", is_specialst=" + is_specialst + '}';
    }
    
    
    
    
    
    
}
