/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karelin
 */
public class Lista {

    Nodo primero;
    int tamano;

    public Lista() {
        primero = null;
        tamano = 0;
    }

    public void insertar(String letra) {
        Nodo nuevo = new Nodo(letra);
        if (this.primero == null) {
            this.primero = nuevo;
            this.tamano++;
        } else {
            Nodo aux = this.primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            tamano++;
        }

    }

    public void eliminar(String letra) {
        if (this.primero != null) {
            Nodo aux = this.primero;
            if (aux.getLetra().equals(letra)) {
                this.primero = this.primero.getSiguiente();
                tamano--;
            } else {
                while (aux.getSiguiente() != null && !aux.getSiguiente().getLetra().equals(letra)) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() != null) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                }
            }
        }
    }
    
    public String imprimir(){
        if(this.primero != null){
            Nodo aux = this.primero;
            String letras = "";
            while(aux != null){
                letras += aux.getLetra() + "  ";
                aux = aux.getSiguiente();
            }
            return letras;
        }
        return null;
    }
}
