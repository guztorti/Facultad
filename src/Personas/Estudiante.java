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
public class Estudiante extends Persona{

     private String curso;

     public Estudiante() {
     }

     public Estudiante(String curso, String nombre, String apellidos, Integer numIdentPers, EstCivil estadoCivil) {
          super(nombre, apellidos, numIdentPers, estadoCivil);
          this.curso = curso;
     }

     public String getCurso() {
          return curso;
     }

     public void setCurso(String curso) {
          this.curso = curso;
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
          return "Estudiante{"+super.toString() + "curso=" + curso + '}';
     }
     
}
