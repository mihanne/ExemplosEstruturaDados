package br.com.lista.exercicio1;

public class Elemento {
    private int valor;
    private Elemento proximo;
    
    public Elemento(int novoValor){
        this.valor = novoValor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
