package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseUserDao implements UserDao {
    public BaseUserDao(){
    }

    @Override
    public String retrievePassword(String username){
        Connection connection = DbManager.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet r = stmt.executeQuery("SELECT password FROM baseUsers WHERE username='" + username + "'");

            if(r.next())
            {
                return r.getString(1);
            } else {
                return "";
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    return "";
    }

    @Override
    public boolean createUser(String username, String password){
        Connection connection = DbManager.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("INSERT INTO baseUsers VALUES ('"+ username + "','" + password + "')");
            /*ps.setString(1, username);
            ps.setString(2, password);
            int i = ps.executeUpdate();*/
            if (i==1) {
                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
        return false;
    }
}