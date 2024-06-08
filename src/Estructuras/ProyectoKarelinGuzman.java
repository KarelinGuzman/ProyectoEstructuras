package Estructuras;

import Ventanas.LectorTXT;
import Ventanas.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author karelin
 */
public class ProyectoKarelinGuzman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo grafo = new Grafo(16, "chaoxatmprraaoro");
//        grafo.mostrar();
//        System.out.println(grafo.searchWord("abeijm").imprimir());
        String[] words = {"otra", "oprah", "xham", "pata", "aparto", "aparta", "chao"};
        
//        for (String word : words) {
//            try{
//                System.out.println(grafo.buscarDFS(word).imprimir());
//            }catch(Exception e){
//                
//            }
//            if (grafo.buscarDFS(word)) {
//                System.out.println("                    Found: " + word);
//            } else {
//                System.out.println("                    Not found: " + word);
//            }
//        }
        
        for (String word : words) {
             if (grafo.buscarBFS(word)) {
                System.out.println("                    Found: " + word);
            } else {
                System.out.println("                    Not found: " + word);
            }
        }
//        }
        LectorTXT l = new LectorTXT();
    }

}
