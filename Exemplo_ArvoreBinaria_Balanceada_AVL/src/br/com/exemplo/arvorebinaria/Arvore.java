package br.com.exemplo.arvorebinaria;

public class Arvore {
    private No raiz;

    public Arvore() {
        raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No node, int valor) {
        if (node == null) {
            return new No(valor);
        }

        if (valor < node.valor) {
            node.esquerda = inserirRecursivo(node.esquerda, valor);
        } else if (valor > node.valor) {
            node.direita = inserirRecursivo(node.direita, valor);
        } else {
            // Valor já existe, não faz nada (pode ser tratado de outra forma, se necessário)
            return node;
        }

        // Atualiza a altura do nó atual
        node.altura = 1 + Math.max(altura(node.esquerda), altura(node.direita));

        // Realiza as rotações para balancear a árvore
        int balance = getBalance(node);

        // Casos de desbalanceamento
        // Esquerda-Esquerda
        if (balance > 1 && valor < node.esquerda.valor) {
            return rotacaoDireita(node);
        }
        // Direita-Direita
        if (balance < -1 && valor > node.direita.valor) {
            return rotacaoEsquerda(node);
        }
        // Esquerda-Direita
        if (balance > 1 && valor > node.esquerda.valor) {
            node.esquerda = rotacaoEsquerda(node.esquerda);
            return rotacaoDireita(node);
        }
        // Direita-Esquerda
        if (balance < -1 && valor < node.direita.valor) {
            node.direita = rotacaoDireita(node.direita);
            return rotacaoEsquerda(node);
        }

        return node;
    }

    private int altura(No node) {
        if (node == null) {
            return 0;
        }
        return node.altura;
    }

    private int getBalance(No node) {
        if (node == null) {
            return 0;
        }
        return altura(node.esquerda) - altura(node.direita);
    }

    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));
        x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));

        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));
        y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));

        return y;
    }


        public boolean pesquisar(int valor) {
            return pesquisarRecursivo(raiz, valor);
        }

        private boolean pesquisarRecursivo(No node, int valor) {
            if (node == null) {
                return false;
            }

            if (valor == node.valor) {
                return true;
            }

            if (valor < node.valor) {
                return pesquisarRecursivo(node.esquerda, valor);
            }

            return pesquisarRecursivo(node.direita, valor);
        }

        public void imprimir() {
            imprimirRecursivo(raiz, 0);
        }

        private void imprimirRecursivo(No node, int nivel) {
            if (node != null) {
                imprimirRecursivo(node.direita, nivel + 1);
                for (int i = 0; i < nivel; i++) {
                    System.out.print("    ");
                }
                System.out.println(node.valor);
                imprimirRecursivo(node.esquerda, nivel + 1);
            }
        }

    public void imprimirInOrdem() {
        imprimirInOrdemRecursivo(raiz);
        System.out.println(); // Para uma quebra de linha após a impressão.
    }

    private void imprimirInOrdemRecursivo(No node) {
        if (node != null) {
            imprimirInOrdemRecursivo(node.esquerda);
            System.out.print(node.valor + " ");
            imprimirInOrdemRecursivo(node.direita);
        }
    }

    public void imprimirPreOrdem() {
        imprimirPreOrdemRecursivo(raiz);
        System.out.println(); // Para uma quebra de linha após a impressão.
    }

    private void imprimirPreOrdemRecursivo(No node) {
        if (node != null) {
            System.out.print(node.valor + " ");
            imprimirPreOrdemRecursivo(node.esquerda);
            imprimirPreOrdemRecursivo(node.direita);
        }
    }

    public void imprimirPosOrdem() {
        imprimirPosOrdemRecursivo(raiz);
        System.out.println(); // Para uma quebra de linha após a impressão.
    }

    private void imprimirPosOrdemRecursivo(No node) {
        if (node != null) {
            imprimirPosOrdemRecursivo(node.esquerda);
            imprimirPosOrdemRecursivo(node.direita);
            System.out.print(node.valor + " ");
        }
    }
    public void excluir(int valor) {
        raiz = excluirRecursivo(raiz, valor);
    }

    private No excluirRecursivo(No node, int valor) {
        if (node == null) {
            return node;
        }
        if (valor < node.valor) {
            node.esquerda = excluirRecursivo(node.esquerda, valor);
        } else if (valor > node.valor) {
            node.direita = excluirRecursivo(node.direita, valor);
        } else {
            // Nó com apenas um descendente ou nenhum
            if (node.esquerda == null) {
                return node.direita;
            } else if (node.direita == null) {
                return node.esquerda;
            }

            // Nó com dois descendentes: encontrar o sucessor (mais à esquerda na subárvore direita)
            node.valor = encontrarMenorValor(node.direita);

            // Excluir o sucessor
            node.direita = excluirRecursivo(node.direita, node.valor);
        }
        return node;
    }

    private int encontrarMenorValor(No node) {
        int menorValor = node.valor;
        while (node.esquerda != null) {
            menorValor = node.esquerda.valor;
            node = node.esquerda;
        }
        return menorValor;
    }
}
