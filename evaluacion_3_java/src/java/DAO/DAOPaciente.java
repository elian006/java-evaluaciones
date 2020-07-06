/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;



import Modelos.Paciente;
import Modelos.medico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Elian
 */
public class DAOPaciente extends Conexion{
    
    public int registrarPaciente(Paciente p) throws SQLException, ClassNotFoundException{
    conectar();
    String sentencia ="insert into medicos values(?,?,?,?,?,?)";
    PreparedStatement ps= obtenerPS(sentencia);
    ps.setInt(1, p.getRun_Paciente());
    ps.setString(2, p.getNombre());
    ps.setString(3,p.getApellidoP());
    ps.setString(4,p.getApellidoM());
    ps.setInt(5, p.getEdad());
    ps.setString(6,p.getSexo());
    int respuesta= ps.executeUpdate();
    desconectar();
    return respuesta;
    }
    
    public int ModificarPaciente(Paciente p) throws SQLException, ClassNotFoundException{
    conectar();
    String sentencia="update paciente set Nombre=?,set ApellidoP=?, set ApellidoM=?, set Edad=?, set sexo=?"+"where Run_paciente";
    PreparedStatement ps= obtenerPS(sentencia);
    ps.setString(1, p.getNombre());
    ps.setString(2,p.getApellidoP());
    ps.setString(3,p.getApellidoM());
    ps.setInt(4, p.getEdad());
    ps.setString(5,p.getSexo());
    ps.setInt(6, p.getRun_Paciente());
    int respuesta= ps.executeUpdate();
    desconectar();
    return respuesta;
    }
    
    public int EliminarPaciente(Paciente p) throws SQLException, ClassNotFoundException{
    conectar();
    String sentencia="delet from pacientes where Run_paciente=?";
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setInt(1, p.getRun_Paciente());       
        int respuesta= ps.executeUpdate();
        desconectar();
        return respuesta;
    }
        public Paciente obtenerPacientes(int Run_paciente) throws SQLException, ClassNotFoundException{
        conectar();
    String sentencia ="select*from pacientes where Run_pacientes=?";
        PreparedStatement ps= obtenerPS(sentencia);
        ps.setInt(1, Run_paciente);
        ResultSet rs = ps.executeQuery();
        Paciente p= null;
        if(rs.next()){
        p=new Paciente(rs.getInt("run_pacienes"),rs.getString("nombre"),rs.getString("apellidoP"),rs.getString("apellidoM"),rs.getInt("edad"),rs.getString("sexo"));
        
        }       
        desconectar();
        return p;
                }
    public ArrayList<Paciente>ontenerPacientes() throws SQLException, ClassNotFoundException{
        conectar();
        String sentencia ="select*from paciente";
        PreparedStatement ps= obtenerPS(sentencia);
        ResultSet rs = ps.executeQuery();
        ArrayList<Paciente>lista=new ArrayList();
        
        while(rs.next()){
        lista.add(new Paciente(rs.getInt("run_pacienes"),rs.getString("nombre"),rs.getString("apellidoP"),rs.getString("apellidoM"),rs.getInt("edad"),rs.getString("sexo")));
        }       
        desconectar();
        return lista;
    
    }
    }

