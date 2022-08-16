package br.com.exemplos.vetor;

import java.util.Random;

public class Maior_Menor {

	public static void main(String[] args) {
		int vetor[]; //declara��o do vetor
		vetor = new int[50];//aloca��o de mem�ria
				
		Random numrandomico = new Random(); //declara variavel do tipo randomico
		int maxValue= Integer.MIN_VALUE; //atribui a variavel maxValue o menor valor de inteiro
		int minValue = Integer.MAX_VALUE; //atribui a variavel minValue o maior valor de inteiro
		
		//preenche o vetor de 50 posi��es com numeros randomicos
		for(int i=0;i<50;i++){
			vetor[i]= numrandomico.nextInt(999);	
		}
		//descobrindo o menor e maior valor no vetor
		for(int i=0;i<50;i++){
			if (vetor[i]>maxValue)	
				maxValue=vetor[i];
			if (vetor[i]<minValue)	
				minValue=vetor[i];
		}
		
		//exibe o maior e menor valor
		System.out.println("O maior valor � " + maxValue);
		System.out.println("O menor valor � " + minValue);
		
		System.out.println("Vetor rand�mico:");
		//exibe todo o vetor
		for(int num:vetor)
			System.out.println(num);
		
	}

}
