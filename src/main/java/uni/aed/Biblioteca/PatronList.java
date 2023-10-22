//20224111E
package uni.aed.Biblioteca;

import java.util.LinkedList;//Se importa la clase LinkedList para poder extenderla

public class PatronList extends LinkedList{ //Se define la clase PatronList que hereda de LinkedList.
    public PatronList(){ // Llama al constructor de la superclase LinkedList.
        super();
    }
    // Método que muestra la información de todos los patrones en la lista.
    public void display(){
        // Se crea un iterador para recorrer la lista.
        for(java.util.Iterator it = iterator();it.hasNext();)    // Por cada objeto en la lista, se hace un casting a Patron                                                                
            ((Patron)it.next()).display();                       // y se llama a su método 'display' para mostrar su información.
    }
}
