package br.com.exemplos.vetor;

public class PesquisaBinaria {

	public static void main(String[] args) {
		  PesquisaBinaria bin = new PesquisaBinaria();
		    
		    int[] numeros = {1, 3, 4, 7, 9, 10, 13, 18, 20, 21, 22};
		    
		    bin.pesquisarNumero(20, numeros);
		   // bin.pesquisarNumero(3, numeros);
		  }
		  
		  /**
		   * M�todo que pesquisa um n�mero dentro de um vetor de n�meros.
		   * Este m�todo utiliza o algoritmo de pesquisa binaria.
		   * 
		   * @param x    - N�mero que ser� pesquisado.
		   * @param numeros - Vetor de n�meros.
		   */
		  public void pesquisarNumero(int x, int[] numeros) {
		    int inicio = 0;         //Posi��o inicial do vetor.
		    int meio = 0;          //Posi��o do meio do vetor.
		    int fim = numeros.length - 1;  //Posi��o final do vetor.
		    
		    /* Enquanto a posi��o do inicio for menor ou igual a posi��o do fim,
		      procura o valor de x dentro do vetor. */
		    while(inicio <= fim) {
		      meio = (fim + inicio) / 2; //Encontra o meio do vetor.
		      
		      System.out.println("Inicio: " + numeros[inicio] + " - Meio: " + numeros[meio] + " - Fim: " + numeros[fim]);
		     
		      /* Se o valor que est� no meio do vetor � igual ao valor procurado, 
		        imprime que encontrou o valor e para de pesquisar. */
		      if(numeros[meio] == x) {
		        System.out.println("Encontrou o n�mero " + x);
		        break;
		      }
		      
		      /* Este if serve para diminuir o tamanho do vetor pela m�tade. */
		      /* Se o valor que est� no meio do vetor for menor que o valor de x, 
		        ent�o o inicio do vetor ser� igual a posi��o do meio + 1. */
		      if(numeros[meio] < x) {
		        inicio = meio + 1;
		      } else {
		        /* Se o valor que est� no meio do vetor for maior que o valor de x, 
		          ent�o o fim do vetor ser� igual a posi��o do meio - 1. */
		        fim = meio - 1;
		      }
		    }
		    
		    /* Caso n�o encontre o valor pesquisado dentro do vetor,
		      imprime que n�o encontrou o valor pesquisado. */
		    if(inicio > fim) {
		      System.out.println("N�o encontrou o n�mero " + x);
		    }
		  }
		}