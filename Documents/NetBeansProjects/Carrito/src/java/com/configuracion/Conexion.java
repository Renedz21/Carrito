package com.configuracion;

import java.sql.*;

public class Conexion {

    Connection con;
    String url = "jdbc:mysql://localhost:3306/bd_carrito_compras";
    String user = "root";
    String pass = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {

        }
        return con;
    }
}