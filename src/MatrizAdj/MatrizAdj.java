package MatrizAdj;


public class MatrizAdj {
    private int matriz[][];

    public MatrizAdj(int linha,int colu){
        matriz = new int[linha][colu];
    } 
    public void AdicionarArcos(int vertice,int aresta){
        matriz[vertice][aresta] = 1;
    }
    public void VerificarExArcos(int vertice, int aresta){
       if(this.matriz[vertice][aresta] == 0){
           System.out.println("Não exixte arcos");
       }else{
           System.out.println("Existe um arco"+vertice+","+aresta);
       }
    }
    public void VerificarSucessoresVert(){
        System.out.println("Lista de Sucessores");
        for(int l = 0; l < this.matriz.length;l++){
            //char car = (char)(l + 65);
            System.out.print(l);
                for(int c = 0; c < this.matriz[0].length;c++){
                   System.out.print("\t");
                    System.out.print(matriz[l][c]);
                }
                System.out.println();
        }
    }    
}
