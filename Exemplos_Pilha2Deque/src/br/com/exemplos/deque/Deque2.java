package br.com.exemplos.deque;
//Fonte: https://acervolima.com/interface-deque-em-java-com-exemplo/

import java.util.ArrayDeque;
import java.util.Deque;

import java.util.Iterator;

public class Deque2 {

	public static void main(String[] args) {
		// Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();
  
        // add() method to insert
        dq.add("João");
        dq.addFirst("Pedro");
        dq.addLast("Antônio");
  
        System.out.println(dq);
        //pop() é usado para remover e retornar o cabeçalho do deque. No entanto, poll() é usado porque oferece a mesma funcionalidade que pop() e não retorna uma exceção quando o deque está vazio.
        System.out.println(dq.poll()); //desempilha similar ao pop()
        
        System.out.println(dq.pollFirst());
  
        System.out.println(dq.pollLast());
        
        System.out.println(dq);
        
        dq.add("Boa");
        dq.add("Noite");
        dq.add("Turma");
        System.out.println(dq);
        
        for (Iterator itr = dq.iterator();itr.hasNext();) {
               System.out.print(itr.next() + " ");
               if (itr.next().equals("Turma"))
            	   System.out.println("Achei");
           }
     
           System.out.println();
     
           for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
               System.out.print(itr.next() + " ");
           }

	}

}
