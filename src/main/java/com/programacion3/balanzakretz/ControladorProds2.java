package com.programacion3.balanzakretz;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gian
 */
public class ControladorProds2 {
    public Producto buscarProducto(String codigo, Producto prod) {
        boolean existe = false;
        String codigoReal = codigo.substring(2,6);
        try {
            Conexion myCnx = new Conexion();
            myCnx.conectar();
            PreparedStatement st = (PreparedStatement) myCnx.getCon().prepareStatement("SELECT * FROM kioskito.productos2 WHERE codProd = ?");
            st.setString(1, codigoReal);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()) {
                prod.setNombre(rs.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
        
        return prod;
    }
}
