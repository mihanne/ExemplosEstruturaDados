package br.com.lista.exercicio2;


public class Elemento {
    private String valor;
    private Elemento proximo;
    
    public Elemento(String novoValor){
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}

