/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappdbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Dennis
 */
public class FachadaDBAccess {
    
    private DBConnection dbConnection;
    
    public Boolean isValidUser(String psUserName, String psPassword) throws Exception
    {
        dbConnection = new DBConnection();
        return dbConnection.readDataBase(psUserName, psPassword);
    }
    
    public DefaultComboBoxModel cargarCombo() throws SQLException, ClassNotFoundException
    {
            dbConnection = new DBConnection();
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            ResultSet rs = dbConnection.cargarLenguaje();
            while (rs.next()) {
                modeloCombo.addElement(rs.getObject("nombre"));
            }
            rs.close();
            
            return modeloCombo;
    }
}