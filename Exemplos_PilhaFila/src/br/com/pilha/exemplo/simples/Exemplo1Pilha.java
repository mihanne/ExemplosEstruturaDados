package br.com.pilha.exemplo.simples;

import java.util.Random;
import java.util.Stack;

public class Exemplo1Pilha {

	public static void main(String[] args) {
		Stack pilha = new Stack(); // Classe Pilha

		// Ver artigo geração de numeros randômicos
		    Random random = new Random();
		//Alimenta a pilha com números inteiros
		    for (int i=0;i<10;i++){
		// Insere na pilha números aleatórios de 0 a 100

		        System.out.println("Inserindo na pilha: " + pilha.push(random.nextInt(100)));

		    }
		    System.out.println("\n");
		// Retira da pilha
		 // for (int i=0;i<10;i++)
		    while(!pilha.empty())
		   {
		        System.out.println("Retirando da pilha: " + pilha.pop());
		    }

		}

	}
