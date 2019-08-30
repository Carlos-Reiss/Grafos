package ListaAdj;

public class Lista_de_adja {
    ListaEnca vertices[];
    
    public Lista_de_adja(int qtd_vertices){
        vertices = new ListaEnca[qtd_vertices];
        for(int i=0;i<qtd_vertices;i++){
           ListaEnca aresta = new ListaEnca();
           vertices[i] = aresta;
        }
    }
    public void AdicionarArcos(int vertice,int aresta){
        vertices[vertice].Inserir(aresta);
    }
    public void VerificarExArcos(int vertice,int aresta){
        if(this.vertices[vertice].buscar(aresta) == -1){
            System.out.println("Não existe Arcos");
        }else{
            System.out.println(vertice+","+this.vertices[vertice].buscar(aresta));
        }
    }
    public void VerificarSucessoresVert(){
        System.out.println("Lista de Sucessores");
        for(int i = 0; i < this.vertices.length;i++){
            System.out.println(i+":");
            vertices[i].Exibir();
            System.out.println("");
        }
    }
    
    public void exibir() {
        System.out.println("Numero de vertices: "+vertices.length);
        for(int i=0;i < vertices.length; i++){
            System.out.println(i+":");
            vertices[i].Exibir();
            System.out.println("");
        }
    }
}
