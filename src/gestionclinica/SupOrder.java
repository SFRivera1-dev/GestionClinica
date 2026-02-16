/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class SupOrder{
    private Item item;
    private boolean is_specialist;
    private String specialist, quantity;

    public SupOrder() {
    }

    public SupOrder(Item item, boolean is_specialist, String specialist, String quantity) {
        this.item = item;
        this.is_specialist = is_specialist;
        this.specialist = specialist;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isIs_specialist() {
        return is_specialist;
    }

    public void setIs_specialist(boolean is_specialist) {
        this.is_specialist = is_specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SupOrder{" + "item=" + item + ", is_specialist=" + is_specialist + ", specialist=" + specialist + ", quantity=" + quantity + '}';
    }

   
    
    
    
    
}
