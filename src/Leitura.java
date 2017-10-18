import java.io.*;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) throws IOException {

        Scanner s = null;//Objeto Scanner?
        int c = 0;
    	String[] arrayStrings = new String[20];
        
		

        try {
            s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\631420217\\workspace\\participantes.csv"))).useDelimiter(",");
   //Como que um objeto Scanner poder ser tudo isso?
   // aqui que o 's' vira um objeto de Scanner?
   //e pq e preciso um FileReader dentro de um BufferReader? So o Buffer nao e suficiente?

            while (s.hasNext()) {
            	//int c = 0;
            	//String[] arrayStrings = new String[c];
            	//objeto.hasNext() "nao sei que esse metodo faz"
            	//s.reset();
                //System.out.println("" + s.findInLine(","));
            	System.out.println(s.next());
                //System.out.println(s.next() + s.findInLine(","));
                //arrayStrings[c] = s.next() + s.findInLine(",");
                //System.out.println(s.findInLine(","));
                //System.out.println(arrayStrings.length);
                //c = c + 1;
                //imprime o objeto.next() "esse metodo .next() existe em diferentes classes?"
                //Se for, acho que o next() quebra a cada espacoo em branco.
                //Mas nao sei como isso acontece
            }
            //System.out.println(arrayStrings[0]);
            //System.out.println(arrayStrings[1]);
            
            //for(int i = 0; i < 11; i ++){
				//System.out.println(arrayStrings[i]);
            //}
            
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}