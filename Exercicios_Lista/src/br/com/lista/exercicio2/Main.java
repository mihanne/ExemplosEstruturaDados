package br.com.lista.exercicio2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ListaLigada listaNoiva = new ListaLigada();
		ListaLigada listaNoivo = new ListaLigada();
		
		ListaLigada listaGeral = new ListaLigada();
		String nome;
		int tamanho;
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Digite o convidado da Noiva: ");
			nome = ler.nextLine();
			listaNoiva.adicionar(nome);
		}
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Digite o convidado da Noivo: ");
			nome = ler.nextLine();
			listaNoivo.adicionar(nome);
		}
        
        //mostra a lista da Noiva
		System.out.println("****Lista da Noiva*****");
        for(int i=0; i < listaNoiva.getTamanho(); i++){
            System.out.println(listaNoiva.get(i).getValor());
        }
        
        //mostra a lista do Noivo
		System.out.println("****Lista do Noivo*****");
        for(int i=0; i < listaNoivo.getTamanho(); i++){
            System.out.println(listaNoivo.get(i).getValor());
        }
        
        if(listaNoiva.getTamanho()>=listaNoivo.getTamanho())
        	tamanho=listaNoiva.getTamanho();
        else
        	tamanho=listaNoivo.getTamanho();
        
        for(int i=0;i<tamanho;i++) {
        	if (i<listaNoiva.getTamanho())
        		listaGeral.adicionar(listaNoiva.get(i).getValor());
        	if (i<listaNoivo.getTamanho())
        		listaGeral.adicionar(listaNoivo.get(i).getValor());
        }
        //Lista Completa
    	System.out.println("****Lista Completa*****");
        for(int i=0; i < listaGeral.getTamanho(); i++){
            System.out.println(listaGeral.get(i).getValor());
        }

	}

}
