// package Ad-Hoc;

/*

 QUEST�O
 Jo�o est� comprando m�veis novos para sua casa. Agora � a vez de comprar um 
 colch�o novo, de molas, para substituir o colch�o velho. As portas de sua casa 
 t�m altura H e largura L e existe um colch�o que est� em promo��o com dimens�es A � B � C.

 O colch�o tem a forma de um paralelep�pedo reto ret�ngulo e Jo�o s� consegue 
 arrast�-lo atrav�s de uma porta com uma de suas faces paralelas ao ch�o, mas 
 consegue virar e rotacionar o colch�o antes de passar pela porta.

 Entretanto, de nada adianta ele comprar o colch�o se ele n�o passar atrav�s das 
 portas de sua casa. Portanto ele quer saber se consegue passar o colch�o pelas 
 portas e para isso precisa de sua ajuda.  

 ENTRADA
 A primeira linha da entrada cont�m tr�s n�meros inteiros A, B e C (1 <= A, B, C <= 300),
  as tr�s dimens�es do colch�o, em cent�metros. A segunda linha cont�m dois inteiros 
  H e L (1 <= H, L <= 250), respectivamente a altura e a largura das portas em cent�metros.

 SA�DA
 Imprima a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco
 antes e depois da igualdade. N�o esque�a de imprimir o fim de linha ap�s o 
 produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2409 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();
		
		     if (A <= H && B <= L) System.out.println("S");
		else if (A <= H && C <= L) System.out.println("S");
		else if (B <= H && A <= L) System.out.println("S");
		else if (B <= H && C <= L) System.out.println("S");
		else if (C <= H && A <= L) System.out.println("S");
		else if (C <= H && B <= L) System.out.println("S");
		else					   System.out.println("N");

		sc.close();
    }
    
}