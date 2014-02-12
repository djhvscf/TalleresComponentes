/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappdbconnect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dennis
 */
public class DBConnection {
    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    
    protected boolean readDataBase(String psUserName, String psPassword) throws Exception {
    try {
        
            String driverClassName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/cenfotecadb";
            String username = "root"; 
            String password = "admin10";
      Class.forName(driverClassName);
      connect = DriverManager
              .getConnection(url,username, password);
      statement = connect.createStatement();
      resultSet = statement.executeQuery("select * from usuario where email = '" + psUserName + "' AND password='" + psPassword + "'");
      if(resultSet.next())
      {
          return true;
      }
      else   
      {
          return false;
      }
    } catch (Exception e) {
        throw e;
    } finally {
      close();
    }

  }

  // You need to close the resultSet
  private void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connect != null) {
        connect.close();
      }
    } catch (Exception e) {

    }
  }

}
