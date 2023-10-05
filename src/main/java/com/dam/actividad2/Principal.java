/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.actividad2;

import java.util.ArrayList;

/**
 *
 * @author diegoposti
 */
public class Principal {

  
  public static ArrayList<Alumno> arrayAlumnos = new ArrayList<>();
  
 public static void main(String args[]) {
 Formulario f = new Formulario();
 f.setVisible(true);
 

 
 }

  public static void guardarAlumno(Alumno alumno){
      arrayAlumnos.add(alumno);
    
    }
 } 

