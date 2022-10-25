package exemploSBB;

import java.util.Random;
import exemploSBB.MeuItem;
import exemploSBB.PermutacaoRandomica;

public class TestaArvore{
  public static void main (String[] args) {
    ArvoreSBB dicionario = new ArvoreSBB ();
    int max = 10;
    
    MeuItem x;
    int vetor[] = new int[max];

    for (int i = 0; i < max; i++)
      vetor[i] = i;

    // @{\it Gera uma permuta\c{c}\~ao aleat\'oria de chaves entre 0 e max-1}@
    PermutacaoRandomica.permut (vetor, max);
    
    // @{\it Insere cada chave na \'arvore e testa sua integridade ap\'os cada inser\c{c}\~ao}@
    for (int i = 0; i < max; i++) { 
      x = new MeuItem (vetor[i]);
      dicionario.insere (x);
      System.out.println ("Inseriu chave: " + x.toString());
      dicionario.testa ();
    }
    System.out.println ("Insercao finalizada\n");  
    // @{\it Retira uma chave aleatoriamente e realiza v\'arias pesquisas}@
    for (int i = 0; i < max; i++) {
        Random rand = new Random ();
        int k =  rand.nextInt (10);
        int n = vetor[k];
        x = new MeuItem (n);
        dicionario.retira (x);
        dicionario.testa ();
        System.out.println ("Retirou chave: " + x.toString());
        for (int j = 0; j < max; j++) { 
          x = new MeuItem (rand.nextInt (10));
          if (x.compara (new MeuItem (n)) != 0 ) {
            System.out.print("Pesquisando chave: " + x.toString());
            x = (MeuItem)dicionario.pesquisa (x);
            System.out.println (" , encontrou:" + x.toString());
          }
        }
      x = new MeuItem (n);
      dicionario.insere (x);
      System.out.println ("Inseriu chave: " + x.toString());
      dicionario.testa ();
    }

    // @{\it Retira a raiz da \'arvore at\'e que ela fique vazia}@
    for (int i = 0; i < max; i++) { 
      x = new MeuItem (vetor[i]);
      dicionario.retira (x);
      dicionario.testa ();
      System.out.println ("Retirou chave: " + x.toString());
    }
  }
}
