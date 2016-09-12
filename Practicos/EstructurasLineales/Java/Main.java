package main.java.com.frre.tsp.estructuralineales;

/**
 * Pruebas de Estructuras Lineales simples.
 */
public class Main {

    public static void main(String[] args){

        listaSimples();
        //listaDobles();
        //pilas();
        //colas();
    }

    private static void listaSimples() {

        ListaSimple listaSimple = new ListaSimple();
        listaSimple.agregar("uno");
        listaSimple.agregar("dos");
        listaSimple.agregar("tres");
        listaSimple.agregar("cuatro");

        System.out.println("----------------");
        listaSimple.imprimir();

        listaSimple.eliminarUltimo();

        System.out.println("----------------");
        listaSimple.imprimir();

        listaSimple.eliminarUltimo();
        listaSimple.eliminarUltimo();
        listaSimple.eliminarUltimo();
        listaSimple.eliminarUltimo();
        listaSimple.eliminarUltimo();

        System.out.println("----------------");
        listaSimple.imprimir();

        listaSimple.agregar("nuevo_1");
        listaSimple.agregar("nuevo_2");

        System.out.println("----------------");
        listaSimple.imprimir();
    }

    private static void listaDobles() {

        ListaDoble listaDoble = new ListaDoble();
        listaDoble.agregar("uno");
        listaDoble.agregar("dos");
        listaDoble.agregar("tres");
        listaDoble.agregar("cuatro");

        System.out.println("----------------");
        listaDoble.imprimir();

        listaDoble.eliminarUltimo();

        System.out.println("----------------");
        listaDoble.imprimir();

        listaDoble.eliminarUltimo();
        listaDoble.eliminarUltimo();
        listaDoble.eliminarUltimo();
        listaDoble.eliminarUltimo();
        listaDoble.eliminarUltimo();

        System.out.println("----------------");
        listaDoble.imprimir();

        listaDoble.agregar("nuevo_1");
        listaDoble.agregar("nuevo_2");

        System.out.println("----------------");
        listaDoble.imprimir();
    }

    private static void pilas() {

        Pila pila = new Pila();
        pila.apilar("uno");
        pila.apilar("dos");
        pila.apilar("tres");
        pila.apilar("cuatro");

        System.out.println("----------------");
        pila.imprimir();

        System.out.println("----------------");
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());

        pila.apilar("nuevo_1");
        pila.apilar("nuevo_2");

        System.out.println("----------------");
        pila.imprimir();
    }

    private static void colas() {

        System.out.println("----------------");
        Cola cola = new Cola();
        cola.encolar("uno");
        cola.encolar("dos");
        cola.encolar("tres");
        cola.encolar("cuatro");

        System.out.println("----------------");
        cola.imprimir();

        System.out.println("----------------");
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());

        cola.encolar("nuevo_1");
        cola.encolar("nuevo_2");

        System.out.println("----------------");
        cola.imprimir();
    }
}
