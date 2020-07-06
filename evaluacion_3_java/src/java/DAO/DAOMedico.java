/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelos.medico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelos.Especialidad;
/**
 *
 * @author Elian
 */
public class DAOMedico extends Conexion{
    
   
    public int registrarMedico(medico M) throws SQLException, ClassNotFoundException{
        try{
    conectar();
    String sentencia ="insert into medicos values(?,?,?,?)";
    PreparedStatement ps= obtenerPS(sentencia);
    ps.setInt(1, M.getId_medico());
    ps.setString(2, M.getNombre());
    ps.setString(3,M.getApellido());
    ps.setInt(4,M.getEspecialidad().getId_Especialidad());
    int respuesta= ps.executeUpdate();
    return respuesta;
        }catch(SQLException | ClassNotFoundException ex){
        throw ex;
        }
        finally{
            desconectar();
        }
    }
        public int modificarMedico(medico M) throws SQLException, ClassNotFoundException{
        conectar();
        String sentencia="update medicos set Nombre=?, set apellido=?,set especialidad=?"+"where Id_medico=?";
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setString(1,M.getNombre());
        ps.setString(2,M.getApellido());
        ps.setString(3,M.getEspecialidad().getId_Especialidad());
        ps.setInt(4, M.getId_medico());       
        int respuesta= ps.executeUpdate();
        desconectar();
   
    return respuesta;
    }
}
