#include <stdio.h>
int main ()
{
int num,*p;
num=55;
p=&num;
/* Pega o endereco de num */
printf ("\nValor inicial: %d\n",num);
*p=100; /* Muda o valor de num de uma maneira indireta*/
printf ("\nValor final: %d\n",num);
return(0);
}
