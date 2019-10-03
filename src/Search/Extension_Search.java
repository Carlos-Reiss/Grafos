package Search;

import java.util.ArrayDeque;
import java.util.List;

import GrafoLista.GrafosLE;

public class Extension_Search {
    int ante[];
	
    public Extension_Search(GrafosLE grafo, int start) {
        // busca em extensao BFS
        ArrayDeque<Integer> fila = new ArrayDeque<Integer>();

        Cor cor[] = new Cor[grafo.getTamnho()];
        int d[] = new int[grafo.getTamnho()];
        ante = new int[grafo.getTamnho()];
        /*
         * aqui iremos fazer a incializa�ao de todos os vetores e 
         * vamos seguir ao codigo
         */		
        for(int u = 0; u < grafo.getTamnho();u++){
            cor[u] = Cor.Branco;
            d[u] = Integer.MAX_VALUE;
            ante[u] = -1;
            
        }
        fila.add(start);
        cor[start] = Cor.Cinza;
        d[start] = 0;
        ante[start]= -1;
        int u;
        while(!fila.isEmpty()) {
            u = fila.remove();

            List a = grafo.getListaEsp(u);
            for(int i = 0; i < a.size();i++) {
                    int v = (int) a.get(i);
                    if (cor[v] == Cor.Branco) {
                        fila.add(v);
                        cor[v] = Cor.Cinza;
                        d[v] = d[u]+1;
                        ante[v] = u;
                    }
                cor[u] = Cor.Preto;
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
                System.out.println("n�o h� caminho");
            }
            else{
                Print_path(s,ante[v]);
                System.out.println(v);
            }
        }
    }
}
