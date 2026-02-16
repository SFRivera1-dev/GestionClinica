/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class Policy {
    private Company company;
    private String id, status, urgency;

    public Policy() {
    }

    public Policy(Company company, String id, String status, String urgency) {
        this.company = company;
        this.id = id;
        this.status = status;
        this.urgency = urgency;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "Policy{" + "company=" + company + ", id=" + id + ", status=" + status + ", urgency=" + urgency + '}';
    }
    
    
}
