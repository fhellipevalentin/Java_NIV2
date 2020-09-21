package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Buon' Anno\\Documents\\GitHub\\Java_NIV2\\2. Arquivos\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				  //testa se existe uma nova linha no arquivo
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			//se o scanner continuar nulo é risco de ocorrer uma exceção
			if (sc != null) {
				//o scanner fecha independente se o bloco try dá erro ou não
				sc.close();
			}
		}
	}

}
