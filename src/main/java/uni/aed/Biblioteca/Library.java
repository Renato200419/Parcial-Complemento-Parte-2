//20224111E
package uni.aed.Biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Library { 
    private AuthorList[] catalog = new AuthorList[(int)('Z'+1)];
    private PatronList[] people = new PatronList[(int)('Z'+1)];
    private String input;
    private BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    
    public Library(){// Inicializa las listas de autores y usuarios.
        for(int i=0;i<=(int)'Z';i++){
            catalog[i]=new AuthorList();
            people[i]=new PatronList();
        }
    }
    private String getString(String msg){     // Método para obtener una cadena de entrada del usuario, 
                                              // mostrando un mensaje específico.
        System.out.println(msg + " ");
        System.out.flush();
        try{
            input=buffer.readLine();
        }catch(IOException io){
        }
        return input.substring(0,1).toUpperCase()+input.substring(1);
    }
    
    // Método para mostrar el estado actual de la biblioteca: 
    // qué libros tiene y qué usuarios están utilizando la biblioteca.
    private void status(){
        System.out.println("La biblioteca tiene los libros siguientes:\n");
        for(int i=(int)'A';i<=(int)'Z';i++)
            if(!catalog[i].isEmpty())
                catalog[i].display();
        System.out.println("\nLas personas siguientes están utilizando la biblioteca:\n ");
        for(int i=(int) 'A';i<=(int)'Z';i++)
            if(!people[i].isEmpty())
                people[i].display();
    }
      // Método para agregar un nuevo libro al catálogo.
    public void includeBook(){
        Author newAuthor = new Author();
        int oldAuthor;
        Book newBook = new Book();
        newAuthor.name=getString("Introduzca el nombre del autor:");
        newBook.title=getString("Introduzca el título del libro");
        oldAuthor=catalog[(int) newAuthor.name.charAt(0)].indexOf(newAuthor);
        if(oldAuthor==-1){
            newAuthor.books.add(newBook);
            catalog[(int) newAuthor.name.charAt(0)].add(newAuthor);
        }
        else((Author)catalog[(int) newAuthor.name.charAt(0)].get(oldAuthor)).books.add(newBook);
    }
     // Método para registrar el préstamo de un libro por un usuario.
    public void checkOutBook(){
        Patron patron=new Patron(),patronRef;//=newPatron();
        Author author=new Author(),authorRef = new Author();
        Book book = new Book();
        int patronIndex,bookIndex=-1,authorIndex=-1;
        patron.name=getString("Introduzca el nombre del usuario:");
        while(authorIndex==-1){
            author.name=getString("Introduzca el nombre del autor:");
            authorIndex=catalog[(int)author.name.charAt(0)].indexOf(author);
            if(authorIndex==-1)
                System.out.println("Nombre de autor mal escrito");
        }
        while (bookIndex == -1){
            book.title = getString("Introduzca el título del libro:");
            authorRef = (Author) catalog[ (int)author .name.charAt (0)].get (authorIndex);
            bookIndex = authorRef.books.indexOf (book) ;
            if (bookIndex == -1)
                    System.out.println("Título mal escrito");
            }
        Book bookRef = (Book) authorRef.books.get(bookIndex);

        CheckedOutBook bookToCheckOut = new CheckedOutBook();
        bookToCheckOut.author = authorRef;
        bookToCheckOut.book = bookRef;
        patronIndex=people[(int)patron.name.charAt(0)].indexOf(patron);
        if (patronIndex == -1) {
        // un usuario nuevo en la biblioteca;
            patron.books.add(bookToCheckOut);
            people[(int) patron.name.charAt(0) ].add (patron);
            bookRef.patron = (Patron) people[ (int)patron.name.charAt(0)].get(0);
        }
        else {
            patronRef = (Patron) people[(int)patron.name.charAt(0)].get(patronIndex);
            patronRef.books.add(bookToCheckOut);
            bookRef.patron = patronRef;
        }
    }
     // Método para registrar la devolución de un libro prestado.
        public void returnBook( ) {
        Patron patron = new Patron();
        Book book = new Book();
        Author author = new Author(), authorRef = new Author ();
        int patronIndex = -1, bookIndex = -1, authorIndex = -1;
        while (patronIndex == -1) {
            patron.name = getString("Introduzca el nombre del usuario:");
            patronIndex = people[(int)patron.name.charAt(0)].indexOf(patron);
            if (patronIndex == -1) System.out.println("Nombre del usuario mal escrito");
        }
        while (authorIndex == -1) {
            author.name = getString("Introduzca el nombre del autor:");
            authorIndex =catalog[(int)author.name.charAt(0) ].indexOf (author);
            if (authorIndex ==- 1) System.out.println("Nombre de autor mal escrito");
        }
        while (bookIndex == -1) {
            book.title = getString("Introduzca el título del libro:");
            authorRef = (Author) catalog[ (int)author.name.charAt(0) ].get (authorIndex);
            bookIndex = authorRef.books.indexOf (book) ;
            if (bookIndex == -1) System.out.println("Titulo mal escrito");
        }

        CheckedOutBook checkedOutBook = new CheckedOutBook();
        checkedOutBook.author = authorRef;
        checkedOutBook.book = (Book) authorRef.books.get(bookIndex) ;
        ((Book)authorRef.books.get(bookIndex) ) .patron = null;
        ((Patron) people[(int) patron.name.charAt(0) ].get(patronIndex)).books.delete(checkedOutBook) ;
} 
// Método principal para ejecutar la aplicación de la biblioteca.
    public void run( ) {
        while (true) {
        char option = getString("\n Introduzca una de las siguientes" +"opciones:\n" +
        "1. Incluir un libro en el catalogo\n" +
        "2. Registrar el préstamo de un libro\n" +
        "3. Registrar la devolución de un libro\n4.Status\n5." +
        "Salir\n" +
        "Su opción:").charAt(0);

            switch (option) {
                case '1': includeBook(); break;
                case '2': checkOutBook(); break;
                case '3': returnBook(); break;
                case '4': status (); break;
                case '5': return;
                default: System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }
    // Método principal (main) que lanza la aplicación.
    public static void main(String args[]) {
            (new Library()).run();
        }
    }
  


