package br.com.exemplos.vetor;

import java.util.Scanner;

public class Ordena_Simples {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int aux;
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			System.out.printf("\nDigite Posição #%d",i+1);
			vetor[i]= entrada.nextInt();	
		}
		
		//ordenação de vetor simples
		for(int i=0; i<10; i++){
			for(int j=0; j<9; j++){
				if(vetor[j]> vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		//mostra vetor ordenado
		System.out.println("Vetor Ordenado");
		for(int i=0;i<10;i++){
			System.out.printf("%d\t",vetor[i]);	
		}
}
}