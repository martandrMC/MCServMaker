package martandrMC.servmaker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws IOException {
		new File("servjars").mkdir();
		new File("servprop").mkdir();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Server JAR path: ");
		File f = new File("servjars/"+sc.nextLine());
		f.createNewFile();
		BufferedWriter wr = new BufferedWriter(new FileWriter(f));
		wr.write("bamboozle");
		wr.close();
		sc.close();
	}
}
