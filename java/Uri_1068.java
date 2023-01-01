// package Estruturas e Bibliotecas;

import java.util.Scanner;

public class Uri_1068 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {

	        String expressao = sc.nextLine();
	        int abertos = 0;
	        boolean errado = false;
            
	        for (int i = 0; i < expressao.length(); i++) {
				char caracter = expressao.charAt(i);
				if (caracter == ')') {
					if (abertos == 0) {
						errado = true;
						break;
					}
					abertos--;
				} else if (caracter == '(') {
					abertos++;
				}
			}
        	if (errado || abertos > 0) {
	            System.out.println("incorrect");	
	        } else {
	            System.out.println("correct");
	        }
		}

		sc.close();
    	
	}

}