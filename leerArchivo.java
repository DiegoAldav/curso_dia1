package clase4;

import java.nio.file.Files;
import java.nio.file.Paths;

public class cuestionario_e4 {

	public static void main(String[] args) throws Exception {
		String archivo = "C:\\Users\\mustafa\\Documents\\unTexto.txt";
		//String archivo = "unTexto.txt";
		//String archivo = "Documents\\\\unTexto.txt";
		
		for (String linea : Files.readAllLines(Paths.get(archivo))) {
			System.out.println(linea);
		}

	}

}
