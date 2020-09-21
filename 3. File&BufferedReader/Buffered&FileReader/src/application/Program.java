package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Buon' Anno\\Documents\\GitHub\\Java_NIV2\\2. Arquivos\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {//abre o arquivo
			String line = br.readLine();
			while (line != null) {//enquanto o que estiver contido na linha lida for diferente de nulo
				System.out.println(line);
				line = br.readLine();//lê uma nova linha
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
