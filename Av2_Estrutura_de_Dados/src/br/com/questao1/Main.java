package br.com.questao1;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws FullStackException, FileNotFoundException {
		String nome;
		Scanner scanner;
		ArrayStack<String> A = new ArrayStack<String>();
		
		Queue<String> pq = new LinkedList<>();
		 scanner = new Scanner(new File("c:\\teste/nomes.txt"));
	        while (scanner.hasNextLine()){
	        	nome=scanner.nextLine();
	            A.push(nome);
	            A.status(nome, A);
	        }

		while(!A.isEmpty())
		   {
		        nome=A.pop();
				//System.out.println(nome);
		        pq.add(nome);
		        
		    }
     
		System.out.println("Tamanho da Pilha " + A.size());  
        System.out.println("***Mostrando a  Fila***");
        Iterator iterator = pq.iterator();
        
		
	    while (iterator.hasNext()) {
	         System.out.print(iterator.next() + "\n");
	     }	
	}
}

