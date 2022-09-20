package br.com.exemplo.listaduplamenteencadeada;
/*O <T> é usado quando se quer criar uma classe onde suas variáveis são de um tipo que não é definido no momento em que ela é escrita,
 * mas sim no momento que ela é usada, deixando a critério do usuário dessa classe qual será o tipo da variável no lugar do T.
Além de T que é uma abreviação para o "tipo", existem outras siglas padronizadas por convenção entre os desenvolvedores Java:
E - Elemento
K - Chave
N - Número
T - Tipo
V - Valor
*/

public class NoDuplo <T> {
	private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}

