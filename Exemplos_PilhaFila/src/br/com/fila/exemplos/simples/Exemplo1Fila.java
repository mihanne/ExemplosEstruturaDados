package br.com.fila.exemplos.simples;
/*Como Fila é uma interface, não podem ser criados objetos do tipo fila. Sempre precisamos de uma classe que estenda essa lista para criar um objeto.
 E também, após a introdução dos Genéricos no Java 1.5, é possível restringir o tipo de objeto que pode ser armazenado na Fila. Essa fila de segurança de tipo pode ser definida como:
 Obj é o tipo do objeto a ser armazenado na Queue 
Queue <Obj> queue = new PriorityQueue <Obj>(); */
//Referências: https://acervolima.com/interface-de-fila-em-java/

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo1Fila {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

    // Adicionar os elements {0, 1, 2, 3, 4} na fila
    for (int i = 0; i < 5; i++)
        q.add(i);

    // Exibe os elementos da Fila
    System.out.println("Elementos da Fila " + q);

    // Remove o primeiro elemento da fila
    int removedele = q.remove();
    System.out.println("removed element-" + removedele);

    System.out.println(q);

    // Retorna a "cabeça da fila
    int head = q.peek();
    System.out.println("Cabeça da Fila: " + head);

    //Mostra o tamanho da Fila
    int size = q.size();
    System.out.println("Tamanho da Fila: " + size);
	}

}
