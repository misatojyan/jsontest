#include <stdio.h>

#define s(x) printf("size of " #x " is %d\n", sizeof(x))

#define a(x) printf("address of " #x " is %p\n", (void *)&x)

int main(void)
{
	int a, b, c, d, e, f, g;
	
	a(a);
	a(b);
	a(c);
	a(d);
	a(e);
	a(f);
	a(g);

	s(char);
	s(short);
	s(int);
	s(long);
	s(long long);
	s(float);
	s(double);
	s(long double);
	s(void *);
}
