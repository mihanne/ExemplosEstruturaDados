package Questao1;

public class OrdenacaoDecrescente {

	public static void main(String[] args) {
		int vetor[] = {3,8,7,9,10,11,80,2,1,50};
		int valor,j;
		for(int i=2; i<10;i++) {
			valor=vetor[i];
			j=i-1;
			while ((j>=0) && (valor> vetor[j])){
				vetor[j+1]=vetor[j];
				j--;
				//if(j==0)
					//break;
			}
			vetor[j+1]=valor;
		}
		for(Integer t:vetor) 
			System.out.printf("%d \t",t);

	}

}
