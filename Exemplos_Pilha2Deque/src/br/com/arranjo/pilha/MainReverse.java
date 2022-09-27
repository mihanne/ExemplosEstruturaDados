package br.com.arranjo.pilha;
import java.util.Arrays;

public class MainReverse {
		public static <E> void reverse(E[] a) throws FullStackException {
			ArrayStack<E> S = new ArrayStack<E>(a.length);
			for (int i=0; i<a.length; i++)
				S.push(a[i]);
			for (int i=0; i < a.length; i++)
				a[i] = S.pop();
		}
	public static void main(String[] args) throws FullStackException {
		//teste de mostrar na ordem inversa
		
				Integer[ ] a = {4, 8, 15, 16, 23, 42};	// o autoboxing permite isso 
				{}String[] s = {"Jack", "Kate", "Hurley", "Jin", "Boone"};
				System.out.println("a = " + Arrays.toString(a));
				System.out.println("s = " + Arrays.toString(s));
				System.out.println("Reversing. . .");
				reverse(a);
				reverse(s);
				System.out.println("a = " + Arrays.toString(a));
				System.out.println("s = " + Arrays.toString(s));

	}

}
