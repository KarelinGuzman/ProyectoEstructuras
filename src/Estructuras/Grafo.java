package Estructuras;

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
    public Vertice[] sopa;

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
        for (int i = 0; i < max_letras; i++) {
            for (int j = 0; j < 8; j++) {
                try {
                    switch (i) {
                        case 0, 4, 8, 12 -> {
                            if (indices[j] != -5 && indices[j] != -1 && indices[j] != 3) {
                                this.sopa[i].agregar(this.sopa[i + indices[j]]);
                            }
                        }
                        case 3, 7, 11, 15 -> {
                            if (indices[j] != -3 && indices[j] != +1 && indices[j] != 5) {
                                this.sopa[i].agregar(this.sopa[i + indices[j]]);
                            }
                        }
                        default ->
                            this.sopa[i].agregar(this.sopa[i + indices[j]]);
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

    public Lista searchWord(String palabra) {
        Lista recorrido = new Lista();
//        System.out.println(palabra);
        for (int i = 0; i < this.max_letras; i++) {
//            System.out.println(sopa[i].letra + ", " +String.valueOf(palabra.charAt(0)) +" "+ sopa[i].letra.equals(String.valueOf(palabra.charAt(0))));
            if (sopa[i].letra.equals(String.valueOf(palabra.charAt(0)))) {
                sopa[i].visitado = true;
                recorrido = buscarPalabra(palabra, sopa[i], 1, recorrido);
                if (recorrido.tamano == palabra.length()) {
                    return recorrido;
                }
            }
        }
        return recorrido;
    }

    public Lista buscarPalabra(String palabra, Vertice actual, int indice, Lista recorrido) {
        if (indice == palabra.length()) {
//            System.out.println(recorrido.imprimir());
            recorrido.insertar(actual);
            //Deberia retornar una lista con todos los vertices
            return recorrido;
        } else {
            Nodo aux = actual.adyacentes.primero;
            Lista n = new Lista();
            while (aux != null) {
//                System.out.println(aux.getLetra().letra+ ", " +String.valueOf(palabra.charAt(indice)) +" "+ aux.getLetra().letra.equals(String.valueOf(palabra.charAt(indice))) + ", " +!recorrido.buscar(aux.getLetra()));
                if (aux.getLetra().letra.equals(String.valueOf(palabra.charAt(indice))) && !recorrido.buscar(aux.getLetra())) {
                    int p = indice + 1;
                    actual.visitado = true;
                    recorrido.insertar(actual);
//                    System.out.println(aux.getLetra().letra);
//                    System.out.println(recorrido.imprimir());

                    n = buscarPalabra(palabra, aux.getLetra(), p, recorrido);
                }
                if (n.tamano == palabra.length()) {
                    return n;
                }
                aux = aux.getSiguiente();
            }
            return n;
        }

    }

    public boolean buscarDFS(String word) {
        boolean found = false;
        int index = 0;
        while (index < this.max_letras) {
            if (this.sopa[index].letra.equals(String.valueOf(word.charAt(0)))) {
                found = this.DFS(word.substring(1), this.sopa[index]);
                if (found) {
                    break;
                }
            }

            index++;
        }
        this.desmarcar();
        return found;

    }
    

    public boolean DFS(String word, Vertice actual) {
        if (word.length() == 0) {
//            System.out.println("            LLEGO");
            return true;
        }

        actual.visitado = true;
        Nodo aux = actual.adyacentes.primero;
        while (aux != null) {
//            System.out.println(String.valueOf(word.charAt(0)) + " " + (aux.getLetra().letra) + "  " + String.valueOf(word.charAt(0)).equals(aux.getLetra().letra) + " " +(!aux.getLetra().visitado));
            if (!aux.getLetra().visitado && String.valueOf(word.charAt(0)).equals(aux.getLetra().letra)) {
//                System.out.println("                entro  " + word);

                if (DFS(word.substring(1), aux.getLetra())) {
//                    System.out.println("                retorna");

                    return true;
                }
            }
            aux = aux.getSiguiente();
        }
        actual.visitado = false;
        return false;
    }

    public void desmarcar() {
        for (int i = 0; i < this.max_letras; i++) {
            this.sopa[i].visitado = false;
        }
    }
    
    public boolean buscarBFS(String word){
        boolean found = this.BFS(word);
        this.desmarcar();
        return found;
    }
            
    boolean BFS(String word) {
        Lista queue = new Lista();
        for (int i = 0; i < 16; i++) {
            
            if (!sopa[i].visitado && String.valueOf(word.charAt(0)).equals(sopa[i].letra)) {
//                System.out.println( "PRIMERA"+sopa[i].letra);
                queue.insertar(sopa[i]);
                sopa[i].visitado = true;
            }
        }
        Nodo node = queue.primero;
        int i = 1;

        while (node != null) {
            String remainingWord = word.substring(i);

            if (remainingWord.length() == 0) {
                return true;
            }

            Nodo aux = node.getLetra().adyacentes.primero;
            String a = aux.getLetra().letra;
            while(aux!= null) {
//                System.out.println(String.valueOf(remainingWord.charAt(0)) + " " + (aux.getLetra().letra) + "  " + String.valueOf(remainingWord.charAt(0)).equals(aux.getLetra().letra) + " " +(!aux.getLetra().visitado));

                if (!aux.getLetra().visitado && String.valueOf(remainingWord.charAt(0)).equals(aux.getLetra().letra)) {
//                    System.out.println("---ENTRO---");
                    queue.insertar(aux.getLetra());
                    aux.getLetra().visitado = true;
                }
                aux = aux.getSiguiente();
            }
//            System.out.println("FIN ADYACENTES A " + remainingWord.charAt(0));
           node = node.getSiguiente();
           i++;
        }

        return false;
    }

}
