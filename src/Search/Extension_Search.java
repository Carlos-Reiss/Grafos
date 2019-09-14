package Search;

import java.util.ArrayDeque;
import java.util.List;

import GrafoLista.GrafosLE;

public class Extension_Search {
		int ante[];
	
	public Extension_Search(GrafosLE grafo, int start) {
		// busca em extensao BFS
		ArrayDeque<Integer> fila = new ArrayDeque<Integer>();
		int u,va;
		
		Cor cor[] = new Cor[grafo.getTamnho()];
		int d[] = new int[grafo.getTamnho()];
		ante = new int[grafo.getTamnho()];
		/*
		 * aqui iremos fazer a incializaçao de todos os vetores e 
		 * vamos seguir ao codigo
		 */		
		for(u = 0; u < grafo.getTamnho();u++){
			cor[u] = Cor.Branco;
			d[u] = Integer.MAX_VALUE;
			ante[u] = -1;
		}
		cor[start] = Cor.Cinza;
		d[start] = 0;
		System.out.println("start: "+start);
		fila.add(start);

		while(!fila.isEmpty()) {
			u = fila.remove();
			System.out.println(u);
			List a[] = grafo.getAdjacencia();
	        for(int i = 0; i < a.length;i++) {
	        	List lista = a[i];
	        	System.out.println(lista);
	        	for( int v = 0; v < lista.size(); v++) {  		
	        		va = (int) lista.get(v);
	        		if(cor[va] == Cor.Branco) {
						cor[va] = Cor.Cinza;
						d[va] = d[u]+1;
						ante[v] = u;
						fila.add(va);
					}
					cor[u] = Cor.Preto;
	        	}
	        }
		}
		for(int i = 0; i <grafo.getTamnho();i++) {
			 System.out.println("indice:"+i+"\tCor:"+cor[i]+"\td:"+d[i]+"\tante:"+ante[i]);
		 }
	}
	
	public void Print_path(int s,int v) {
		if(v == s) {
			System.out.println(s);
		}
		else {
			if(ante[v] == -1) {
				System.out.println("não há caminho");
			}
			else{
				Print_path(s,ante[v]);
				System.out.println(v);
			}
		}
	}
	
}
