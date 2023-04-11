/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por
sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de 
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa
los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en
cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class Ej_Extra_4_OtraPersona {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double[] vector = new double[10];
        double nota1;
        double nota2;
                
        double nota3;
        double nota4;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("NOTAS Alumno N°"+(i+1));
            System.out.println("Notas por Trabajos Practicos");
            nota1 = leer.nextInt();
            nota2 = leer.nextInt();
            System.out.println("Notas por Parciales");
            nota3 = leer.nextInt();
            nota4 = leer.nextInt();
            
            double promedio = ((nota1*(10/100)) + (nota2*0.15) + (nota3*0.25) + (nota4*0.50)) / 4;
            vector[i] = promedio;
            
            if(vector[i] >= 7){
                System.out.println("Alumno N°"+(i+1)+" esta APROBADO");
            } else{
                System.out.println("Alumno N°"+(i+1)+" esta DESAPROBADO");
            }
            System.out.println();
            promedio = 0;
        }
    }
}
