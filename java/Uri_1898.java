// package Strings;

/*

 QUEST�O
 A ag�ncia ga�cha para investiga��es criminais denominada OBI (Opera��o de Baita 
 Investiga��o) notou que, a exemplo do que ocorreu na Petrobr�s, muito dinheiro 
 foi desviado dos cofres p�blicos do estado para pagamento de propina a pol�ticos 
 nos �ltimos anos, especialmente pelo partido QU (Quadrilha Unida).

 A investiga��o est� em andamento e a ag�ncia recrutou voc� para converter alguns 
 valores que ficaram com caracteres estranhos ap�s terem sidos descriptografados 
 dos arquivos originais. Sua tarefa neste caso � relativamente simples: basta 
 retirar todos os caracteres estranhos (n�o num�ricos) de cada um dos dois valores 
 dispon�veis e somar estes valores. Apenas tome o cuidado de separar da soma os 
 primeiros 11 d�gitos do primeiro valor. Eles correspondem ao CPF do corrupto :)

 ENTRADA
 A entrada � composta por duas linhas, cada uma delas contendo entre 1 e 60 
 caracteres ('0'-'9' e outros caracteres n�o num�ricos ou, pelo menos, 1 caracter 
 '0'-'9') e no m�ximo um ponto ".". Desconsiderando os caracteres n�o num�ricos, o 
 n�mero final n�o deve ter mais de 17 caracteres (incluindo o ponto decimal).
 Qualquer n�mero ap�s a segunda casa decimal deve ser descartado.

 SA�DA
 Imprima o CPF do corrupto, conforme apresentado abaixo e soma dos valores que 
 foram desviados dos cofres p�blicos, sempre com duas casas decimais.

*/

import java.io.IOException;
import java.util.Scanner;
 
public class Uri_1898{
 
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String cpf = "";
		String valor1 = sc.next().replaceAll("[^\\d.]", "");
		String valor2 = sc.next().replaceAll("[^\\d.]", "");
		
		if (valor1.length()  <= 11) {
			cpf = valor1;
			valor1 = "";
		} else {
			cpf = valor1.substring(0, 11);
			valor1 = valor1.substring(11, valor1.length());
		}
		
		if (valor1.contains(".")) {
			int index = valor1.indexOf(".");
			String numerosDepoisDoPonto = valor1.substring(index, valor1.length());
			if (numerosDepoisDoPonto.length() > 3) {
				valor1 = valor1.substring(0, index + 3);
			}
		}
		
		if (valor2.contains(".")) {
			int index = valor2.indexOf(".");
			String numerosDepoisDoPonto = valor2.substring(index, valor2.length());
			if (numerosDepoisDoPonto.length() > 3) {
				valor2 = valor2.substring(0, index + 3);
			}
		}
		
		double v1 = 0;
		if (!valor1.isEmpty()) {
			v1 = Double.parseDouble(valor1);
		}
		double v2 = Double.parseDouble(valor2);
		 
		double total = v1 + v2;
		
		System.out.println("cpf " + cpf);
		System.out.println(String.format("%.2f", total));

		sc.close();
    }
 
}