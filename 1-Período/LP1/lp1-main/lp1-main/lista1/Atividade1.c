#include <stdio.h>

int somaVet(int vet [], int n){
	int soma 
	soma= 0, i;
	for(i=0;i<n;i++)
		soma+=vet[i];
	return soma;
}
int main () {
	int vet[100],i,n;
	puts("Digite o valor do vetor");
	scanf("%d", &n);
	for(i = 0; i < n; i++){
		puts("Digite o valor do vetor", i);
		scanf("%d", &vet[i]);
	}
	printf("Soma =%d.3",somaVet(vet, n));
	return 0;
}
