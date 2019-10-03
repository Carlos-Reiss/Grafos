package grafos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import GrafoLista.GrafosLE;
import Search.Deep_Search;
import Search.Extension_Search;

public class Grafos {

    public static void main(String[] args) {

        GrafosLE grafo = new GrafosLE(6);
        System.out.println("Adicionando...");
        grafo.addAresta(0, 3);
        grafo.addAresta(0, 1);
        grafo.addAresta(1, 0);
        grafo.addAresta(1, 3);
        grafo.addAresta(1, 4);
        grafo.addAresta(2, 4);
        grafo.addAresta(2, 5);
        grafo.addAresta(3, 4);
        grafo.addAresta(3, 1);
        grafo.addAresta(3, 0);
        grafo.addAresta(4, 1);
        grafo.addAresta(4, 2);
        grafo.addAresta(4, 3);
        grafo.addAresta(5, 2);
        grafo.addAresta(5, 5);
        System.out.println("Exibindo Grafo:");
        grafo.exibir();
        System.out.println("Exibindo Busca em Extensão :");
        Extension_Search BFS = new Extension_Search(grafo, 0);
        System.out.println("Exibindo menor caminho :");
        System.out.println("Menor caminho Entre "+0+" e "+5);
        BFS.Print_path(0, 5);		
        System.out.println("Exibindo Busca em Profundidade :");
        Deep_Search DFS = new Deep_Search(grafo);
        DFS.exibir();
    }
}
