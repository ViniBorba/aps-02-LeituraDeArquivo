import java.io.*;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) throws IOException {

        Scanner s = null;//Objeto Scanner?
        int c = 0;
        //String[] arrayStrings = new String[c]
        Object[] linhasDoArquivo = new Object[20];
        
        
        
        s = new Scanner(new BufferedReader(new FileReader("/home/vini/Imagens/participantes.csv")));
		
        
        while(s.hasNext()){//hasNext() boolean que verefica se existe próxima token
        	
        	System.out.println(s.nextLine()); //nextLine() segue para a proxima linha
        }
        
        //System.out.println(s.nextLine());
        //System.out.println(s.nextLine());
        

        /*
        
        
        try {
            s = new Scanner(new BufferedReader(new FileReader("/home/vini/Imagens/participantes.csv"))).useDelimiter(",");
            													//C:\\Users\\631420217\\workspace\\participantes.csv
   //Como que um objeto Scanner poder ser tudo isso?
            //System.out.println(s);
   //e pq e preciso um FileReader dentro de um BufferReader? So o Buffer nao e suficiente?

            while (s.hasNext()) {//boolean que verefica se existe próxima linha
            	//int c = 0;
            	//String[] arrayStrings = new String[c];
            	//s.reset();
                //System.out.println("" + s.findInLine(","));
            	//System.out.print(s.next()+" - ");
            	//System.out.println(s);
            	//System.out.println(s.useDelimiter(","));
            	//System.out.println(s);
                //System.out.println(s.next() + s.findInLine(","));
                //arrayStrings[c] = s.next() + s.findInLine(",");
            	//arrayStrings[c] = s.next();
            	//arrayStrings[c] = s.nextLine();
            	linhasDoArquivo[c] = s.findInLine(",");
                //System.out.println(arrayStrings.length);
                c = c + 1;
                //imprime o objeto.next() "esse metodo .next() existe em diferentes classes?"
                //Se for, acho que o next() quebra a cada espacoo em branco.
                //Mas nao sei como isso acontece
            }
            //System.out.print(arrayStrings[0]);
            //System.out.print(arrayStrings[1]);
            //System.out.print(arrayStrings[2]);
            System.out.print(linhasDoArquivo[0]);
            
            //for(int i = 0; i < 11; i ++){
				//System.out.println(arrayStrings[i]);
            //}
            
        } finally {
            if (s != null) {
                s.close();
            }
        }
        */
    }
}