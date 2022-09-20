package br.com.pilha.exemplo.simples;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Exemplo2Pilha {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner;
		Stack pilha = new Stack(); // Classe Pilha
		
        scanner = new Scanner(new File("c:\\teste/nomes.txt"));
        while (scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }
        System.out.println("Tamanho da Pilha " + pilha.size());
       System.out.println("****Pilha de Nomes*****");
        while(!pilha.empty())
		   {
		        System.out.println(pilha.pop());
		    }
	}

}
