// package Iniciante;

/*
 
 QUEST�O
 A Googlbook � uma famosa empresa de tecnologia mundial que acabou de abrir 
 uma filial na sua cidade! Al�m disso, a Googlbook tamb�m acabou de abrir as 
 inscri��es do processo seletivo para uma vaga de est�gio na empresa!

 Para se inscrever no processo seletivo, voc� deve enviar algumas informa��es 
 para a empresa, que ir� us�-las para decidir quem ser� contemplado com a 
 vaga. Voc� j� enviou todas as informa��es necess�rias, exceto uma: seu IRA 
 (�ndice de Rendimento Acad�mico). Para piorar, o Port�o do Aluno, sistema 
 que disponibiliza o hist�rico com IRA, est� fora do ar!

 Felizmente, voc� lembra de suas notas em todas as M disciplinas que cursou, 
 al�m de suas respectivas cargas hor�rias. Voc� tamb�m lembra que o IRA � 
 calculado da seguinte maneira: http://prntscr.com/kvvhk7
 
 , onde N1, N2, ..., NM s�o suas notas em cada disciplina, e C1, C2, ..., 
 CM s�o as cargas hor�rias das discplinas respectivas.

 Dada a nota obtida e a carga hor�ria de cada disciplina, determine seu IRA 
 para poder envi�-lo para a Googlbook o mais breve poss�vel!
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 o inteiro M (1 <= M <= 40), o n�mero de disciplinas cursadas. As pr�ximas M 
 linhas descrevem uma disciplina cada. Cada linha cont�m dois inteiros Ni e 
 Ci (0 <= Ni <= 100, 30 <= Ci <= 120), indicando a nota obtida na disciplina e a 
 carga hor�ria da mesma, respectivamente.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma linha contendo o valor do seu IRA. Arredonde 
 e imprima a resposta com exatamente 4 casas decimais. 
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2533 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int M = sc.nextInt();
			int totalC = 0;
			int totalNC = 0;
			for (int i = 0; i < M; i++) {
				double N = sc.nextInt();
				double C = sc.nextInt();
				totalNC += N * C;
				totalC += C;
			}
			double resultado = totalNC / (totalC * 100.0);
			System.out.println(String.format("%.4f", resultado));
		}

		sc.close();
	}
	
}