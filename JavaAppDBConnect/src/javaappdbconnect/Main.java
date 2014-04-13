/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappdbconnect;

/**
 *
 * @author Dennis
 */
public class Main {
  public static void main(String[] args) throws Exception {
   /* DBConnection dao = new DBConnection();
    dao.readDataBase("s",",");*/
    
    FachadaDBAccess c = new FachadaDBAccess();
    c.cargarCombo();
  }


} 
