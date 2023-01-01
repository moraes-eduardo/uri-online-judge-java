// package Ad-Hoc;

/*
 
 QUEST�O
 6+9=15 parece ok. Mas como pode estar certo 4+6=2?

 Veja s�. Mofiz trabalhou duro durante seu curso de Eletr�nica Digital, mas quando 
 lhe foi solicitado que implementasse um somador de 32 bits como exame no laborat�rio, 
 ele acabou fazendo algum erro na parte de projeto. Depois de vasculhar seu projeto 
 por uma hora e meia, ele encontrou seu erro. Ele estava fazendo soma de bits, mas 
 seu carregador de bit (carry) sempre apresentava como sa�da o valor zero. Portanto,

 4  = 00000000 00000000 00000000 00000100
 +6 = 00000000 00000000 00000000 00000110
 ----------------------------------------
 2  = 00000000 00000000 00000000 00000010
 
 Claro que j� � uma boa coisa ele finalmente ter encontrado o seu erro, mas isso foi 
 muito tarde. Considerando seu esfor�o durante o curso, o instrutor deu a ele mais uma c
 hance: Mofiz teria que escrever um programa eficiente que pegaria 2 valores decimais 
 de 32 bits sem sinal como entrada e deveria produzir um n�mero de 32 bits sem sinal como 
 sa�da, ou seja, somando do mesmo modo como o circuito faz.
 
 ENTRADA
 Em cada linha de entrada haver� um par de inteiros separado por um �nico espa�o. 
 A entrada termina com EOF.

 SA�DA
 Para cada linha de entrada, o programa dever� fornecer uma linha de sa�da, que � o valor 
 ap�s somar dois n�meros no modo �Mofiz�.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_1026 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()) {
    		long u = sc.nextLong();
    		long m = sc.nextLong();
    		System.out.println(u ^ m);
    	}

		sc.close();
    }
    
}