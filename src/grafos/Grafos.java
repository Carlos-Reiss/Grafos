package grafos;

import ListaAdj.Lista_de_adja;
import MatrizAdj.MatrizAdj;
import java.util.ArrayList;
import java.util.Scanner;

public class Grafos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList vet = new ArrayList();
        Arq arquivo = new Arq(); 
        vet = arquivo.Arq();       
        System.out.println("Arquivo Carregado...");
        
        menu();
        int op = input.nextInt();
        if(op == 1){
            
        }
        if(op == 2){
            
        }
        /*
            for(int i = 0; i < vet.size();i++){
               System.out.println(vet.get(i));
               if(i == 0){
                   Lista_de_adja grafo = new Lista_de_adja((int)vet.get(i));
               }
               else{
                   
               }
            }
        */                       
    }    

    private static void menu() {
        System.out.println("========================");
        System.out.println("1 - Lista Adjacencias  ");
        System.out.println("2 - Matriz Adjacencias ");
        System.out.print("Digite sua Opcão:");
    }
}
