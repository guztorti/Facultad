/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Personas;

import enums.EstCivil;

/**
 *
 * @author gustavotorti
 */
public class Persona {

     protected String nombre;
     protected String apellidos;
     protected Integer numIdentPers;
     protected EstCivil estadoCivil;

     public Persona() {
     }

     public Persona(String nombre, String apellidos, Integer numIdentPers, EstCivil estadoCivil) {
          this.nombre = nombre;
          this.apellidos = apellidos;
          this.numIdentPers = numIdentPers;
          this.estadoCivil = estadoCivil;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getApellidos() {
          return apellidos;
     }

     public void setApellidos(String apellidos) {
          this.apellidos = apellidos;
     }

     public Integer getNumIdentPers() {
          return numIdentPers;
     }

     public void setNumIdentPers(Integer numIdentPers) {
          this.numIdentPers = numIdentPers;
     }

     public EstCivil getEstadoCivil() {
          return estadoCivil;
     }

     public void setEstadoCivil(EstCivil estadoCivil) {
          this.estadoCivil = estadoCivil;
     }

     @Override
     public String toString() {
          return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numIdentPers=" + numIdentPers + ", estadoCivil=" + estadoCivil + '}';
     }
     
     
}
