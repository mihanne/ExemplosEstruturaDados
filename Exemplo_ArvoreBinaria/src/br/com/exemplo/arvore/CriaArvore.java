package br.com.exemplo.arvore;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CriaArvore {
	  public static void main (String[] args) throws Exception {
	    ArvoreBinaria dicionario = new ArvoreBinaria ();
	    BufferedReader in = new BufferedReader (
	                        new InputStreamReader (System.in));
	    int chave = Integer.parseInt (in.readLine());
	    while (chave > 0) {
	      MeuItem item = new MeuItem (chave);
	      dicionario.insere (item);
	      chave = Integer.parseInt (in.readLine());
	    }
	  }
	}
