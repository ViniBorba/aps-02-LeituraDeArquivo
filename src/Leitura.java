import java.io.*;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) throws IOException {

        Scanner s = null;//Objeto Scanner?

        try {
            s = new Scanner(new BufferedReader(new FileReader("/home/vini/Imagens/teste.txt")));
   //Como que um objeto Scanner poder ser tudo isso?
   // aqui que o 's' vira um objeto de Scanner?
   //e pq e preciso um FileReader dentro de um BufferReader? So o Buffer nÃ�Â£o Ã�Â© suficiente?

            while (s.hasNext()) {
   //objeto.hasNext() "nao sei que esse metodo faz"
                System.out.println(s.next());
                //imprime o objeto.next() "esse metodo .next() existe em diferentes classes?"
                //Se for, acho que o next() quebra a cada espacoo em branco.
                //Mas nao sei como isso acontece
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}