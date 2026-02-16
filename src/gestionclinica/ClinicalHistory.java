/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

import java.util.List;

/**
 *
 * @author sfriv
 */
public class ClinicalHistory {
    private String id;
    private List<ClinicalRecord> clinicalrecord;

    public ClinicalHistory() {
    }

    public ClinicalHistory(String id, List<ClinicalRecord> clinicalrecord) {
        this.id = id;
        this.clinicalrecord = clinicalrecord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ClinicalRecord> getClinicalrecord() {
        return clinicalrecord;
    }

    public void setClinicalrecord(List<ClinicalRecord> clinicalrecord) {
        this.clinicalrecord = clinicalrecord;
    }

    @Override
    public String toString() {
        return "ClinicalHistory{" + "id=" + id + ", clinicalrecord=" + clinicalrecord + '}';
    }
    
    
    
}
