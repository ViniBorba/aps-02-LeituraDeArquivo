import java.io.*;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) throws IOException {

      
        int c = 0;
        
        Object[] linhasDoArquivo = new Object[10];
        
        BuscaArquivo arquivoCSV = new BuscaArquivo("/home/vini/Imagens/participantes.csv");
        
    
		
        
        while(arquivoCSV.facaAte()){//hasNext() boolean que verefica se existe próxima token
      
        	linhasDoArquivo[c] = arquivoCSV.pulaUmaLinha();
        	c = c + 1;
        	
        }
        
        for(Object u: linhasDoArquivo){
        	int p = 1;
        	System.out.println(u);
        	p++;
        }
        
   
        
  
    }
}