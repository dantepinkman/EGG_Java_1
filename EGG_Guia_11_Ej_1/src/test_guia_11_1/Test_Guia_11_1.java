
//1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.


package test_guia_11_1;

import Entidades.Perro;
import Entidades.Persona;

public class Test_Guia_11_1 {

    public static void main(String[] args) {
     
        Perro dog = new Perro("pepe","bulldog",2,"grande");
        Persona per = new Persona("juan","gomez",30,312312312,dog);
        
        System.out.println(per.toString());
        //System.out.println(dog.toString());
    }
    
}
