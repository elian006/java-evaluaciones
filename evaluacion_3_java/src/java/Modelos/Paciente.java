/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;

/**
 *
 * @author Elian
 */
public class Paciente implements Serializable {
    
    
    private int run_Paciente;
    private String nombre;
    private String ApellidoP;
    private String apellidoM;
    private int edad;
    private String sexo;

    public Paciente(int run_Paciente, String nombre, String ApellidoP, String apellidoM, int edad, String sexo) {
        this.run_Paciente = run_Paciente;
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Paciente() {
    }

    public int getRun_Paciente() {
        return run_Paciente;
    }

    public void setRun_Paciente(int run_Paciente) {
        this.run_Paciente = run_Paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.run_Paciente;
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
        final Paciente other = (Paciente) obj;
        if (this.run_Paciente != other.run_Paciente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paciente{" + "run_Paciente=" + run_Paciente + ", nombre=" + nombre + ", ApellidoP=" + ApellidoP + ", edad=" + edad + '}';
    }
    
}
