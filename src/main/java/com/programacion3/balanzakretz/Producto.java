package com.programacion3.balanzakretz;

/**
 *
 * @author gian
 */
public class Producto {
    private int id_producto;
    private String codigoDeBarra;
    private String nombre;
    private float precioPorKg;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioPorKg() {
        return precioPorKg;
    }

    public void setPrecioPorKg(float precioPorKg) {
        this.precioPorKg = precioPorKg;
    }
}
