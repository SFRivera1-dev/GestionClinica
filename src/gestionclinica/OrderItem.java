/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class OrderItem {
    private String order_id, itemnumber, type;

    public OrderItem() {
    }

    public OrderItem(String order_id, String itemnumber, String type) {
        this.order_id = order_id;
        this.itemnumber = itemnumber;
        this.type = type;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getItemnumber() {
        return itemnumber;
    }

    public void setItemnumber(String itemnumber) {
        this.itemnumber = itemnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "order_id=" + order_id + ", itemnumber=" + itemnumber + ", type=" + type + '}';
    }
    
    
    
}
