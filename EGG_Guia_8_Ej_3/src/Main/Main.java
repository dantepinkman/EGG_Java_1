/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo 
(‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan 
a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir,
H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da 
por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0.
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos,
por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 */
package Main;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        int[] vectorIMC = new int[4];
        boolean[] vectorEdad = new boolean[4];

        PersonaServicio P = new PersonaServicio();
        Persona perso = P.crearPersona();
        vectorEdad[0] = P.esMayorDeEdad();
        vectorIMC[0] = P.calcularIMC(perso);

        PersonaServicio P1 = new PersonaServicio();
        Persona perso1 = P.crearPersona();
        vectorEdad[1] = P.esMayorDeEdad();
        vectorIMC[1] = P.calcularIMC(perso);

        PersonaServicio P2 = new PersonaServicio();
        Persona perso2 = P.crearPersona();

        vectorEdad[2] = P.esMayorDeEdad();
        vectorIMC[2] = P.calcularIMC(perso);

        PersonaServicio P3 = new PersonaServicio();
        Persona perso3 = P.crearPersona();
        vectorEdad[3] = P.esMayorDeEdad();
        vectorIMC[3] = P.calcularIMC(perso);

        int contadorbajo = 0;
        int contadoralto = 0;
        int contadorideal = 0;
        int contadormayor = 0;
        int contadormenor = 0;
        
        int suma = 0;
        int porcentaje = 0;

        for (int i = 0; i < 4; i++) {

            if (vectorEdad[i] == true) {
                contadormayor++;
            } else {
                contadormenor++;
            }

            if (vectorIMC[i] <= -1) {
                contadorbajo++;

            } else if (vectorIMC[i] >= 1) {
                contadoralto++;
            } else {
                contadorideal++;
            }
            
            
            
        }
        
        porcentaje = contadormayor*100/4;
        
        System.out.println("El porcentaje de personas mayores son: " + porcentaje);

        System.out.println("Las personas mayor de edad son: " + contadormayor);
        System.out.println("Las personas menor de edad son: " + contadormenor);

        System.out.println("La cantidad de personas con el peso por debajo de lo normal son " + contadorbajo);
        System.out.println("La cantidad de personas con el peso por encima de lo normal son " + contadoralto);
        System.out.println("La cantidad de personas con el peso normal son " + contadorideal);
        
        

    }

}
