# Proyecto Genérico en Java

## Descripción
Este proyecto implementa un ejemplo práctico del uso de **clases genéricas** en Java. La clase `ListaGenerica<T>` es una estructura de datos genérica que permite almacenar y gestionar elementos de cualquier tipo. Para este ejemplo, se utiliza una lista de objetos de la clase `Persona`.

## Definición de Clases Genéricas
Una clase genérica permite definir un tipo de dato genérico que será especificado en tiempo de ejecución. En este caso, la clase `ListaGenerica<T>` utiliza un parámetro genérico `T` que representa el tipo de dato.

### Implementación de `ListaGenerica<T>`
```java
public class ListaGenerica<T> {
    private List<T> elementos;

    public ListaGenerica() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        return elementos.get(indice);
    }

    public void mostrarTodos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public int tamaño() {
        return elementos.size();
    }
}
