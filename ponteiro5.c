#include <stdio.h>

void converter (char *destino,char *origem)
{
     int i=0;
while (origem[i] != '\0')
{
    printf("%c\t",origem[i]);
    if (origem[i]=="A"){
        destino[i]="00";
        printf("%c\t",destino[i]);
    }
    i++;
}
return;
}
int main ()
{
char str1[100],str2[100];
printf ("Entre com uma string: ");
gets (str1);
converter (&str2,str1);
printf ("\n\n%s",str2);
return(0);
}
