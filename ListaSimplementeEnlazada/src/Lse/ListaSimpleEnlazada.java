package Lse;

public class ListaSimpleEnlazada {
   protected Nodo primero;
    public ListaSimpleEnlazada(){
        primero =null;

    }

    //metodo esta vacia
     public boolean estaVacia(){
        return primero == null;

     }
     //metodo insertar
    public void  insertar (Object dato){
        if (estaVacia()){
                Nodo nuevo = new Nodo(dato, null);
                primero = nuevo;
        }else{
            Nodo nuevo = new Nodo(dato,primero);
            primero = nuevo;

        }
    }

    //metodo Eliminar al inicio
    public void Eliminar(){
        if (!estaVacia()){
            primero = primero.getSiguiente();

        }

    }
    //metodo mostrar
    public void mostrar(){
        Nodo tmp = primero;
        while (tmp != null){
            System.out.print(tmp.getDato() + "  ");
            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }
}
