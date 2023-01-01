// package Ad-Hoc;

/*

 QUEST�O
 Jade ganhou de presente de anivers�rio um telesc�pio e ficou muito feliz, pois 
 adora olhar a lua � noite. Ela sempre foi uma estudante muito boa, e s� 
 analizando a lua por duas noites seguidas, j� consegue identificar as mudan�as 
 que ocorreram na ilumina��o e o percentual aproximado da lua que est� iluminada.

 Voc�, que � amigo da Jade e estuda Computa��o, resolveu fazer um pequeno programa 
 que, baseado nesta avalia��o que ela fez nas duas �ltimas noites, informa a fase 
 na qual a lua se encontra. Se a por��o vis�vel da lua no momento estiver entre 0 
 e 2%, por exemplo, � lua nova, se for entre 3 e 96% � lua crescente, se for entre 
 97 e 100% � lua cheia e se for entre 96 e 3% (diminuindo) � lua minguante.

 ENTRADA
 A entrada � composta por uma �nica linha contendo dois valores inteiros. O primeiro 
 valor corresponde ao percentual observado por Jade na noite de dois dias atr�s. O 
 segundo valor corresponde ao percentual observado por jade na noite anterior.
 
 SA�DA
 Baseado nos dois percentuais observados por Jade, imprima na tela a fase na qual a 
 lua se encontrava na noite anterior, conforme o exemplo abaixo. N�o esque�a de imprimir 
 o caractere de fim de linha ap�s a sa�da :).
 
*/

import java.util.Scanner;

public class Uri_1893 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int inicio = sc.nextInt();
        int finau = sc.nextInt();
        
        if (inicio >= 0 && finau <= 2) {
            System.out.println("nova");
        } else if (finau > inicio && finau <= 96) {
            System.out.println("crescente");
        } else if (inicio >= finau && finau <= 96) {
            System.out.println("minguante");
        } else { 
            System.out.println("cheia");
        }

        sc.close();
    }

}