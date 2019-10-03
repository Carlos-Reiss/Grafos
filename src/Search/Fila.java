package Search;

import java.util.LinkedList;


public class Fila {
    LinkedList<Integer> fila = new LinkedList<Integer>();

    public void insert(int i){
        fila.add(i);
    }
    public int remove(){
        return this.fila.remove(0);
    }
    public boolean isEmpty(){
        if(fila.size() == 0) {
                return true;
        }
        else {
                return false;
        }
    }	
}
