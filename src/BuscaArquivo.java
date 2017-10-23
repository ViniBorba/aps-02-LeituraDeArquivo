import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class BuscaArquivo {
	
	private Scanner s = null;
	
	BuscaArquivo(String endereco) throws FileNotFoundException{
		s = new Scanner(new BufferedReader(new FileReader(endereco)));
	}
	
	public boolean facaAte(){
		return s.hasNext();//hasNext() boolean que verefica se existe próxima token
	}
	
	public String pulaUmaLinha(){
		return s.nextLine();
	}

	
	
}
