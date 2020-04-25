/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.obligatorio.pkg1;

import java.util.List;

/**
 *
 * @author maty
 */
public class Gerente extends Empleado{

    public Gerente(String cedula, String nombre, String direccion, double sueldoMensual, int tipoEmpleado, double liquidoACobrar) {
        super(cedula, nombre, direccion, sueldoMensual, tipoEmpleado, liquidoACobrar);
    }

   
    
        public double sueldoGerente ( double sueldo ){
             
        sueldo = sueldo + (sueldo * 0.97);
        
        return sueldo;
    }
    
}
