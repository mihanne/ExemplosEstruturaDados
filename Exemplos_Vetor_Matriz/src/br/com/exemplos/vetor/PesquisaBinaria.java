package br.com.exemplos.vetor;

public class PesquisaBinaria {

	public static void main(String[] args) {
		  PesquisaBinaria bin = new PesquisaBinaria();
		    
		    int[] numeros = {1, 3, 4, 7, 9, 10, 13, 18, 20, 21, 22};
		    
		    bin.pesquisarNumero(20, numeros);
		   // bin.pesquisarNumero(3, numeros);
		  }
		  
		  /**
		   * Método que pesquisa um número dentro de um vetor de números.
		   * Este método utiliza o algoritmo de pesquisa binaria.
		   * 
		   * @param x    - Número que será pesquisado.
		   * @param numeros - Vetor de números.
		   */
		  public void pesquisarNumero(int x, int[] numeros) {
		    int inicio = 0;         //Posição inicial do vetor.
		    int meio = 0;          //Posição do meio do vetor.
		    int fim = numeros.length - 1;  //Posição final do vetor.
		    
		    /* Enquanto a posição do inicio for menor ou igual a posição do fim,
		      procura o valor de x dentro do vetor. */
		    while(inicio <= fim) {
		      meio = (fim + inicio) / 2; //Encontra o meio do vetor.
		      
		      System.out.println("Inicio: " + numeros[inicio] + " - Meio: " + numeros[meio] + " - Fim: " + numeros[fim]);
		     
		      /* Se o valor que está no meio do vetor é igual ao valor procurado, 
		        imprime que encontrou o valor e para de pesquisar. */
		      if(numeros[meio] == x) {
		        System.out.println("Encontrou o número " + x);
		        break;
		      }
		      
		      /* Este if serve para diminuir o tamanho do vetor pela métade. */
		      /* Se o valor que está no meio do vetor for menor que o valor de x, 
		        então o inicio do vetor será igual a posição do meio + 1. */
		      if(numeros[meio] < x) {
		        inicio = meio + 1;
		      } else {
		        /* Se o valor que está no meio do vetor for maior que o valor de x, 
		          então o fim do vetor será igual a posição do meio - 1. */
		        fim = meio - 1;
		      }
		    }
		    
		    /* Caso não encontre o valor pesquisado dentro do vetor,
		      imprime que não encontrou o valor pesquisado. */
		    if(inicio > fim) {
		      System.out.println("Não encontrou o número " + x);
		    }
		  }
		}