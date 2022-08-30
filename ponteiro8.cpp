#include <stdio.h>
int main()
{
int num,valor;
int *p;
num=55;
p=&num; /* Pega o endereco de num */
valor=*p; /* Valor e igualado a num de uma
maneira indireta */
printf ("\n\n%d variavel valor: ",valor);
printf("\nEndereco para onde o ponteiro aponta: %p ",p);
printf ("\nValor da variavel apontada: %d",*p);
return(0);
}
