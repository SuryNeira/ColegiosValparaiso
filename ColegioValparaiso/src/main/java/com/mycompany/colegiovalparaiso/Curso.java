/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colegiovalparaiso;

/**
 *
 * @author suris
 */
public class Curso {
    private char Letra;
    private int Ncurso;
    private int CantAlumnos;
    private Alumno[] alumnos;
    
    public char getLetra(){
        return Letra;
    }
    
    public int getNcurso(){
        return Ncurso;
    }
    
    public int getCantAlumnos(){
        return CantAlumnos;
    }
    
    public Alumno[] getAlumnos(){
        return alumnos;
        
    }
    
    public void setLetra(char Letra){
        this.Letra=Letra;
    }
    
    public void setNcurso(int Ncurso){
        this.Ncurso=Ncurso;
    }
    
    public void setCantAlumnos(int CantAlumnos){
        this.CantAlumnos=CantAlumnos;
    }
    
    public void setAlumno(Alumno[] alumnos){
        this.alumnos=alumnos;
        
    }
    
    //comportamientos
    
    public Alumno MenorPromedio(){
        int i;
        Alumno alumnoMenor = null;
        
        for(i=0; i<alumnos.length; i++){
            if(alumnoMenor == null || alumnos[i].calcularPromedio() < alumnoMenor.calcularPromedio())
            {
                alumnoMenor = alumnos[i]; 
            }
        }
        
       return alumnoMenor;
    }
    
}
