package exercicio1;

import java.util.Stack;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PosFixaResolve {
	
public static String conversao(String infixa)
{
	int i,j;
	int resultado=0;
	char operador;
	String posfixa = "";
	Stack<Integer> pilha = new Stack<Integer>();
	Queue<Integer> fila = new LinkedList<>();
	
	int cont = 0;
	char c;
	
	while(cont < infixa.length())
	{
		c = infixa.charAt(cont);
		switch(c)
		{
			case '*':
         	case '/':
         	case '+':
         	case '-':
         	case '^':
         		//se a pilha não estiver vazia e a prioridade do operador for menor ou igual ao que o que está no topo da pilha
         		while((!pilha.empty()) && prioridade(c) <= prioridade((char)((int) pilha.peek())))
         			posfixa += (char)((int)pilha.pop()); //desempilha
         		
         		pilha.add((int)c); //adicionar o elemento c
         		break;
         		
         	case '(':
         		pilha.add((int)c);
         		break;
         		
         	case ')':
         		while((char)((int)pilha.peek()) != '(')
         			posfixa += (char)((int)pilha.pop());
         		
         		if((char)((int)pilha.peek()) == '(')
         			pilha.pop();
         		break;
         		
         	default:
         		fila.add((int) infixa.charAt(cont));
         		posfixa += infixa.charAt(cont);
         		break;
         }
		cont++;
	}
	
	for (Iterator<Integer> itr = fila.iterator();itr.hasNext();) {
        System.out.print(itr.next() + " ");
    }
	
	while(pilha.size() > 0) {
		i=fila.remove();
		j=fila.remove();
		if((char)((int)pilha.peek()) != '(') {
			operador= (char)((int)pilha.pop());
			posfixa += operador;
			resultado+=operacao(i,j,operador);
		}
			else
			pilha.pop();
	}
	return posfixa;
}
public static int operacao(int i, int j, char elemento)
{
	int operacao=0;
	switch(elemento)
	{
		case '+':
			operacao=i+j;
			break;
		default:
			break;
	}
	return operacao;
}

public static int prioridade(char elemento)
{
	int prioridade;
	switch(elemento)
	{
		case '+':
		case '-':
			prioridade = 1;
			break;
			
		case '*':
		case '/':
			prioridade = 2;
			break;
			
		case '^':
			prioridade = 3;
			break;
			
		default:
				prioridade = 0;
				break;
	}
	
	return prioridade;
}
}


