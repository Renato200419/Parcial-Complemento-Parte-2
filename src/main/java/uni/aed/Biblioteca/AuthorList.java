//20224111E
package uni.aed.Biblioteca;

import uni.aed.linkedlistTDA.LinkedListTDA; //Se importa la clase LinkedList para poder extenderla


public class AuthorList extends LinkedListTDA <Author>{
    // Se llama al constructor de la clase padre LinkedListTDA usando 'super()'.
    public AuthorList(){
        super();
    }
    // Método para mostrar todos los autores en la lista.
    public void display(){
        // El siguiente código tiene que LinkedListTDA tiene un método toArray()
        Object[] authors= toArray(); 
        for (int i=0; i<authors.length;i++) // Itera sobre todos los objetos en el arreglo 'authors'.
            ((Author)authors [i]).display();
    }
}
