package com.programacion3.balanzakretz;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String DRIVER = "com.mysql.jdbc.Driver"; 
    private static final String URL = "jdbc:mysql://localhost:3306/kioskito";
    private static final String USER = "vendedor";
    private static final String CLAVE = "kiosko";
    private Connection con = null;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void conectar() {
        try {
            Connection c = DriverManager.getConnection(URL, USER, CLAVE);
            setCon(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
