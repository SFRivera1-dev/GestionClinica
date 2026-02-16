/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class Patient extends Person{
    private String gender;
    private Contact contact;
    private Policy policy;

    public Patient() {
    }

    public Patient(String gender, Contact contact, Policy policy) {
        this.gender = gender;
        this.contact = contact;
        this.policy = policy;
    }

    public Patient(String gender, Contact contact, Policy policy, String name, String document, String birthdate, String adress, String cellphone, String email) {
        super(name, document, birthdate, adress, cellphone, email);
        this.gender = gender;
        this.contact = contact;
        this.policy = policy;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    @Override
    public String toString() {
        return "Patient{" + "gender=" + gender + ", contact=" + contact + ", policy=" + policy + '}';
    }
    
    
    
}
