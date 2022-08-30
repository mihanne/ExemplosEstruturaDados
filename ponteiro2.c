#include <stdio.h>
int main ()
{

void StrCpy (char *destino,char *origem)
{
while (*origem)
{
*destino=*origem;
origem++;
destino++;
}
*destino='\0';
}

char str1[100],str2[100],str3[100];
printf ("Entre com uma string: ");
gets (str1);
StrCpy (str2,str1);
StrCpy (str3,"Teste ");
printf ("\n\n%s%s",str3,str2);
return(0);
}
