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
        fijar_adyacentes();
    }

    public void fijar_adyacentes() {
        int[] indices = {-5, -4, -3, -1, 1, 3, 4, 5};
        int[][] borders = {{0, 4, 8, 12}, {3, 7, 11, 15}};
        for (int i = 0; i < max_letras; i++) {
            for (int j = 0; j < 8; j++) {
                try {
                    switch (i) {
                        case 0, 4, 8, 12 -> {
                            if (indices[j] != -5 && indices[j]!= -1 && indices[j] != 3) {
                                this.sopa[i].agregar(this.sopa[i + indices[j]]);
                            }
                        }
                        case 3, 7, 11, 15 -> {
                            if (indices[j] != -3 && indices[j] != +1 && indices[j] != 5) {
                                this.sopa[i].agregar(this.sopa[i + indices[j]]);
                            }
                        }
                        default -> this.sopa[i].agregar(this.sopa[i + indices[j]]);
                    }
                } catch (Exception e) {
                    
                }
            }
        }
    }

    public void mostrar() {
        int c = 1;
        for (int i = 0; i < sopa.length; i++) {
            System.out.print(sopa[i].letra + i + "    ");
            if (c == 4) {
                System.out.println("");
                c = 0;
            }
            c++;
        }
        for (int i = 0; i < sopa.length; i++) {
            try {
                System.out.println(sopa[i].letra + " ---> " + sopa[i].mostrar());
            } catch (Exception e) {

            }
        }
    }

}
