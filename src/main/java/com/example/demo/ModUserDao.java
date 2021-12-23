package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModUserDao implements UserDao {
    public ModUserDao(){
    }

    @Override
    public String retrievePassword(String username){
        Connection connection = DbManager.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet r = stmt.executeQuery("SELECT * FROM modUsers WHERE username=" + username);

            if(r.next())
            {
                return r.getString(0);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    return null;
    }
    //gli utenti amministratori sono registrati a priori nel database e non necessitano di una fase di registrazione
    @Override
    public boolean createUser(String username, String password){
        Connection connection = DbManager.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet r = stmt.executeQuery("INSERT INTO modUsers VALUES ("+ username + "," + PwHashing.hashing(password, null) + ")");
            /*ps.setString(1, username);
            ps.setString(2, password);
            int i = ps.executeUpdate();*/
    
            if(r.next()) {
                return true;
            }
    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
        return false;
    }
}