package uni.aed.Biblioteca;

import uni.aed.linkedlistTDA.LinkedListTDA;

public class PatronList extends LinkedListTDA<Patron> {

    // Se llama al constructor de la clase LinkedListTDA usando 'super()'.
    public PatronList() {
        super();
    }

    // Método que muestra la información de todos los patrones en la lista.
    public void display() {
        // Usa el método 'size()' para obtener el número total de patrones en la lista.
        for (int i = 0; i < size(); i++) {
            // Usa el método 'get(i)' para obtener el patrón en la posición 'i'.
            get(i).display(); // Luego, llama a su método 'display' para mostrar su información.
        }
    }
}
