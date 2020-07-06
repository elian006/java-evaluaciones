/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author avent
 */
public class Conexion {
    Connection conexion; // variable tipo Connection para la conexion a base de datos
    String url = "jdbc:mysql://localhost:3306/"; // inicio de la cadena de conexion
    String bd = "evaluacion3";  // variable para el nombre de nuestra base de datos
    String driver = "com.mysql.jdbc.Driver"; // driver de jdbc para mysql
    String usuario = "root"; // usuario de la base de datos
    String password = ""; // password del usuario de la base de datos
    
   
    public void conectar() throws ClassNotFoundException, SQLException, ClassNotFoundException, SQLException{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url+bd,usuario,password);
    }
    
    // Statement es un objeto mediante el cual se puede ingresar datos y obtener datos de la bd
    private Statement obtenerStatement() throws SQLException{
        return conexion.createStatement();
    }
    //este metodo permite desconectar la base de datos
    public void desconectar() throws SQLException{
        if(!conexion.isClosed()){
            conexion.close();
        }
    }
    public PreparedStatement obtenerPS(String sentencia) throws SQLException{
        return  conexion.prepareStatement(sentencia);
    }
    // devuelve un int(numero) haciendo referencia a cuantas filas fueron afectadas
    public int ejecutarSQL(String sentencia) throws SQLException{
        // sentencia puede ser un insert update delete || procedimiento almacenado
        return obtenerStatement().executeUpdate(sentencia);
    }
    
    // permite obtener info de la base de datos mediante una consulta de tipo select
    // ResultSet objeto capaz de recibir info de la bd y almacenarlo en forma de tabla
    public ResultSet consultarSql(String sentencia) throws SQLException{
        return obtenerStatement().executeQuery(sentencia);
    }
}
