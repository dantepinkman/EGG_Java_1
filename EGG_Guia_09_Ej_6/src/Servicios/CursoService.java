package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Curso c = new Curso(); //no va aca

    
    public String[] cargaAlumnos(){
        
        String[] alumnos = new String[5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Cual es el nombre del alumno?");
            alumnos[i] = leer.next();
            
            
        }
        
        return alumnos;
    }
    
    public Curso crearCurso(){
        
        Curso c = new Curso();
        String[] alumnos = cargaAlumnos();
        
        
        
        return c;
    }
     
/*
    public void cargaAlumnos(String[] al) {

        for (int i = 0; i < 5; i++) {

            System.out.println("Cual es el nombre del alumno?");
            al[i] = leer.next();

        }

    }

    public void crearCurso() {

        String[] alumnos = new String[5];
        cargaAlumnos(alumnos);

    }
*/
}
