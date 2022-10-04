package Exercicio2;
import javax.swing.JOptionPane;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class Principal_Deque {

	public static void main(String[] args) {
		Deque<Pessoa> dq = new ArrayDeque<Pessoa>();
		Pessoa p1 = null;
		String nome, telefone,email;
		String texto=null;  
		Iterator<Pessoa> itr;
		int opcao;
	do {	
		opcao=Integer.parseInt(JOptionPane.showInputDialog("<1> Cadastrar\n<2> Consultar ordem Crescente\n<3> Consultar ordem Decrescente\n<4> Sair"));
		switch (opcao)
		{
		case 1:
			nome=JOptionPane.showInputDialog("Nome:");
			telefone=JOptionPane.showInputDialog("Telefone:");
			email=JOptionPane.showInputDialog("Email:");
			
			p1 = new Pessoa(nome,telefone,email);
			dq.add(p1);
			break;
		case 2:
			texto="";
		   for (itr = dq.iterator();itr.hasNext();) {
			   texto+=itr.next().mostraDados();
           }
		   JOptionPane.showMessageDialog(null, texto,"De A...Z",JOptionPane.DEFAULT_OPTION);
			break;
			 
		case 3:
			texto=""; 
			for (itr = dq.descendingIterator(); itr.hasNext();) {
				texto+=itr.next().mostraDados();
	           }
			 JOptionPane.showMessageDialog(null, texto,"De Z...A",JOptionPane.DEFAULT_OPTION);
			 break;
		case 4:
			 break;	 
		}
	}while(opcao!=4);
	}

}
