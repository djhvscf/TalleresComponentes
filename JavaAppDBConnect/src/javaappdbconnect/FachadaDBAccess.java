/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappdbconnect;

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
}