package Questao3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

import javax.swing.JOptionPane;



public class MainRedeSocial {

	public static void main(String[] args) {
		Iterator<PostRedeSocial> itr;
		int opcao;
		String texto="";
		Deque<PostRedeSocial> dq = new ArrayDeque<PostRedeSocial>();
		PostRedeSocial post1= null;
		
		do {
            opcao=Integer.parseInt(JOptionPane.showInputDialog("<1>Cadastrar Post \n<2>Visualizar Posts Relevantes \n<3>Sair"));
            switch (opcao)
            {
            case 1:
            	
	            String post = JOptionPane.showInputDialog("Post:");
				byte relevancia = Byte.parseByte(JOptionPane.showInputDialog("Relevancia: <1> Alta e <2> Baixa"));
				post1 = new PostRedeSocial(post, relevancia);
				JOptionPane.showMessageDialog(null, post1.getMsg() + "\n"+ post1.getRelevancia());
				if (relevancia==1)
					dq.addFirst(post1);
				else
					dq.addLast(post1);
				break;
            case 2:
            	texto="";
            	for (PostRedeSocial postteste: dq){
	             if (postteste.getRelevancia()==1){
	                texto=texto+ postteste.getMsg() +"\n";
	             }
            	}
            	JOptionPane.showMessageDialog(null, texto,"Postagens Relevantes", JOptionPane.DEFAULT_OPTION);
            	break;
            case 3:
            	break;
            }
		}while(opcao!=3);
			 
	}

}
