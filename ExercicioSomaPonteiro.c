#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
//o terceiro par�metro da fun��o � um ponteiro
void soma(int a, int b, int *resultado)
{
//o resultado da soma ser� armazenado, de formaindireta (*) em r.
*resultado=a+b;
}
int main ()
{
int x, y, r;
setlocale(LC_ALL, "Portuguese");
printf("Digite a primeiro valor:");
scanf("%i",&x);
printf("Digite a segundo valor:");
scanf("%i",&y);
//o endere�o (&) de r � passado para resultado
soma(x,y,&r);
printf("O resultado da soma � %i",r);
}
