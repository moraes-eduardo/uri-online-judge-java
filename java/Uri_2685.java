// package Iniciante;

/*
 
 QUEST�O
 J�lio est� criando um novo Smart Watch especialmente para programadores. 
 � impressionante as vantagens que ele oferece e o conforto pra codar que ele 
 tem. O rel�gio ainda est� em desenvolvimento e ele prometeu consertar os bugs 
 e colocar uns apetrechos melhores e, em troca, pediu um sistema simples para 
 o modo Standy Bay. O problema � que o rel�gio por si s� sempre tem o �ngulo de 
 inclina��o do Sol/Lua(de 0 a 360). Valendo um rel�gio, caso deseja aceitar: dada 
 em grau da inclina��o do Sol/Lua, informe em qual per�odo do dia ele se encontra.
 
 ENTRADA
 A entrada cont�m um n�mero inteiro M (0 <= M <= 360) representando o grau do Sol/Lua. 
 Como a posi��o muda constantemente seu programa receber� diversos casos a cada segundo(EOF).
 
 SA�DA
 Imprima uma sauda��o referente ao per�odo do dia que ele se encontra: "Boa Tarde!!", 
 "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2685 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()) {
    		int graus = sc.nextInt();
    		if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
    		else if (graus < 180) System.out.println("Boa Tarde!!");
    		else if (graus < 270) System.out.println("Boa Noite!!");
    		else if (graus < 360) System.out.println("De Madrugada!!");
    		else System.out.println("Bom Dia!!");
    	}

		sc.close();
    }
    
}