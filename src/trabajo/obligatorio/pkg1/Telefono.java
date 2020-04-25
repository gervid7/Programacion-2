/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.obligatorio.pkg1;

/**
 *
 * @author maty
 */
public class Telefono {
    int telefono;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public Telefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        
        return ""+this.telefono;
    }
    
    
}
