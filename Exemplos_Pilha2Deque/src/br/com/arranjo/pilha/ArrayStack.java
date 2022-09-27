package br.com.arranjo.pilha;

import java.util.EmptyStackException;

/** * Implementação da interface Stack usando um arranjo de tamanho fixo. 
 * * Uma exceção é lançada ao tentar realizar uma operação de push quando o
 * * tamanho da pilha é igual ao tamanho do arranjo. Esta classe inclui os principais
 * * métodos da classe Java predefinida java.util.Stack
 *
 */
public class ArrayStack<E>  implements Stack<E> {
		protected int capacity; // capacidade real do arranjo da pilha
		public static final int CAPACITY = 1000; // capacidade default do arranjo
		protected E S[]; // arranjo genérico usado para implementar a pilha 
		protected int top=-1; // índice para o topo da pilha
		
		public ArrayStack() {
			this(CAPACITY); // capacidade default
		} 
		public ArrayStack(int cap) {
			capacity = cap;
			S = (E[]) new Object[capacity]; // o compilador deve gerar um aviso, mas está ok
		}
		public int size() {
			return (top + 1);
		}
		public boolean isEmpty() {
		return (top <0);

		}
		public void push(E element) throws FullStackException {
			if (size() == capacity)
					throw new FullStackException("Stack is full.");
			S[++ top] = element;
			} 
		public E top()  throws EmptyStackException {
			if (isEmpty())
					throw new EmptyStackException();
			return S[top];
			}
		public E pop() throws EmptyStackException {
		
			E element; 
			if (isEmpty())
				throw new EmptyStackException();
			element=S[top];
			S[top--] =null; 
			return element;
		}
		public String toString()
		{
			String s;
			s = "[";
			if (size() > 0) s+=S[0];
			if (size() >1)
				for (int i = 1; i < size()-1; i++) {
					s += ", " + S[i];
				}
			return s + "]";
		}
		//Imprime informação de estado sobre uma operação recente da pilha
		public void status(String op, Object element) {
			System.out.print("------> " + op);	// imprime esta operação
			System.out.println(", retorno: " + element);
			System.out.println("resultado: tamanho = " + size() + ", é vazio = " + isEmpty());
			System.out.println(", Pilha: " + this);	// conteúdo da pilha
		}

}
