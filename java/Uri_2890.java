// package Matem�tica;

/*

 QUEST�O
 Um designer inventou uma marca para uma empresa em forma de tetraedro. Ele tem 
 v�rias cores dispon�veis para pintar e quer saber de quantas  maneiras  diferentes  
 o  tetraedro  pode  ser  colorido usando  qualquer combina��o  de  cores  nas  faces  
 do  mesmo.  Note que, se mediante rota��es convenientes,  a colora��o   de  dois  
 tetraedros coincidir,   ent�o  trata-se  da  mesma colora��o.

 Ajude esse designer a fazer esse c�lculo.
 
 ENTRADA
 Cada linha de entrada cont�m um inteiro N, 1 <=  N  <=  104, o n�mero de cores 
 dispon�veis. A entrada termina com um valor 0, que n�o deve ser processado.
 
 SA�DA
 Para cada entrada, imprimir o  n�mero de  colora��es distintas do tetraedro,  com  o 
 n�mero de cores dado. Como o resultado pode ser muito grande, apresent�-lo  como o resto 
 da divis�o por 1000007.
 
*/

import java.util.Scanner;

public class Uri_2890 {
	
	public final static int MOD = 1000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			long n = sc.nextLong();
			if (n == 0) break;
			long result = ((11 * pow2(n) + pow4(n)) % MOD) * inverso(12) % MOD;
			System.out.println(result);
		}
	}
	
	public static long pow2(long a) {
		long result = 1;
		for (long i = 0; i < 2; ++i) {
			result = (result * a) % MOD;
		}
		return result;
	}

	public static long pow4(long a) {
		long result = 1;
		for (long i = 0; i < 4; ++i) {
			result = (result * a) % MOD;
		}
		return result;
	}

	public static long inverso(long a) {
		long[] x = new long[1];
		long[] y = new long[1];
		long d = mdc(a, MOD, x, y);
		if (x[0] < 0) {
			x[0] = x[0] + MOD;
		}
		return x[0];
	}

	public static long mdc(long a, long b, long[] x, long[] y) {
		long[] xx = new long[1];
		long[] yy = new long[1];

		if (b == 0l) {
			x[0] = 1l;
			y[0] = 0l;
			return a;
		}

		long d = mdc(b, a % b, xx, yy);
		x[0] = yy[0];
		y[0] = xx[0] - (a / b) * yy[0];

		return d;
	}
	
}