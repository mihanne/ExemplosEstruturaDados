#include <stdio.h>
void calcula (float r, float *p, float *a){
 *p = 2 * 3.14 * r;
 *a = 3.14 * r * r;
 return;
}
int main() {
 float r, p, a;
 scanf ("%f", &r);
 calcula (r, &p, &a);
 printf ("raio = %f, perimetro = %f, area = %f\n", r, p, a);
 return 0;
}
