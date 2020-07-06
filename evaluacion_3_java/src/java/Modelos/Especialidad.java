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
public class Especialidad implements Serializable{
    
    private int id_Especialidad;
    private String Nombre;

    public Especialidad(int id_Especialidad, String Nombre) {
        this.id_Especialidad = id_Especialidad;
        this.Nombre = Nombre;
    }

    public Especialidad() {
    }

    public int getId_Especialidad() {
        return id_Especialidad;
    }

    public void setId_Especialidad(int id_Especialidad) {
        this.id_Especialidad = id_Especialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id_Especialidad;
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
        final Especialidad other = (Especialidad) obj;
        if (this.id_Especialidad != other.id_Especialidad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "Nombre=" + Nombre + '}';
    }
    
    
}
