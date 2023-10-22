//20224111E
package uni.aed.Biblioteca;

import java.util.LinkedList; //Se importa la clase LinkedList para poder extenderla

public class AuthorList extends LinkedList {
    // Se llama al constructor de la clase padre LinkedList usando 'super()'.
    public AuthorList(){
        super();
    }
    // Método para mostrar todos los autores en la lista.
    public void display(){
        // Convierte la lista enlazada (LinkedList) a un arreglo (Array) de objetos.
        // Esto facilita su iteración usando un ciclo for.
        Object[] authors= toArray(); 
        for (int i=0; i<authors.length;i++) // Itera sobre todos los objetos en el arreglo 'authors'.
            ((Author)authors [i]).display();
    }
}
