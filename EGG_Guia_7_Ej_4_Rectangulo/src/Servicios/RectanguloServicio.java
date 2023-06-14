/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Gianni
 */
public class RectanguloServicio {
    
    int superficie;
    double perimetro;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo rect = new Rectangulo();
    
    public void superficieRectangulo() {
        System.out.println("Cual es la base y la altura?");
        rect.setBase(leer.nextInt());
        rect.setAltura(leer.nextInt());
        superficie = rect.getAltura() * rect.getBase();
        
    }

    public void perimetroRectangulo() {
        perimetro = Math.pow(rect.getAltura()+rect.getBase(), 2);
    }
    
    public void mostrar() {
        System.out.println("la superficie es " + superficie + " el perimetro es " + perimetro);
    }
    
    public void diujarRectangulo() {
        
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
    
}
