package Estructuras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karelin
 */
public class Lista {

    public Nodo primero;
    public int tamano;

    public Lista() {
        primero = null;
        tamano = 0;
    }

    public void insertar(Vertice letra) {
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

    public void eliminar(Vertice letra) {
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
                letras += aux.getLetra().letra + "";
                aux = aux.getSiguiente();
            }
            return letras;
        }
        return null;
    }
    
    public boolean buscar(Vertice actual){
        Nodo aux = this.primero;
        while(aux != null){
            if (aux.getLetra() == actual) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    public Vertice buscarPos(int pos){
        if(this.primero != null){
            if(pos == 0){
                return this.primero.getLetra();
            }else{
                int contador = 0;
                Nodo aux = this.primero;
                while(pos > contador){
                    aux= aux.getSiguiente();
                    contador++;
                }
                return aux.getLetra();
            }
        }
        return null;
    }
}
