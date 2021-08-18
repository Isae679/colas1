import Cola.Colas;
import Lse.ListaSimpleEnlazada;

public class Main {
    public static void main(String[] args) {/*
        ListaSimpleEnlazada listaSimpleEnlazada = new ListaSimpleEnlazada();
        //insetar elementos a lista

        listaSimpleEnlazada.insertar(12);
        listaSimpleEnlazada.insertar(10);
        listaSimpleEnlazada.insertar(8);
        listaSimpleEnlazada.insertar(6);
        listaSimpleEnlazada.insertar(4);
        listaSimpleEnlazada.insertar(2);
        listaSimpleEnlazada.insertar(14);
        listaSimpleEnlazada.insertar(20);
        listaSimpleEnlazada.insertar(40);
        listaSimpleEnlazada.insertar(18);
        listaSimpleEnlazada.insertar(0);

        //mostrar
        listaSimpleEnlazada.mostrar();

        //eliminar
        listaSimpleEnlazada.Eliminar();
        listaSimpleEnlazada.Eliminar();
        //mostrar
        listaSimpleEnlazada.mostrar();
        */

        //insertando al final
        Colas cola = new Colas();
        System.out.println(cola.estaVacia());
        for (int i = 1; i <= 5 ; i++) {
            cola.insertar(i);
        }
        cola.mostrar();
        //eliminado
        cola.Eliminar();
        cola.Eliminar();

        //Mostrando
        cola.mostrar();



    }

}
