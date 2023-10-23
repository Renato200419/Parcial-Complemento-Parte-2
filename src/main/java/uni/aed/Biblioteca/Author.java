//20224111E
package uni.aed.Biblioteca;
import java.io.*;
import uni.aed.linkedlistTDA.LinkedListTDA;
import uni.aed.listTDA.ListTDA;

public class Author {
    public String name;
    public ListTDA books = new LinkedListTDA();  // Se cambia BookList a ListTDA y se instancia como LinkedListTDA
    // Constructor por defecto
    public Author() {
    }
    // Método que compara si el objeto actual es igual a otro objeto basándose en el nombre del autor.
    // El método asume que el objeto pasado como parámetro es de tipo Author.    
    public boolean equals(Object node) {
        return name.equals(((Author) node).name);
    }
    // Método para mostrar el nombre del autor y la lista de sus libros.
    public void display() {
        System.out.println(name); // Muestra el nombre del autor
    }

}
