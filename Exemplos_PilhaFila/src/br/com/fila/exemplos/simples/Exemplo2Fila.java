package br.com.fila.exemplos.simples;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import java.util.Iterator;

public class Exemplo2Fila {

	public static void main(String[] args) {
		 Queue<String> pq = new PriorityQueue<>();
		  
	        pq.add("Ana");
	        pq.add("João");
	        pq.add("Marcos");
	        pq.add("Camila");
	        pq.add("Joana");
	  
	        System.out.println(pq);
	        
	        pq.remove("Ana");
	        
	        System.out.println("Após a Remoção de Ana: " + pq);
	  
	        System.out.println("Método poll (remove o cabeçalho da fila e retorna): " + pq.poll());
	  
	        System.out.println("Fila Final:  " + pq);
	        //outro método de interar a fila
	       
	        
	        System.out.println("***Método de Interar a Fila***");
	        Iterator iterator = pq.iterator();
	        
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + "\n");
	        }
	}

}
