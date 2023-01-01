// package Iniciante;

/*
 
 QUEST�O
 O professor est� te ensinando sobre sensores. Este � um elemento muito importante 
 em diversas aplica��es. Para aprender melhor os conceitos de precis�o o professor 
 pediu para realizar uma montagem pr�tica do sensor Termo Ind v4.0 no novo 
 laborat�rio de Automa��o.

 Voc� como bom aluno anotou a f�rmula para o c�lculo da precis�o de um sensor:

 Onde QT � a quantidade de vezes que foi realizado o teste, X o valor medido em cada 
 teste e �X� a m�dia dos valores.

 Para realizar o teste voc� ficou H horas fazendo testes, e a cada M minutos voc� 
 verificou o valor X da temperatura entregue pelo sensor.

 Agora que voc� tem as medidas, e como voc� tem a habilidade de programar, fa�a um 
 programa que entregue a precis�o do sensor.
 
 ENTRADA
 Existem v�rios casos de teste, cada caso consiste de duas linhas. A primeira cont�m 
 dois valores H e M. E a segunda consiste dos valores de ponto flutuante Xi indicando 
 o valor de cada medida do sensor.

 � garantido que haver�o no m�nimo 5 e no m�ximo 105 medidas por caso e que estes 
 valores est�o no intervalo [0, 255] com duas casas decimais.
 
 SA�DA
 Para cada caso de teste, imprima uma �nica linha com um n�mero indicando a precis�o 
 do sensor. O valor calculado deve ser apresentado com 5 d�gitos ap�s o ponto decimal.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_2774 {
	    
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()) {
    		int H = sc.nextInt();
    		int M = sc.nextInt();
            int QT = H * 60 / M;
    		double avg = 0;
    		double sum = 0;
    		double ans = 0;
    		double[] x = new double[QT];
    		for (int i = 0; i < QT; i++) {
    			x[i] = sc.nextDouble();
    			avg += x[i];
    		}
    		avg /= (double) QT;
            for(int i = 0; i < QT; i++){
                sum += Math.pow(x[i] - avg, 2.0);
            }
            ans = Math.sqrt(sum / (double) (QT - 1));
            System.out.println(String.format("%.5f", ans));
    	}
    }
    
}