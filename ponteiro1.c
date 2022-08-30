#include <stdio.h>
int main()
{
int a = 25;
int *pa = &a;
int b = *pa + a;
printf("%d %d %d %d %d %d\n", a, pa, &a, *pa, b, &b);
return (0);
}
