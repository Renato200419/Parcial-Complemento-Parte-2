//20224111E
package uni.aed.Biblioteca;

import uni.aed.linkedlistTDA.LinkedListTDA; // Importa la clase LinkedListTDA
import uni.aed.listTDA.ListTDA;  // Importa la interfaz ListTDA

public class Patron {
    public String name;     // Variable de instancia para almacenar el nombre del patron.
    public ListTDA books = new LinkedListTDA(); // Variable de instancia que representa una lista de libros que el patron tiene prestados.
    public Patron() { // Constructor por defecto
    }
    
    // Método que compara si el patron actual es igual a otro patron (u objeto) basándose en su nombre.
    // Si los nombres son iguales, los patrones son considerados iguales.
    public boolean equals (Object node){ 
        return name.equals(((Patron)node).name);
    }
    
    // Método que muestra información sobre el patron y los libros que tiene prestados.    
    public void display(){
        if(!books.isEmpty()){ //Si el patron tiene libros prestados
            System.out.println(name + " tiene los libros siguientes:");
            books.imprimir();
        }
        else System.out.println(name + " no tiene libros"); //Si el patron no tiene libros prestados
    }
}
