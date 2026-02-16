/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class ClinicalRecord {
    private String date, motive, synthoms, diagnosis;
    private User doctor;

    public ClinicalRecord() {
    }

    public ClinicalRecord(String date, String motive, String synthoms, String diagnosis, User doctor) {
        this.date = date;
        this.motive = motive;
        this.synthoms = synthoms;
        this.diagnosis = diagnosis;
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public String getSynthoms() {
        return synthoms;
    }

    public void setSynthoms(String synthoms) {
        this.synthoms = synthoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "ClinicalRecord{" + "date=" + date + ", motive=" + motive + ", synthoms=" + synthoms + ", diagnosis=" + diagnosis + ", doctor=" + doctor + '}';
    }
    
    
    
    
}
