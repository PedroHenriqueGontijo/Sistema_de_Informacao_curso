#include <stdio.h>
int VetMaior(int vet[], int j) {
    int n, i; 
	n= vet[0];
    for ( i =1; i <j; i++) 
        if (vet[i] > n) 
            n= vet[i];
    return maior;
}
int main() {
    int vet[100], a,n1;
    int i;
    printf("Qtde de elementos do vetor:");
    scanf("%d", &a);
    printf("Digite os dados para o vetor:\n");
    for ( i = 0; i < a; i++) {
        scanf("%d", &vetor[i]);
    }
    maior = VetMaior(vet, j);
    printf("\n O maior valor no vetor %d",n1);
    return 0;
}

