#include <stdio.h>


int contImpares(int a[],int j){
	int i, cont = 0;
	for(i = 0; i < j; i++){
		if(a[i] % 2 != 0){
			cont++;
		}
	}
	return cont;
}

int main () {
	int n, i;
	
	printf("Digite o tamanho do vetor: ");
	scanf("%d", &n);
	
	int vet[n];
	
	for(i = 0; i < n; i++){
		printf("Digite o %d° valor: ", i +1);
		scanf("%d", &vet[i]);
		}
	
	int cont = contImpares(vet, n);
	
	printf("Quantidade de impares: %d.", cont);
			
	return 0;
}
