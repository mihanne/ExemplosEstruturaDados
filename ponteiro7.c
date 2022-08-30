int main()
{
int y,*p, x;
y = 0;
p=&y;
x=*p;
x=4;
(*p)++;
x--;
(*p)+= x;
printf("y=%d", y);
printf("\np=%d",*p);
printf("\nx=%d", x);
return(0);
}
