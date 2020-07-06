/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelos.Especialidad;
import Modelos.medico;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Elian
 */
public class DAOMedico extends Conexion{
    
    public int registrarMedico(medico M) throws SQLException, ClassNotFoundException{
    conectar();
    String sentencia ="insert into medicos values(?,?,?,?)";
    PreparedStatement ps= obtenerPS(sentencia);
    ps.setInt(1, M.getId_medico());
    ps.setString(2, M.getNombre());
    ps.setString(3,M.getApellido());
    
    int respuesta= ps.executeUpdate();
    desconectar();
    return respuesta;
    }
    
}
