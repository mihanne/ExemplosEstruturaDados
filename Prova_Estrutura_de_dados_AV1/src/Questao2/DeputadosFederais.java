package Questao2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeputadosFederais {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner;
		int i=1;
		Queue<String> fila1 = new LinkedList<>(); 
		Queue<String> fila2 = new LinkedList<>(); 
		Queue<String> fila3 = new LinkedList<>(); 
		scanner = new Scanner(new File("c:\\teste/deputadosfederais.txt"));
	        while (scanner.hasNextLine() && i<=20){
		        	fila1.add(scanner.nextLine());
		        	i++;
	        }
	        i=1;
	        while (scanner.hasNextLine() && i<=20){
	        	fila2.add(scanner.nextLine());
	        	i++;
        }
	        i=1;
	        while (scanner.hasNextLine() && i<=20){
	        	fila3.add(scanner.nextLine());
	        	i++;
        }
	        System.out.println("***Fileira 1***");
	        Iterator iterator = fila1.iterator();
	        
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + "\n");
	        }   
	        
	        System.out.println("***Fileira 2***");
	        Iterator iterator2 = fila2.iterator();
	        
	        while (iterator2.hasNext()) {
	            System.out.print(iterator2.next() + "\n");
	        }   
	        System.out.println("***Fileira 3***");
	        Iterator iterator3 = fila3.iterator();
	        
	        while (iterator3.hasNext()) {
	            System.out.print(iterator3.next() + "\n");
	        }   
	       

	}

}
