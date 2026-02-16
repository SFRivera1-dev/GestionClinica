/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class ClinicalVisit {
    private Patient patient;
    private VitalInfo vitalinfo;
    private String observation;
    private Order order;
    private Item item;

    public ClinicalVisit() {
    }

    public ClinicalVisit(Patient patient, VitalInfo vitalinfo, String observation, Order order, Item item) {
        this.patient = patient;
        this.vitalinfo = vitalinfo;
        this.observation = observation;
        this.order = order;
        this.item = item;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VitalInfo getVitalinfo() {
        return vitalinfo;
    }

    public void setVitalinfo(VitalInfo vitalinfo) {
        this.vitalinfo = vitalinfo;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "ClinicalVisit{" + "patient=" + patient + ", vitalinfo=" + vitalinfo + ", observation=" + observation + ", order=" + order + ", item=" + item + '}';
    }

    
    
            
            
    
}
