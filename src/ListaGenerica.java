import java.util.ArrayList;
import java.util.List;

// Clase genérica que permite manejar cualquier tipo de dato
public class ListaGenerica<T> {
    private List<T> elementos;

    public ListaGenerica() {
        this.elementos = new ArrayList<>();
    }

    // Agregar un elemento a la lista
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    // Obtener un elemento por índice
    public T obtener(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        }
        throw new IndexOutOfBoundsException("Índice fuera de rango.");
    }

    // Mostrar todos los elementos de la lista
    public void mostrarTodos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    // Obtener el tamaño de la lista
    public int tamaño() {
        return elementos.size();
    }
}
