package br.com.exemplos.lista1;

public class Principal_ListaLigada {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		//lista.mostrarLista();
		lista.inserirInicio(new Integer(3));
		lista.inserirFinal(new Integer(7));
		lista.inserirMeio(new Integer(5),2);
		lista.mostrarLista();
		/*lista.inserirMeio(new Integer(4),2);
		lista.inserirMeio(new Integer(6),4);
		lista.mostrarLista();*/
		/*System.out.println("Total de n�s: " + lista.contarNos());
		lista.remover(new Integer(3));
		lista.remover(new Integer(7));
		System.out.println("Total de n�s ap�s remo��o: " + lista.contarNos());
		lista.mostrarLista();
		System.out.println("N�mero 6 est� na lista: " + lista.buscaNo(6));
	*/}

}
