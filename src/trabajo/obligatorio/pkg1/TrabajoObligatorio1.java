/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.obligatorio.pkg1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author maty
 */
public class TrabajoObligatorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        List<Telefono> listTel = new ArrayList<Telefono>();
        int salirMenu = 1;

        List<Empleado> listEmpleado = new ArrayList<Empleado>();
        int numeroEmpleado = -1;

        System.out.println("ingrese la cantidad de empleados a ingresar");

        while (salirMenu != 0 || listEmpleado.size() < numeroEmpleado) {
            numeroEmpleado = Sc.nextInt();

            String nombre = "";
            String cedula = "";
            String direccion = "";
            int telefono = 0;
            double sueldo = 0;
            int menuTel = 0;
            int topeTel = 0;
            int menuTipoEmpleado = 0;

            do {
                System.out.println("1)Registro de Empleados");
                System.out.println("2)Importe total a pagar por concepto de sueldos.");
                System.out.println("3)Salir");
                salirMenu = Sc.nextInt();
                switch (salirMenu) {
                    case 1:

                        System.out.println("Ingrese nombre");
                        nombre = Sc.next();
                        System.out.println("Ingrese cedula");
                        cedula = Sc.next();
                        System.out.println("Ingrese Dirección");
                        direccion = Sc.next();
                        do {
                            if (topeTel < 4) {
                                System.out.println("Ingrese telefono/telefonos");
                                System.out.println("1-Agregar");
                                System.out.println("2-Salir");
                                menuTel = Sc.nextInt();
                                switch (menuTel) {
                                    case 1:
                                        System.out.println("Ingrese numero de telefono");
                                        telefono = Sc.nextInt();
                                        Telefono tel = new Telefono(telefono);
                                        listTel.add(tel);
                                        break;
                                    case 2:
                                        menuTel = 0;
                                        break;
                                    default:
                                        System.out.println("Ingrese una opción correcta");
                                }
                            } else {
                                System.out.println("Supero el numero maximo de telefonos disponibles para guardar");
                                menuTel = 0;
                            }

                        } while (menuTel != 0);

                        System.out.println("Ingrese sueldo");
                        sueldo = Sc.nextInt();

                        System.out.println("Ingrese el tipo de empleado \n1-Operario \n2-Adminidtrativo\n3-Gerente");
                        menuTipoEmpleado = Sc.nextInt();
                        switch (menuTipoEmpleado) {
                            case 1:
                                Operario operario = new Operario("", "", "", 0, 0, 0);
                                List<Telefono> listTelOperario = listTel;
                                for (Telefono telefono1 : listTelOperario) {
                                    operario.getTelefono().add(telefono1);
                                }
                                operario.setCedula(cedula);
                                operario.setNombre(nombre);
                                operario.setDireccion(direccion);
                                operario.setSueldoMensual(sueldo);
                                operario.setTipoEmpleado(menuTipoEmpleado);
                                operario.setLiquidoACobrar(operario.sueldoOperario(sueldo));
                                listTel.clear();
                                listEmpleado.add(operario);

                                break;
                            case 2:
                                Administrativo administrativo = new Administrativo("", "", "", 0, 0, 0);
                                List<Telefono> listTelAdmistrativo = listTel;
                                for (Telefono telefono1 : listTelAdmistrativo) {
                                    administrativo.getTelefono().add(telefono1);
                                }
                                administrativo.setCedula(cedula);
                                administrativo.setNombre(nombre);
                                administrativo.setDireccion(direccion);
                                administrativo.setSueldoMensual(sueldo);
                                administrativo.setTipoEmpleado(menuTipoEmpleado);
                                administrativo.setLiquidoACobrar(administrativo.sueldoAdministrativo(sueldo));
                                listTel.clear();
                                listEmpleado.add(administrativo);
                                break;
                            case 3:
                                Gerente Gerente = new Gerente("", "", "", 0, 0, 0);
                                List<Telefono> listTelGerente = listTel;
                                for (Telefono telefono1 : listTelGerente) {
                                    Gerente.getTelefono().add(telefono1);
                                }
                                Gerente.setCedula(cedula);
                                Gerente.setNombre(nombre);
                                Gerente.setDireccion(direccion);
                                Gerente.setSueldoMensual(sueldo);
                                Gerente.setTipoEmpleado(menuTipoEmpleado);
                                Gerente.setLiquidoACobrar(Gerente.sueldoGerente(sueldo));
                                listTel.clear();
                                listEmpleado.add(Gerente);
                                break;
                        }

                        break;
                    case 2:

                        for (Empleado em : listEmpleado) {

                            System.out.println(em);
                        }

                        break;
                    case 3:
                        salirMenu = 0;
                        numeroEmpleado = -1;
                        break;
                }

            } while (salirMenu != 0);
        }
    }

}
