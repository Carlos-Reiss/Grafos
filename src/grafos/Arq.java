package grafos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Arq {
     
    public ArrayList Arq(){     
        ArrayList linhas = new ArrayList();
        try{
            BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/Carlos Reis/Documents/NetBeansProjects/Grafos/teste.txt"));
            String linha = leitor.readLine();
            while(linha!= null){
                linhas.add(linha);
                linha = leitor.readLine();
            }
            leitor.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        return linhas;
    }
}

