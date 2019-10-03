package GrafoLista;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GrafosLE {
	private List[] vet;
	int tamanho;
	/*
	 * aqui  criamos o grafo e adcionamos as aresta dos grafos
	 */
	public GrafosLE(int qtd_vertice) {
		// criamos os vertices[] e dps adicionamos as linkedlists null
		tamanho = qtd_vertice;
		vet = new List[qtd_vertice];
		for(int i = 0; i < vet.length;i++) {
			LinkedList<Integer> lista = new LinkedList<Integer>();
			vet[i] = lista;
		}		
	}
	public void addAresta(int origem, int destino) {
		// temos o grafo criado vamos diretamente na posicao dele e inserimos a aresta
		LinkedList<Integer> lista = (LinkedList<Integer>) vet[origem];
		
		
		if(lista.size() == 0) {
			lista.add(destino);
		}
		else if( lista.get(0) > destino) {
			lista.add(0, destino);
		}
		else if( lista.get(lista.size()-1) < destino) {
			lista.add(lista.size(), destino);
		}
		else{
            int i = 0;
	            while (lista.get(i) < destino) {
	                i++;
	            }
            lista.add(i, destino);
        }
		vet[origem] = lista;
	}
	public void exibir() {
		for(int i = 0; i < vet.length;i++) {
			List a = vet[i];
			//Collections.sort(a);
			System.out.print(i+" : ");	
			System.out.println(a);
		}
	}
	public List[] getAdjacencia(){
		// retorna o vetor completo com todos os adjacentes 
		return vet;
	}
	public int getTamnho(){
		return tamanho;
	}
	
	public List getListaEsp(int vert) {
		return vet[vert];
	}
}
