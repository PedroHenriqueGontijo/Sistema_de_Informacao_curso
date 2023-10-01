#include <stdio.h>

int VetMenor(int vet[], int j) {
    int n,i;
	n= vetor[0];
    int i;
    for ( i = 1; i < x; i++) 
        if (vet[i] <n) 
            n= vet[i];       
    }
    return menor;
}

int main() {
    int vet[100], a,n;
    int i;
    printf("Quantidades do Vetor");
    scanf("%d", &a);
    
    printf("Digite os dados para o vetor:\n");
    for ( i = 0; i <a; i++) {
        scanf("%d", &vet[i]);
    }
    
    menor = VetMenor(vet, a);
    printf("\nO menor valor do vetor %d",n);
    
    return 0;
}
