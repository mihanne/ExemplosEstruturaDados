package br.com.exemplos.lista1;

public class Principal {

	public static void main(String[] args) {
		Nodo nodo7 = new Nodo();
		nodo7.setDado(7);
		Nodo nodo8 = new Nodo();
		nodo8.setDado(8);
		nodo7.setProximo(nodo8);
		System.out.println(nodo7.getDado());
		System.out.println(nodo7.getProximo());
		
	}

}
