package br.com.exemplo.listaduplamenteencadeada;

public class Main {

	public static void main(String[] args) {
		 ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

	        minhaListaEncadeada.addA("c1");
	        minhaListaEncadeada.addA("c2");
	        minhaListaEncadeada.addA("c3");
	        minhaListaEncadeada.addA("c4");
	        minhaListaEncadeada.addA("c5");
	        minhaListaEncadeada.addA("c6");
	        minhaListaEncadeada.addA("c7");

	        System.out.println(minhaListaEncadeada);
	        System.out.println(minhaListaEncadeada.get(3));

	        minhaListaEncadeada.remove(3);
	        minhaListaEncadeada.addB(3, "99");
	        System.out.println(minhaListaEncadeada);
	    }
}
