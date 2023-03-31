/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colegiovalparaiso;

/**
 *
 * @author suris
 */
public class Alumno {
    private String Nombre;
    private int Rut;
    private String Email;
    private double [] Notas;
    
   
    public String getNombre(){
        return Nombre;
    }
    
    public int getRut(){
        return Rut;
    }
     public double[] getNotas(){
        return Notas;
    }
     
    public String getEmail(){
        return Email;
    }
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public void setRut(int Rut){
        this.Rut=Rut;
    }
    
    public void setNotas(double[] Notas){
        this.Notas=Notas;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    
    //comportamientos u
    
    public double calcularPromedio(){
        double Promedio =0;
        int i,cont=0;
        
        for(i=0; i<Notas.length; i++){
            Promedio+= Notas[i];
            cont++;
        }
        
        if(cont>0){
           Promedio=Promedio/Notas.length;
        }
        return Promedio;
    }
}
