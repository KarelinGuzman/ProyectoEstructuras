package Estructuras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karelin
 */
public class Vertice {
    public String letra;
    public Lista adyacentes;
    public boolean visitado;

    public Vertice(String l) {
        this.letra = l;
        adyacentes = new Lista();
        visitado = false;
    }
    
    public void agregar(Vertice letra){
        adyacentes.insertar(letra);
    }
    
    public void eliminar(Vertice letra){
        adyacentes.eliminar(letra);
    }
    
    public String mostrar(){
        return adyacentes.imprimir();
    }
    
    
}
