import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Uri_1215 {

	public static void main(String[] args) {	
		// Inicializando o dicionario que ira conter todas as palavras
		Set<String> dicionario = new TreeSet<>();
		
		// Incializando o sc que ira ler todas as linhas
		Scanner sc = new Scanner(System.in);
		
		// Lendo o input até finalizar
		while (sc.hasNextLine()) {
			
			String linha = readLine(sc).toLowerCase().replaceAll("[^a-z]", " ").replaceAll("\\s+"," ").trim();
			String[] palavras = linha.split(" ");
			dicionario.addAll(Arrays.asList(palavras));
			
		}
		
		for (String palavra : dicionario) {
		    if (palavra.trim().length() > 0) { 
			    System.out.println(palavra.trim());
		    }
		}
		
	}
	
	
	/*
	 * Método para ler a String sem bugs de espaçamentos
	 */
	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}

}
