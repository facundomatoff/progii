package main.java.com.frre.tsp.estructuralineales.ejercicioGuia;

/**
 * Solucion Ejecicio 5 de Guia "Estructuras Dinamicas"
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        int totalMinutos = 10 * 60;

        int hora = 9;
        int minuto = 0;

        int totalAtendidos = 0;

        Cola2 colaClientes = new Cola2();

        // iterar a razon de un minuto
        for(int i = 1; i <= totalMinutos; i++) {

            // incrementa el tiempo en minutos.
            minuto++;
            if (minuto > 59) {
                minuto = 0;
                hora++;
            }

            // llega cliente cada 2 minutos
            if (i % 2 == 0) {
                colaClientes.encolar(hora, minuto);
            }

            // atiende a cliente a razon de 4 minutos
            if (i % 4 == 0) {
                Nodo2 aux = colaClientes.desencolar();
                totalAtendidos++;
            }
        }

        System.out.println("Total de clientes atentidos: " + totalAtendidos);

        int totalDeClienteEnCola = colaClientes.tamaño;
        System.out.println("Total de clientes en cola luego de 10 horas: " + totalDeClienteEnCola);

        Nodo2 aux = colaClientes.desencolar();

        if (aux == null)
            System.out.println("todo los cliente se antendieron");
        else {
            System.out.println("Hora en que llego la primera que quedo en la cola luego de 10 horas");
            System.out.println(aux.horaLlegada);
            System.out.println(aux.minutoLlegada);
        }
    }
}

/*
    Crea una clase Nodo para almacenar la informacion de la hora y minutos de llegada
    de cada cliente a la cola.
 */
class Nodo2 {

    public Nodo2 siguiente;

    // Datos
    public int horaLlegada;
    public int minutoLlegada;
}

/*
   Crea una clase Cola para mantener informacion de los clientes como
   la hora y minutos de llegada.
*/
class Cola2 {

    private Nodo2 primero;
    private Nodo2 ultimo;
    public int tamaño;

    public Cola2() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    // enqueue
    public void encolar(int hora, int minutos) {

        Nodo2 nuevo = new Nodo2();
        nuevo.horaLlegada = hora;
        nuevo.minutoLlegada = minutos;

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {

            this.ultimo.siguiente = nuevo;
            this.ultimo = nuevo;
        }
        this.tamaño++;
    }

    // dequeue
    public Nodo2 desencolar() {

        if (vacia()) {
            return null;
        } else {

            Nodo2 aux = this.primero;
            this.primero = this.primero.siguiente;
            this.tamaño--;

            return aux;
        }
    }
}
