// package Iniciante;

/*
 
 QUEST�O
 As aulas do Prof. Jatob� est�o dando o que falar. Os representantes do MEC 
 vieram at� a UNIME de Lauro de Freitas para saber mais detalhes sobre essa 
 nova forma de ensinar Algoritmos. Al�m disso, eles queriam selecionar 1 
 aluno para participar da OBI-Tec (Olimp�ada Brasileira de Inform�tica N�vel 
 T�cnica) e representar a rede Kroton na competi��o, pois sabem que l� est�o 
 os melhores. Para selecionar o melhor, eles t�m dispon�vel uma lista com o 
 n�mero de inscri��o de cada aluno e a sua respectiva nota na disciplina. Sua 
 tarefa � ajudar o pessoal do MEC a encontrar o aluno mais apto a representar 
 a institui��o e quem sabe garantir sua vaga. S� tem um detalhe, se a nota mais 
 alta n�o for maior ou igual a 8, voc� dever� imprimir �Minimum note not reached�.
 
 ENTRADA
 O arquivo cont�m primeiro a quantidade de alunos (3 <= n <= 100) existentes 
 e em seguida, os n alunos contendo o n�mero da matr�cula (0 < m < 1000000) de 
 cada um, seguido da respectiva nota (0 <= nota <= 10.0, com 1 casa decimal).

 Obs.: as notas n�o ser�o repetidas. Ou seja, n�o tem chance de ter dois alunos 
 com a mesma nota.
 
 SA�DA
 Voc� deve imprimir o n�mero do estudante que obteve a maior pontua��o ou 
 "Minimum note not reached" (sem aspas) caso nenhum estudante tenha tirado 
 uma nota maior ou igual a 8.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1983 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);	
    	int N = sc.nextInt();
    	int matricula, matriculaMaiorNota = 0;
    	double nota, maiorNota = 0; 
    	for (int i = 0; i < N; i++) {
    		matricula = sc.nextInt();
    		nota = sc.nextDouble();
    		if (nota > maiorNota && nota >= 8) {
    			maiorNota = nota;
    			matriculaMaiorNota = matricula;
    		}
    	}
    	
    	if (maiorNota == 0) System.out.println("Minimum note not reached");
    	else System.out.println(matriculaMaiorNota);

		sc.close();
    }
	
}