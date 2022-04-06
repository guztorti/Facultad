/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Personas;

import enums.Departamentos;
import enums.EstCivil;
import enums.Seccion;
import interfaces.DeServicio;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gustavotorti
 */
public class Maestranza extends Empleado implements DeServicio{

     private String sector;

     public Maestranza(Date anioIncorporacion, Integer nroDespacho, String nombre, String apellidos, Integer numIdentPers, EstCivil estadoCivil) {
          super(anioIncorporacion, nroDespacho, nombre, apellidos, numIdentPers, estadoCivil);
          this.sector = sector();
     }
     

     @Override
     public String sector() {
          Scanner scn = new Scanner(System.in).useDelimiter("\n");
          String sector = "";
          boolean existe = false;
          do {
               System.out.println("¿a qué departamento pertenece?");
               for (Object dept : Departamentos.values()) {
                    System.out.print(dept + ", ");
               }
               sector = scn.next();
               for (Seccion area : Seccion.values()) {
                    if (area.name().equalsIgnoreCase(sector)) {
                    existe = true;
               }
               }
               
          } while (existe);
          return sector;
     }
}
