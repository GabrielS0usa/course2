package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good nigth"};
		
		String path = "C:\\GitHub\\workspaceEclipse\\in.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
