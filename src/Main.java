public class Main {
    public static void main(String[] args) {
       
        ListaGenerica<Persona> listaPersonas = new ListaGenerica<>();

    
        listaPersonas.agregar(new Persona("Cristina", 25));
        listaPersonas.agregar(new Persona("Ana", 30));
        listaPersonas.agregar(new Persona("Luis", 35));

        // Mostrar todas las personas
        System.out.println("Lista de Personas:");
        listaPersonas.mostrarTodos();

        // Obtener una persona por índice
        System.out.println("\nPersona en la posición 1:");
        System.out.println(listaPersonas.obtener(1));

        // Mostrar el tamaño de la lista
        System.out.println("\nNúmero total de personas:");
        System.out.println(listaPersonas.tamaño());
    }
}
