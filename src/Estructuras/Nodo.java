package Estructuras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karelin
 */
public class Nodo {
    private Nodo siguiente;
    private Vertice letra;

    public Nodo(Vertice letra) {
        this.siguiente = null;
        this.letra = letra;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the letra
     */
    public Vertice getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(Vertice letra) {
        this.letra = letra;
    }
    
    
    
}
