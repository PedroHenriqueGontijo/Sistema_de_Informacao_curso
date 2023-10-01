#include <stdio.h>
#include <stdlib.h>
#include "biblioteca.h"

int multiplicarVetores(int vet1[], int vet2[], int vetResu[], int x) {
   int i;
    for (i=0;i<x; i++) 
      vetorResult[i] = vet1[i] * vet2[i];
}

int main(){	
	int vet1[100], vet2[100], vetResu[100], n, i;
	printf("Digite os elementos dos veotres");
	scanf("%d",&n);
	printf("Digite os dados para o vetor1: ");
	leiaVetor(vet1,n);
	printf("Digite os dados para o vetor2: ");
	leiaVetor(vet2,n);
	printf("\n");
	multiplicarVetores(vet1,vet2,vetResu,n);
	printf("\n");
    for (i = 0; i < N; i++) {
        printf("%d ", vetorResult[i]);
    }
    printf("Resultado final\n");	
}
