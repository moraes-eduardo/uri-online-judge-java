// package Iniciante;

import java.io.IOException;
import java.util.Scanner;

/*
 
 QUEST�O
 Roberto � um dos grandes professores que comp�em o corpo docente da 
 universidade de sua cidade. Treinar seus alunos para a maratona de 
 programa��o � uma de suas maiores paix�es, apesar de ser uma tarefa bem 
 dif�cil. Felizmente, neste semestre, v�rios alunos se inscreveram para 
 sua disciplina de programa��o competitiva.

 Para treinar seus alunos, Roberto costuma aplicar testes e provas 
 regularmente, onde sempre divide sua turma em diferentes duplas, j� que 
 neste ano, as equipes da maratona de programa��o ser�o formadas por apenas d
 ois integrantes.

 Ao longo do semestre, analisando os resultados das avalia��es e o 
 comportamento dos estudantes em sala de aula, Roberto percebeu que se os 
 alunos escolhidos para formar uma dupla n�o t�m afinidade, o desempenho 
 da equipe � bem inferior em rela��o �s duplas formadas por alunos que 
 apresentam tal comportamento. Podemos dizer que dois estudantes A e B 
 possuem afinidade caso perten�am ao mesmo grupo de amigos, ou seja, caso 
 possuam uma rela��o direta de amizade, ou se � poss�vel escrever uma sequ�ncia 
 de alunos X1, X2, X3, ... , XN , onde para todo i < N exista uma rela��o 
 direta de amizade entre os alunos Xi e Xi+1, com X1 = A e XN = B.

 A maratona de programa��o se aproxima e Roberto decidiu que montar� duplas 
 compostas apenas por alunos que possuem afinidade. Desta forma, as equipes de 
 sua universidade ser�o mais competitivas, aumentando as chances de 
 classifica��o para a pr�xima fase. Como a turma est� abarrotada de alunos, 
 ele pediu para voc� escrever um programa em que dadas as rela��es de amizades 
 entre os alunos e uma s�rie de consultas indicando dois estudantes, determine 
 para cada consulta se � poss�vel montar uma dupla com estes dois alunos.
 
 ENTRADA
 A entrada � composta por v�rios casos de teste. A primeira linha de um caso 
 de teste possui tr�s inteiros N, M e Q (2 <= N <= 104, 0 <= M <= 105, 1 <= Q <= 103), 
 representando, respectivamente, o n�mero de alunos, as rela��es de amizade 
 entre os estudantes e o n�mero de consultas. As pr�ximas M linhas possuem 
 dois inteiros X e Y (1 <= X, Y <= N e X != Y) indicando que o aluno X tem uma 
 rela��o direta de amizade com o aluno Y. Em seguida, cada uma das pr�ximas 
 Q linhas descreve uma consulta com dois inteiros A e B (1 <= A, B <= N e A != B), 
 indicando os estudantes de uma poss�vel equipe.
 
 SA�DA
 Para cada caso de teste imprima Q linhas, onde a i-�sima linha � a resposta 
 para a i-�sima consulta. Se for poss�vel montar uma dupla com os estudantes 
 indicados na consulta imprima o caractere �S�, caso contr�rio imprima o 
 caractere �N�. Imprima uma linha em branco ao final de cada caso de teste.
 
*/

public class Uri_2631 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int Q = sc.nextInt();
			UF union = new UF(N+999);
			
			for (int i = 0; i < M; i++) {
				int x = sc.nextInt() + 1;
				int y = sc.nextInt() + 1;
				union.union(x, y);
			}
			
			for (int i = 0; i < Q; i++) {
				int x = sc.nextInt() + 1;
				int y = sc.nextInt() + 1;
				if (union.connected(x, y)) System.out.println("S");
				else System.out.println("N");
			}
			if (sc.hasNext()) System.out.print("\n");
		}
	}

}

class UF {

    private int[] parent;  // parent[i] = parent of i
    private byte[] rank;   // rank[i] = rank of subtree rooted at i (never more than 31)
    private int count;     // number of components

    /**
     * Initializes an empty union�find data structure with {@code n} sites
     * {@code 0} through {@code n-1}. Each site is initially in its own 
     * component.
     *
     * @param  n the number of sites
     * @throws IllegalArgumentException if {@code n < 0}
    */
    public UF(int n) {
        count = n;
        parent = new int[n];
        rank = new byte[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    /**
     * Returns the component identifier for the component containing site {@code p}.
     *
     * @param  p the integer representing one site
     * @return the component identifier for the component containing site {@code p}
     * @throws IllegalArgumentException unless {@code 0 <= p < n}
    */
    public int find(int p) {
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];    // path compression by halving
            p = parent[p];
        }
        return p;
    }

    /**
     * Returns the number of components.
     *
     * @return the number of components (between {@code 1} and {@code n})
    */
    public int count() {
        return count;
    }
  
    /**
     * Returns true if the the two sites are in the same component.
     *
     * @param  p the integer representing one site
     * @param  q the integer representing the other site
     * @return {@code true} if the two sites {@code p} and {@code q} are in the same component;
     *         {@code false} otherwise
     * @throws IllegalArgumentException unless
     *         both {@code 0 <= p < n} and {@code 0 <= q < n}
    */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
  
    /**
     * Merges the component containing site {@code p} with the 
     * the component containing site {@code q}.
     *
     * @param  p the integer representing one site
     * @param  q the integer representing the other site
     * @throws IllegalArgumentException unless
     *         both {@code 0 <= p < n} and {@code 0 <= q < n}
    */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make root of smaller rank point to root of larger rank
        if      (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
        else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
        else {
            parent[rootQ] = rootP;
            rank[rootP]++;
        }
        count--;
    }
	
}