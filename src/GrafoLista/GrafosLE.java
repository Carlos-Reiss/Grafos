package GrafoLista;

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
		vet[origem].add(destino);
	}
	public void exibir() {
		for(int i = 0; i < vet.length;i++) {
			List a = vet[i];
			System.out.print(i+":");	
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
