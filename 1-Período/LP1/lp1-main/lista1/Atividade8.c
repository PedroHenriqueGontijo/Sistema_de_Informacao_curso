#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "matrizLib.h"

int main(){
	int resu[100], n, i, cont[100], faces;
	printf("Quantidade de vezes que o dado foi lancado: ");
	scanf("%d",&n);
	for (i=0;i<n; i++) {
        printf("lançamento %d: ",i+1);
        scanf("%d", &resu[i]);
    }
	faces=6;
	contador[faces];
	contarFaces(resultados, N, contador, faces);
    for (i = 0; i < faces; i++) {	
        printf("Face %d: %d ocorrencias\n", i + 1, contador[i]);   
    }	
}
