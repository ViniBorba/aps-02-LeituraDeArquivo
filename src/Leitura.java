import java.io.*;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) throws IOException {
    	
    	
    	Scanner entrada = new Scanner(System.in);
    	int c = 0;
        
        Object[] linhasDoArquivo = new Object[10];

        
        BuscaArquivo arquivoCSV = new BuscaArquivo("/home/vini/Imagens/participantes.csv");
       
        while(arquivoCSV.facaAte()){
      
        	linhasDoArquivo[c] = arquivoCSV.pulaUmaLinha();
        	c++;
        	
        }
        
        for(Object u: linhasDoArquivo){
        	
        	System.out.println(u);
        }
  
    }
}