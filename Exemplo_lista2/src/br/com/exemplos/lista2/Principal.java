package br.com.exemplos.lista2;

public class Principal {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
        lista.adicionar("Ana Magalhães");
        lista.adicionar("Antônio Moraes");
        lista.adicionar("Maria Eduarda");
        lista.adicionar("Sérgio Santos");
        
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
        
               
        //remover Ana Magalhães
        lista.remover("Ana Magalhães");
        System.out.println("\nRemoveu Ana Magalhães");
        
        System.out.println("\nTamanho: " + lista.getTamanho());
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
    }
}