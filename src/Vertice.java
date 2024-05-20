/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karelin
 */
public class Vertice {
    String letra;
    Lista adyacentes;

    public Vertice(String l) {
        this.letra = l;
        adyacentes = new Lista();
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
