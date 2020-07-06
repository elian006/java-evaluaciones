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
public class medico implements Serializable{
    
    private int id_medico;
    private String nombre;
    private String Apellido;
    private Especialidad especialidad;

    public medico(int id_medico, String nombre, String Apellido, Especialidad especialidad) {
        this.id_medico = id_medico;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.especialidad = especialidad;
    }

    public medico() {
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id_medico;
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
        final medico other = (medico) obj;
        if (this.id_medico != other.id_medico) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "medico{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
     
    
    
}
