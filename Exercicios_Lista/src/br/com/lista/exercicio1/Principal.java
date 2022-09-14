package br.com.lista.exercicio1;

public class Principal {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		ListaLigada listaPrioridade = new ListaLigada();
		for (int i=1; i<=200; i++)
		{
			lista.adicionar(i);
		}
        
        System.out.println("Todos da fila");
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        
       
        for (int i=1; i<=100; i+=2)
		{
			if (i%2!=0) //valida se é impar
			{
				listaPrioridade.adicionar(i); //adiciona na lista prioridade
				lista.remover(i); //remove da lista
			}
		}
        
        System.out.println("Fila de Prioridade");
        for(int i=0; i < listaPrioridade.getTamanho(); i++){
            System.out.println(listaPrioridade.get(i).getValor());
        }
        
        System.out.println("Fila Normal");
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
	}

}
