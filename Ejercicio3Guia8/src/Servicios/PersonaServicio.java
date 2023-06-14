/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    Persona persona = new Persona();
    
    public void crearPersona(){
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        persona.setEdad(leer.nextInt());
        
        System.out.println("Ingrese sexo (H, M, O)");
        persona.setSexo(leer.next().charAt(0));
        char sexo = persona.getSexo();
        
        
        System.out.println("Ingrese peso y Altura");
        persona.setPeso(leer.nextDouble());
        persona.setAltura(leer.nextDouble());
       
    }
    
   
    
}
