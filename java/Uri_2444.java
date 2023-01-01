// package Ad-Hoc;

/*

 QUEST�O
 Bruno � um menino que gosta muito de ver televis�o. No entanto ele se depara 
 com um problema muito chato. Sempre que come�a um novo programa no canal 
 preferido dele, a TV Nlog�nia, acontece de o volume do som deste programa 
 estar diferente do anterior, �s vezes com volume menor, outras vezes com volume 
 maior. Quando est� com volume menor, ele aumenta o volume pressionando uma 
 quantidade de vezes seguidas o bot�o de aumentar para o volume ficar ideal; 
 a mesma coisa acontece quando est� um volume maior, e ele diminui o volume 
 pressionando alguma quantidade de vezes seguidas o bot�o de diminuir o volume 
 para ficar com o volume que ele goste no momento.

 O aparelho de TV dele tem umas peculiaridades: ele possui volume m�nimo, com 
 valor 0 (tamb�m chamado de mudo), e volume m�ximo, com valor 100. A TV nunca 
 ultrapassa os volumes m�ximo e m�nimo. Por exemplo, se o volume j� estiver no 
 m�ximo e ele pressionar o bot�o de aumentar o som, o volume n�o se altera. Da 
 mesma forma, se o volume estiver no valor m�nimo e ele pressionar o bot�o de 
 diminuir o som, o volume n�o se altera.

 Agora Bruno quer sua ajuda: ele lembra qual era o volume inicial da TV, e 
 quantas vezes ele pressionou cada bot�o. Mas, como foram v�rias mudan�as de volume, 
 ele n�o sabe qual � o volume atual da TV. Por isso, pediu que voc� o ajude a 
 calcular qual � o volume atual, dados o volume inicial e a lista de trocas de 
 volume que ele realizou.
 
 ENTRADA
 A primeira linha da entrada cont�m dois n�meros inteiros V (0 <= V <= 100) e 
 T (0 <= T <= 1000), que indicam, respectivamente, o volume inicial e o n�mero de 
 trocas de volume.

 A segunda linha cont�m T n�meros inteiros Ai (-100 <= Ai <= 100) que mostram 
 as modifica��es de volume realizadas, na ordem em que estas modifica��es foram 
 feitas. O primeiro n�mero indica a primeira modifica��o de volume, o segundo n�mero 
 indica a segunda modifica��o, e assim por diante. Para cada modifica��o, um n�mero 
 maior do que zero significa quantas vezes Bruno pressionou o bot�o de aumentar o 
 som; um n�mero menor do que zero significa quantas vezes ele pressionou o bot�o de 
 diminuir o som. Ou seja, se o n�mero � igual a 5, significa que nessa modifica��o 
 ele pressionou cinco vezes o bot�o de aumentar o som; se o n�mero � igual a -3, 
 significa que nessa modifica��o ele pressionou o bot�o de diminuir o som tr�s vezes.
 
 SA�DA
 Seu programa deve imprimir apenas uma linha, contendo apenas um inteiro F, que indica 
 qual o volume atual da TV ap�s as mudan�as de volume.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2444 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			V += sc.nextInt();
			if (V > 100) V = 100;
			if (V < 0)   V = 0;
		}
		System.out.println(V);
	}

}