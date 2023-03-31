/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.colegiovalparaiso.Curso;

/**
 *
 * @author suris
 */
public class Colegio {
    private String Nombre;
    private String NombreDirector;
    private Curso[] cursos;
    
    public Curso[] getCurso(){
        return cursos;
    }
    
    public String getNombreDirector(){
        return NombreDirector;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setCurso(Curso[] cursos){
        this.cursos=cursos;
    }
    
    public void setNombreDirector(String NombreDirector){
        this.NombreDirector=NombreDirector;
    }
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public Curso[] CursosConAlumnosMenorPromedio(){
        Curso[] peoresCursos = new Curso[cursos.length];
        Curso peorCursoTemp= null;
        int i,j;
        
        System.arraycopy(cursos, 0, peoresCursos, 0, cursos.length);
        
        for(i=0;i<peoresCursos.length-1;i++){
            for(j=0; j<peoresCursos.length-i-1;i++){
                
                if(peoresCursos[j].MenorPromedio().calcularPromedio() < peoresCursos[j+1].MenorPromedio().calcularPromedio()){
                    peorCursoTemp=peoresCursos[j];
                    peoresCursos[j]=peoresCursos[j+1];
                    peoresCursos[j+1]=peorCursoTemp;
                    
                }
                
            }
        }
        
        return peoresCursos;
       
    }
}


