package br.com.exemplo.arvore.binaria;
//baseado em https://gist.github.com/divanibarbosa/819e7cfcf1b9bae48c4e0f5bd74fb658

import java.util.Scanner;

public class ArvoreBinaria {

	 public static void main(String[] args) {
		    Scanner le = new Scanner(System.in);
		    Tree arv = new Tree();
		    int opcao;
		    long x;
		    System.out.print("\n Programa Arvore binaria de long");
		    do {
		        System.out.print("\n***********************************");
		        System.out.print("\nEntre com a opcao:");
			System.out.print("\n ----1: Inserir");
			System.out.print("\n ----2: Excluir");
			System.out.print("\n ----3: Pesquisar");
			System.out.print("\n ----4: Exibir");
			System.out.print("\n ----5: Sair do programa");
			System.out.print("\n***********************************");
			System.out.print("\n-> ");
			opcao = le.nextInt();
			switch(opcao) {
			 	case 1: {
				       System.out.print("\n Informe o valor (long) -> ");
				       x = le.nextLong();
				       arv.inserir(x);
				       break;
				}
				case 2: {
				       System.out.print("\n Informe o valor (long) -> ");
				       x = le.nextLong();
				       if ( !arv.remover(x) )
		                          System.out.print("\n Valor nao encontrado!");;
				       break;
				}
				case 3: {
				       System.out.print("\n Informe o valor (long) -> ");
		                       x = le.nextLong();
			      	       if( arv.buscar(x) != null )
				          System.out.print("\n Valor Encontrado");
				       else 
				          System.out.print("\n Valor nao encontrado!");
				       break;
				}	 
				case 4: {
				      arv.caminhar();
				      break; 
				}
		        } // fim switch
		    } while(opcao != 5);

		  }
		}
