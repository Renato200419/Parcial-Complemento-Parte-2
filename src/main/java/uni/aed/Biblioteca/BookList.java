//20224111E
package uni.aed.Biblioteca;

import java.util.LinkedList; //Se importa la clase LinkedList para poder extenderla

public class BookList extends LinkedList{
    // Se llama al constructor de la clase padre LinkedList usando 'super()'.
    public BookList(){
        super();
    }
    // Método para mostrar todos los libros en la lista.
    public void display(){
        for(int i=0;i<size();i++) // Usa el método 'size()' para obtener el número total de libros en la lista.
            
            System.out.print(get(i)); // Usa el método 'get(i)' para obtener el libro en la posición 'i'.
                                              // Luego, imprime ese libro. 
    }
}
