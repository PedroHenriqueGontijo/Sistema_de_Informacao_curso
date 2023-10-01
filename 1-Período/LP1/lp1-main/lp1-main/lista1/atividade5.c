#include <stdio.h>
#include <stdlib.h>
#include "biblioteca.h"

int verificarElemento(int vet[], int x, int a) {
   int qnt = 0;
   int i;
    for ( i= 0; i < x; i++) {
       if(vet[i] == a){      	
       	qnt++;  	
	   }	   
        }   
    return qt;
}
int main(){
	int vet[100], n, a, qt;
	printf("Quantidade de elementos do vetor:");
	scanf("%d",&n);
	printf("Coloque dados para o vetor ");
	leiaVetor(vetor,n);
	printf("Digite o elemento a ser verificado");
	scanf("%d",&a);
	qnt = verificarElemento(vetor,N,a);
	printf("\n");
	printf("Ele s repete %d vezes\n",qt);
	escrevaVetor(vet,n);	
}
