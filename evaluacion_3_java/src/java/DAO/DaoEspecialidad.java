/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelos.Especialidad;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Elian
 */
public class DaoEspecialidad extends Conexion {
    
    
    public int registrarEspecialidad(Especialidad E) throws SQLException, ClassNotFoundException{
    conectar();
    String sentencia ="insert into especialidad values(?,?)";
    PreparedStatement ps= obtenerPS(sentencia);
    ps.setInt(1, E.getId_Especialidad());
    ps.setString(2,E.getNombre());
    int respuesta= ps.executeUpdate();
    desconectar();
    return respuesta;
    }
    
    public int modificarEspecialidad(Especialidad E) throws SQLException, ClassNotFoundException{
        conectar();
        String sentencia="update especialidad set Nombre=?"+"where ID_Especialidad=?";
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setString(1,E.getNombre());
        ps.setInt(2, E.getId_Especialidad());       
        int respuesta= ps.executeUpdate();
        desconectar();
   
    return respuesta;
    }
    
    public int EliminarEspecialidad(Especialidad E) throws SQLException, ClassNotFoundException{
    conectar();
    String sentencia="delet from Especialidad where ID_Especialidad=?";
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setInt(1, E.getId_Especialidad());       
        int respuesta= ps.executeUpdate();
        desconectar();
        return respuesta;
    }
    
    public Especialidad obtenerEspecialidad(int id_especialidad) throws SQLException, ClassNotFoundException{
        conectar();
    String sentencia ="select*from Especialidad where ID_Especialidad=?";
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setInt(1, id_especialidad);
        ResultSet rs = ps.executeQuery();
        Especialidad E= null;
        if(rs.next()){
        E=new Especialidad(rs.getInt("id_especialidad"),rs.getString("nombre"));
        
        }       
        desconectar();
        return E;
                }
    public ArrayList<Especialidad>ontenerEspecialidad() throws SQLException, ClassNotFoundException{
        conectar();
        String sentencia ="select*from Especialidad ";
        PreparedStatement ps= obtenerPS(sentencia);
        ResultSet rs = ps.executeQuery();
        ArrayList<Especialidad>lista=new ArrayList();
        
        while(rs.next()){
        lista.add(new Especialidad(rs.getInt("id_especialidad"),rs.getString("nombre"))
        );
        
        }       
        desconectar();
        return lista;
    
    }
    
}
