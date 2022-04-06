/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Personas;

import enums.EstCivil;
import java.util.Date;

/**
 *
 * @author gustavotorti
 */
public class Empleado extends Persona {
     protected Date anioIncorporacion;
     protected Integer nroDespacho;

     public Empleado(Date anioIncorporacion, Integer nroDespacho, String nombre, String apellidos, Integer numIdentPers, EstCivil estadoCivil) {
          super(nombre, apellidos, numIdentPers, estadoCivil);
          this.anioIncorporacion = anioIncorporacion;
          this.nroDespacho = nroDespacho;
     }

     public Date getAnioIncorporacion() {
          return anioIncorporacion;
     }

     public void setAnioIncorporacion(Date anioIncorporacion) {
          this.anioIncorporacion = anioIncorporacion;
     }

     public Integer getNroDespacho() {
          return nroDespacho;
     }

     public void setNroDespacho(Integer nroDespacho) {
          this.nroDespacho = nroDespacho;
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
          return "Empleado{"+super.toString() + "anioIncorporacion=" + anioIncorporacion + ", nroDespacho=" + nroDespacho + '}';
     }
     
     
}
