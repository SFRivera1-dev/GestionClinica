/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class MedicalOrder extends OrderItem{
    private String poc, duration;
    private Item item;

    public MedicalOrder() {
    }

    public MedicalOrder(String poc, String duration, Item item) {
        this.poc = poc;
        this.duration = duration;
        this.item = item;
    }

    public MedicalOrder(String poc, String duration, Item item, String order_id, String itemnumber, String type) {
        super(order_id, itemnumber, type);
        this.poc = poc;
        this.duration = duration;
        this.item = item;
    }

    public String getPoc() {
        return poc;
    }

    public void setPoc(String poc) {
        this.poc = poc;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "MedicalOrder{" + "poc=" + poc + ", duration=" + duration + ", item=" + item + '}';
    }
    
    
    
    
    
}
