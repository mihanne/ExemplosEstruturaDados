package Questao2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class PilhaPratos {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner;
		Stack pilha1 = new Stack(); // Classe Pilha
		
        scanner = new Scanner(new File("c:\\teste/pilha1.txt"));
        while (scanner.hasNextLine()){
            pilha1.push(scanner.nextLine());
        }
        
        Stack pilha2 = new Stack(); // Classe Pilha
		
        scanner = new Scanner(new File("c:\\teste/pilha2.txt"));
        while (scanner.hasNextLine()){
            pilha2.push(scanner.nextLine());
        }
        
        Stack pilha3 = new Stack(); // Classe Pilha
		
        scanner = new Scanner(new File("c:\\teste/pilha3.txt"));
        while (scanner.hasNextLine()){
            pilha3.push(scanner.nextLine());
        }
        
        while(!pilha1.empty())
		   {
		        System.out.println("Assistente 1 - prato: "+pilha1.pop());
		        System.out.println("Assistente 2 - prato: "+pilha2.pop());
		        System.out.println("Assistente 3 - prato: "+pilha3.pop());
		    }
        

	}

}
