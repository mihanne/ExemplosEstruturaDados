#include <stdio.h>
int main ()
{
float matrx [50][50];
float *p;
int count;
p=matrx[0];
for (count=0;count<2500;count++)
{
*p=0.0;
printf("%f\t",matrx[count]);
p++;
}
return(0);
}
