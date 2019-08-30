package grafos;

import java.util.ArrayList;

import ListaAdj.Lista_de_adja;

public class Grafos {

    public static void main(String[] args) {
        ArrayList vet = new ArrayList();
        Arq arquivo = new Arq(); 
        vet = arquivo.Arq();       
        System.out.println("Arquivo Carregado...");
        int qtd_vertices = Integer.parseInt((String) vet.get(0));
        Lista_de_adja grafo = new Lista_de_adja(qtd_vertices);
        grafo.AdicionarArcos(0, 2);
        grafo.AdicionarArcos(0, 1);
        grafo.AdicionarArcos(0, 3);
        grafo.exibir();
    }
}
