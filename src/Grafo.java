/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karelin
 */
public class Grafo {
    int max_letras;
    int letras_actuales;
    Vertice[] sopa;

    public Grafo(int max_letras, String letras) {
        this.max_letras = max_letras;
        this.letras_actuales = 0;
        this.sopa = new Vertice[max_letras];
        for (int i = 0; i < letras.length(); i++) {
            this.sopa[i] = new Vertice(String.valueOf(letras.charAt(i)));
        }
    }
    
    
    
    
}
