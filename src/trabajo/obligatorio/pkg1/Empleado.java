/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.obligatorio.pkg1;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    
   
    private String cedula ;
    private String nombre ;
    private String direccion ;
    private List<Telefono> telefono ;
    private double sueldoMensual;
    private int tipoEmpleado;
    private double liquidoACobrar;

    public Empleado(String cedula, String nombre, String direccion, double sueldoMensual, int tipoEmpleado, double liquidoACobrar) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = new ArrayList<Telefono>();
        this.sueldoMensual = sueldoMensual;
        this.tipoEmpleado = tipoEmpleado;
        this.liquidoACobrar = liquidoACobrar;
    }

    
    
    public double getLiquidoACobrar() {
        return liquidoACobrar;
    }

    public void setLiquidoACobrar(double liquidoACobrar) {
        this.liquidoACobrar = liquidoACobrar;
    }


        
    public List<Telefono> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<Telefono> telefono) {
        this.telefono = telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

  

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }



    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", sueldoMensual=" + sueldoMensual + ", tipoEmpleado=" + tipoEmpleado + ", liquidoACobrar=" + liquidoACobrar + '}';
    }
    
 
    
}

