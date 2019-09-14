package grafos;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import GrafoLista.GrafosLE;
import Search.Extension_Search;



public class Grafos {

    public static void main(String[] args) {
        
        GrafosLE grafo = new GrafosLE(6);
        System.out.println("Adicionando...");
        grafo.addAresta(0,3);
        grafo.addAresta(0,1);
        grafo.addAresta(1,0);
        grafo.addAresta(1,3);
        grafo.addAresta(1,4);
        grafo.addAresta(2,4);
        grafo.addAresta(2,5);
        grafo.addAresta(3,4);
        grafo.addAresta(3,1);
        grafo.addAresta(3,0);
        grafo.addAresta(4,1);
        grafo.addAresta(4,2);
        grafo.addAresta(4,3);
        grafo.addAresta(5,2);
        grafo.addAresta(5,5);
        System.out.println("Exibindo:");       
        grafo.exibir();
        Extension_Search BFS = new Extension_Search(grafo, 0);
        BFS.Print_path(0, 2);
        
		/*
		 * List a[] = grafo.getAdjacencia(); System.out.println(); for(int i = 0; i <
		 * a.length;i++) { List lista = a[i]; for( int j = 0; j < lista.size();j++) {
		 * System.out.println(lista.get(j)); } }
		 */
    }
}
