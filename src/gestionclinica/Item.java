/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class Item {
   private String id, name, cost;
   private Itemtype type;

    public Item() {
    }

    public Item(String id, String name, String cost, Itemtype type) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Itemtype getType() {
        return type;
    }

    public void setType(Itemtype type) {
        this.type = type;
    }
   
   
    
}
