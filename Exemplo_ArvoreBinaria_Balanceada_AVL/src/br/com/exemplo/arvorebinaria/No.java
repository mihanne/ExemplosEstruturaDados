package br.com.exemplo.arvorebinaria;

public class No {
    int valor;
    int altura; // Nova propriedade para armazenar a altura do nó
    No esquerda;
    No direita;

    public No(int valor) {
        this.valor = valor;
        this.altura = 1; // Inicializa a altura como 1 para um nó recém-criado
        this.esquerda = null;
        this.direita = null;
    }
}