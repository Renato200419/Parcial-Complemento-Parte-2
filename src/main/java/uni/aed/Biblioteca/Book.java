//20224111E
package uni.aed.Biblioteca;

public class Book {
    public String title; //variable donde se almacenara el titulo
    public Patron patron= null; //  Si el libro no está prestado, 'patron' será null.
    // Constructor por defecto
    public Book(){
        
    }
    
    // Método que compara si el libro actual es igual a otro libro (u objeto) basándose en su título.
    // Si los títulos son iguales, los libros son considerados iguales.
    public boolean equals(Object node){
        return title.equals(((Book) node).title);
    }
    
    // Método que devuelve una representación en forma de String del libro.
    // Esto es útil para imprimir información del libro en consola.
    public String toString(){
        return "    * " + title + (patron!=null ? " -prestado a " + patron.name : "") + "\n";
    }
}
