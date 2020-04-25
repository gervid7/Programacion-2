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
public class Operario extends Empleado{

    public Operario(String cedula, String nombre, String direccion, double sueldoMensual, int tipoEmpleado, double liquidoACobrar) {
        super(cedula, nombre, direccion, sueldoMensual, tipoEmpleado, liquidoACobrar);
        
    }

    


    
    public  double sueldoOperario ( double sueldo ){
             
        sueldo = sueldo + (sueldo * 0.38);
        
        return sueldo;
    }
    
    
}
