package ListaAdj;
public class ListaEnca {
    private Node first;
    private Node last;
   
    void Inserir(int numero){
        if(this.isEmpty()){
            Node novo = new Node(numero);
            this.first = novo;
            this.last = novo;
        }
        else{
            Node novo = new Node(numero);
            last.setNext(novo);
            last = novo;
        }
    }
    public int buscar( int aresta){
        if(isEmpty() == true){
            return -1;
        }
        else{
            Node aux = this.first;
            while(aux != null){
                if(aux.getValue() == aresta){
                    return aux.getValue();
                }
                aux = aux.getNext();
            }
            return -1;
        }
    } 
    boolean isEmpty(){
        if(first == null){
            return true;
        }
        else{
            return false;
        }
    }
   void Exibir(){
       Node aux = first;
       if(first == null){
           System.out.print("Sem arestas!");
       }
       while(aux != null){
            char car = (char)(aux.getValue() + 65);
           System.out.println(car+" ");
           aux = aux.getNext();
       }
   }
}