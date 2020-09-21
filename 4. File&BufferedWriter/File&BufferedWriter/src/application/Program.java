package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		 
		String [] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		String path = "C:\\Users\\Buon' Anno\\Documents\\GitHub\\Java_NIV2\\4. File&BufferedWriter\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();//quebra de linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
