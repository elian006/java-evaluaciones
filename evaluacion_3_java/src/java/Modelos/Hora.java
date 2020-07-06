/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Elian
 */
public class Hora implements Serializable{
    
    private int id_hora;
    private int run_paciente;
    private String medico;
    private Date hora;
    private Date fecha_Atencion;

    public Hora(int id_hora, int run_paciente, String medico, Date hora, Date fecha_Atencion) {
        this.id_hora = id_hora;
        this.run_paciente = run_paciente;
        this.medico = medico;
        this.hora = hora;
        this.fecha_Atencion = fecha_Atencion;
    }

    public Hora() {
    }

    public int getId_hora() {
        return id_hora;
    }

    public void setId_hora(int id_hora) {
        this.id_hora = id_hora;
    }

    public int getRun_paciente() {
        return run_paciente;
    }

    public void setRun_paciente(int run_paciente) {
        this.run_paciente = run_paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha_Atencion() {
        return fecha_Atencion;
    }

    public void setFecha_Atencion(Date fecha_Atencion) {
        this.fecha_Atencion = fecha_Atencion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id_hora;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hora other = (Hora) obj;
        if (this.id_hora != other.id_hora) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hora{" + "run_paciente=" + run_paciente + ", medico=" + medico + ", hora=" + hora + ", fecha_Atencion=" + fecha_Atencion + '}';
    }
    
    
    
}
