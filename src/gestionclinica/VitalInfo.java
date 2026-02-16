/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclinica;

/**
 *
 * @author sfriv
 */
public class VitalInfo {
    private String bloodpressure, temperature, pulse, oz;

    public VitalInfo() {
    }

    public VitalInfo(String bloodpressure, String temperature, String pulse, String oz) {
        this.bloodpressure = bloodpressure;
        this.temperature = temperature;
        this.pulse = pulse;
        this.oz = oz;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getOz() {
        return oz;
    }

    public void setOz(String oz) {
        this.oz = oz;
    }

    @Override
    public String toString() {
        return "VitalInfo{" + "bloodpressure=" + bloodpressure + ", temperature=" + temperature + ", pulse=" + pulse + ", oz=" + oz + '}';
    }
    
    
         
    
}
