package Search;

import java.util.List;

import GrafoLista.GrafosLE;

public class Deep_Search {
	int ante[];
	int fim[];
	int inicio[];
	Cor cor[];
	public int time;
	
	public void DFS_Visit(GrafosLE grafo, int u) {
		cor[u] = Cor.Cinza;
		inicio[u] = time++;
		
		List a = grafo.getListaEsp(u);
        for(int i = 0; i < a.size();i++) {
    		int v = (int) a.get(i);
    		if (cor[v] == Cor.Branco) {
    			ante[v] = u;
    			DFS_Visit(grafo, v);
    		}
    		cor[u]= Cor.Preto;
    		fim[u] = time++;
        }
	}
	
	public Deep_Search(GrafosLE grafo, int s) {
		cor = new Cor[grafo.getTamnho()];
		inicio = new int[grafo.getTamnho()];
		ante = new int[grafo.getTamnho()];
		fim = new int[grafo.getTamnho()];
		/*
		 * aqui iremos fazer a incializaçao de todos os vetores e 
		 * vamos seguir ao codigo
		 */		
		for(int i = 0; i < grafo.getTamnho();i++){
			cor[i] = Cor.Branco;
			inicio[i] = -1;
			fim[i] = -1;
			ante[i] = -1;
			//System.out.println("indice:"+i+"\tCor:"+cor[i]+"\tinicio:"+inicio[i]+"\tante:"+ante[i]+"\t fim:"+fim[i]);
		}		
		time = 1;
		List a[] = grafo.getAdjacencia();
		for(int i = 0; i < a.length;i++) {
			List aux = a[i];
			for(int v = 0; v < aux.size(); v++) {
				if(cor[v] == Cor.Branco) {
					DFS_Visit(grafo, s);
				}	
			}
		}
	}
	public void exibir() {
		for(int i = 0; i < cor.length;i++){
			System.out.println("indice: "+i+"\tCor:"+cor[i]+"\tAnte:"+ante[i]+"\tinicio: "+inicio[i]+"\tfim: "+fim[i]);
		}		
		
	}
	
}
