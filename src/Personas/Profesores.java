/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Personas;

import enums.Departamentos;
import enums.EstCivil;
import interfaces.Profesor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gustavotorti
 */
public class Profesores extends Empleado implements Profesor {

     private String departamento;

     public Profesores(String departamento, Date anioIncorporacion, Integer nroDespacho, String nombre, String apellidos, Integer numIdentPers, EstCivil estadoCivil) {
          super(anioIncorporacion, nroDespacho, nombre, apellidos, numIdentPers, estadoCivil);
          this.departamento = departamento;
     }

     

     @Override
     public String departamento() {
          Scanner scn = new Scanner(System.in).useDelimiter("\n");
          String area = "";
          boolean existe = false;
          do {
               System.out.println("¿a qué departamento pertenece?");
               for (Object dept : Departamentos.values()) {
                    System.out.print(dept + ", ");
               }
               area = scn.next();
               for (Departamentos departamento : Departamentos.values()) {
                    if (departamento.name().equalsIgnoreCase(area)) {
                    existe = true;
               }
               }
               
          } while (existe);
          return area;
     }

     @Override
     public String toString() {
          return "Profesores{"+super.toString() + "departamento=" + departamento + '}';
     }
     

}
