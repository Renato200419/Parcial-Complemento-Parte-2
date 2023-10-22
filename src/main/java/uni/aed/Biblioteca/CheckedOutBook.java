//20224111E
package uni.aed.Biblioteca;

public class CheckedOutBook {
    public Author author = null;  // Referencia al autor del libro prestado.
    public Book book = null;     // Referencia al libro prestado.
    public CheckedOutBook(){  // Constructor por defecto para la clase CheckedOutBook.
    }
    // Sobrescribe el método equals para determinar si dos objetos CheckedOutBook son iguales.
    // Se consideran iguales si los títulos de sus libros y los nombres de sus autores son idénticos.
    public boolean equals (Object node){ // Compara los títulos de los libros.
        // Compara los títulos de los libros, se refiere a este codigo-> book.title.equals(((CheckedOutBook)node).book.title).
        return book.title.equals(((CheckedOutBook)node).book.title) && author.name.equals(((CheckedOutBook)node).author.name);
        // Compara los nombres de los autores, se refiere a este codigo-> author.name.equals(((CheckedOutBook)node).author.name).
    }
    
    // Sobrescribe el método toString para proporcionar una representación en cadena del objeto CheckedOutBook.
    public String toString(){
        // Devuelve una cadena formateada que incluye el nombre del autor y el título del libro.
        return "   * " + author.name + ", " + book.title + "\n";
    }
}
