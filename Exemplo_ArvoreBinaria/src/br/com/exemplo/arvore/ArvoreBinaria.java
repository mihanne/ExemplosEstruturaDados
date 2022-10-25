package br.com.exemplo.arvore;

public class ArvoreBinaria {
	  private static class No { 
	    Item reg; 
	    No esq, dir; 
	  }
	  private No raiz;
	  private void central (No p) {
	    if (p != null) {
	      central (p.esq);
	      System.out.println (p.reg.toString());
	      central (p.dir);
	    }
	  }
	  private Item pesquisa (Item reg, No p) {
	    if (p == null) return null; // @{\it Registro n\~ao econtrado}@
	    else if (reg.compara (p.reg) < 0) return pesquisa (reg, p.esq);
	    else if (reg.compara (p.reg) > 0) return pesquisa (reg, p.dir);
	    else return p.reg;
	  }
	  
	  private No insere (Item reg, No p) {
	    if (p == null) {
	      p = new No (); p.reg = reg; 
	      p.esq = null; p.dir = null;
	    }
	    else if (reg.compara (p.reg) < 0) p.esq = insere (reg, p.esq);
	    else if (reg.compara (p.reg) > 0) p.dir = insere (reg, p.dir);
	    else System.out.println ("Erro: Registro ja existente");
	    return p; 
	  }
	  private No antecessor (No q, No r) {
	    if (r.dir != null) r.dir = antecessor (q, r.dir);
	    else { q.reg = r.reg; r = r.esq; }
	    return r;
	  }
	  private No retira (Item reg, No p) {
	    if (p == null) System.out.println ("Erro: Registro nao encontrado");
	    else if (reg.compara (p.reg) < 0) p.esq = retira (reg, p.esq);
	    else if (reg.compara (p.reg) > 0) p.dir = retira (reg, p.dir);
	    else {
	      if (p.dir == null) p = p.esq;
	      else if (p.esq == null) p = p.dir;
	      else p.esq = antecessor (p, p.esq); 
	    }
	    return p; 
	  }

	  public ArvoreBinaria () {
	    this.raiz = null;
	  }
	  
	  public Item pesquisa (Item reg) {
	    return this.pesquisa (reg, this.raiz);
	  }

	  public void insere (Item reg) {
	    this.raiz = this.insere (reg, this.raiz);
	  }

	  public void retira (Item reg) {
	    this.raiz = this.retira (reg, this.raiz);
	  }
	  
	  public void imprime () {
	    this.central (this.raiz);
	  }

	  // @{\it M\'etodo para testar o funcionamento da classe}@
	  private void testa (No p) { 
	    if (p == null) return;
	    if (p.esq != null) { 
	      if (p.reg.compara (p.esq.reg) < 0) { 
	        System.out.println ("Erro: Pai " + p.reg.toString() + " menor que filho a esquerda " + p.esq.reg.toString());
	        System.exit(1);
	      }
	    }
	    if (p.dir != null) { 
	      if (p.reg.compara (p.dir.reg) > 0 ) { 
	        System.out.println ("Erro: Pai " + p.reg.toString() + " maior que filho a direita " + p.dir.reg.toString());
	        System.exit(1);
	      }
	    }
	    testa(p.esq);
	    testa(p.dir);
	  }
	  public void testa () { 
	    this.testa (this.raiz);
	  }

	}
