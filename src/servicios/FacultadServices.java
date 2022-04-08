/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Personas.Estudiante;
import Personas.Persona;
import enums.EstCivil;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gustavotorti
 */
public class FacultadServices {

     Scanner scn;
     ArrayList<Persona> gente;
     
     public FacultadServices(){
          scn  = new Scanner(System.in).useDelimiter("\n");
          gente  = new ArrayList();
          
          gente.add(new Estudiante("2A", "Ysaak", "Briceño", 32137199, EstCivil.SOLTERO));
     }

     public void menu() {
          String menu = """
                        Menu de facultad
                        ingrese opcion
                        1 - crear persona
                        2 - cambio estado civil
                        3 - matricularse en un curso
                        4 - Cambio de departamento (profesor)
                        5 - Traslado de sección (Personal de servicio)
                        6 - Imprimir toda la información de cada tipo de individuo
                        9     -    Salir
                        
                        """;
          int opcion = 0;
          do {               //do {
                    System.out.println(menu);
                    opcion = scn.nextInt();
                    switch (opcion) {
                         case 1:

                              break;
                         case 2:

                              break;
                         case 3:
                              
                              break;
                         case 4:

                              break;
                         case 5:

                              break;
                         case 6:

                              break;
                         case 9:
                              System.out.println("Chau");
                              break;
                         default:
                              System.out.println("no se conoce la opción");

                    }
          } while (opcion != 9);
     }
}
