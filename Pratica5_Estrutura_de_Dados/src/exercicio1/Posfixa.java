package exercicio1;
import java.util.Iterator;
import java.util.Stack;
/*Baseado em https://github.com/AndersonRezende/infixa-posfixa/blob/master/src/expressoes/Posfixa.java
 * */

public class Posfixa {
	
	public static String conversao(String infixa)
	{
		String posfixa = "";
		Stack<Integer> pilha = new Stack<Integer>();
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
	         		posfixa += infixa.charAt(cont);
	         		break;
	         }
    		cont++;
    	}
    	
    	while(pilha.size() > 0)
    	{
    		if((char)((int)pilha.peek()) != '(')
    			posfixa += (char)((int)pilha.pop());
    		else
    			pilha.pop();
    	}
    	
    	
    	return posfixa;
    
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

