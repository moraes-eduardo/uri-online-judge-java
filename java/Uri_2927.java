// package Ad-Hoc;

/*
 
 QUEST�O
  Igor � professor de programa��o, e com a chegada do Natal, tempos de festas 
  e viagens, em sua sala est� ocorrendo muitos imprevistos, tanto em n�mero de 
  alunos quanto com problemas nos computadores por conta das f�rias do estagi�rio 
  da TI. Jazon � um aluno muito dedicado e deseja ajudar seu professor, por�m
  ainda � um aspirante na programa��o, por isso pediu sua ajuda para contabilizar 
  o n�mero de computadores que estar�o funcionando em um dia espec�fico desse m�s
  natalino, e  se � suficiente para o n�mero total de alunos. Se o n�mero de 
  computadores funcionais for insuficiente para o total de alunos, n�o haver� aula.

 O aluno tamb�m falou alguns detalhes:
 
  � Igor, o professor, sempre utiliza um dos computadores.
  � Caio � muito desastrado e queimou um n�mero X de computadores.
  � Existe um n�mero Y de computadores que n�o possuem compilador instalado.
  
 ENTRADA
 A entrada � composta por um n�mero A (0 < C <= 1000) de alunos e C (A <= C <= 
 1000) que corresponde ao n�mero de computadores. Al�m disso deve ser recebido um 
 n�mero X (X <= C <= 100) de computadores queimados por Caio e um n�mero Y (Y <= C 
 <= 1000) de computadores que n�o possuem compilador.
 
 SA�DA
 Caso n�o tenha aula, imprima �Igor bolado!�, mas se, sobre essa mesma condi��o, o 
 n�mero de computadores queimados por Caio for maior que a metade dos computadores 
 que n�o possuem compilador, imprima somente: �Caio, a culpa eh sua!�. Caso tenha 
 aula, imprima �Igor feliz!�.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_2927 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int numAlunos = sc.nextInt();
    	int numPc = sc.nextInt();
    	int qtsPcsQuebrados = sc.nextInt();
    	int qtsPcsSemComp = sc.nextInt();
    	if (numPc - qtsPcsQuebrados - qtsPcsSemComp > numAlunos) {
    		System.out.println("Igor feliz!");
    	} else {
    		if (qtsPcsQuebrados > qtsPcsSemComp / 2)
    			System.out.println("Caio, a culpa eh sua!");
    		else
    			System.out.println("Igor bolado!");
    	}

        sc.close();
    }
    
}