package br.com.exemplo.arvore;

public interface Item {
	  public int compara (Item it);
	  public void alteraChave (Object chave);
	  public Object recuperaChave ();
	}