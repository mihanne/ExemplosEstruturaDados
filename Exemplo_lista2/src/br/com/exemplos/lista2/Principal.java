package br.com.exemplos.lista2;

public class Principal {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
        lista.adicionar("Ana Magalh�es");
        lista.adicionar("Ant�nio Moraes");
        lista.adicionar("Maria Eduarda");
        lista.adicionar("S�rgio Santos");
        
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("�ltimo: " + lista.getUltimo().getValor());
        
               
        //remover Ana Magalh�es
        lista.remover("Ana Magalh�es");
        System.out.println("\nRemoveu Ana Magalh�es");
        
        System.out.println("\nTamanho: " + lista.getTamanho());
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
    }
}