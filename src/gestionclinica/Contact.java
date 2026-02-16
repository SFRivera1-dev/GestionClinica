/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class Contact extends Person{
    private String relation;

    public Contact() {
    }

    public Contact(String relation) {
        this.relation = relation;
    }

    public Contact(String relation, String name, String document, String birthdate, String adress, String cellphone, String email) {
        super(name, document, birthdate, adress, cellphone, email);
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "Contact{" + "relation=" + relation + '}';
    }
    
    
    
}
