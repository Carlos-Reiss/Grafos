package Search;

import java.util.List;

import GrafoLista.GrafosLE;
import java.util.ArrayDeque;

public class Deep_Search {
    int ante[];
    int fim[];
    int inicio[];
    Cor cor[];
    int time;
    ArrayDeque<Integer> pilha;
    
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
            }
        cor[u]= Cor.Preto;
        fim[u] = time++;
    }
    public Deep_Search(GrafosLE grafo) {
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
                inicio[i] = fim[i] = -1;
                ante[i] = -1;
        }
        time = 1;
        for(int v = 0; v < grafo.getTamnho();v++){
            if(cor[v] == Cor.Branco) {
                DFS_Visit(grafo, v);	
            }
        }		
        time = 1;
        List a[] = grafo.getAdjacencia();
        for(int i = 0; i < a.length;i++) {
                List aux = a[i];
                for(int v = 0; v < aux.size(); v++) {
                    if(cor[v] == Cor.Branco) {
                            DFS_Visit(grafo, v);
                    }	
                }
        }

    }
    public void exibir() {
        for(int i = 0; i < cor.length;i++){
            System.out.println("indice: "+i+"\tCor:"+cor[i]+"\tAnte:"+ante[i]+"\t inicio: "+inicio[i]+"\tfim: "+fim[i]);
        }
    }
       
    public ArrayDeque<Integer> Ordena_TopLog(GrafosLE grafo) {
        
        pilha = new ArrayDeque<Integer>();
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
                inicio[i] = fim[i] = -1;
                ante[i] = -1;
        }
        time = 1;
        for(int v = 0; v < grafo.getTamnho();v++){
            if(cor[v] == Cor.Branco) {
                DFS_Visit__OT(grafo, v);	
            }
        }		
        time = 1;
        List a[] = grafo.getAdjacencia();
        for(int i = 0; i < a.length;i++) {
                List aux = a[i];
                for(int v = 0; v < aux.size(); v++) {
                    if(cor[v] == Cor.Branco) {
                            DFS_Visit__OT(grafo, v);
                    }	
                }
        }
        return pilha;
    }
    public void DFS_Visit__OT(GrafosLE grafo, int u) {
        cor[u] = Cor.Cinza;
        inicio[u] = time++;

        List a = grafo.getListaEsp(u);
            for(int i = 0; i < a.size();i++) {
                    int v = (int) a.get(i);
                    if (cor[v] == Cor.Branco) {
                            ante[v] = u;
                            DFS_Visit__OT(grafo, v);
                    }
            }
        cor[u]= Cor.Preto;
        fim[u] = time++;
        pilha.push(u);
    }
    public void exibirPilha() {
            System.out.println("\tPilha:"+pilha);
    }
}
