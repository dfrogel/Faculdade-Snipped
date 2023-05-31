public class MontaVetor {
    public static void main(String[] args) {
        int[] vet = new int[5]; // Criação de um vetor de inteiros com tamanho 5

        vet[0] = 5; // Atribuição do valor 5 à primeira posição do vetor
        vet[1] = 6; // Atribuição do valor 6 à segunda posição do vetor
        vet[2] = 3; // Atribuição do valor 3 à terceira posição do vetor
        vet[3] = 9; // Atribuição do valor 9 à quarta posição do vetor
        vet[4] = 7; // Atribuição do valor 7 à quinta posição do vetor

        for (int i = 0; i < vet.length; i++) {
            // Loop que percorre o vetor e imprime a posição e o valor correspondente
            System.out.println("Vetor na posição [" + i + "] = " + vet[i]);
        }
    }
}

/* EXPLICANDO O CÓDIGO
 Neste código, estamos criando um vetor de inteiros chamado vet com tamanho 5. 
 Em seguida, atribuímos valores às posições do vetor usando o índice de cada elemento.

 No loop for, percorremos o vetor usando a variável i como índice. 
 A condição i < vet.length garante que o loop seja executado enquanto o valor de i for menor que o tamanho do vetor. 
 Em cada iteração, imprimimos a posição atual e o valor correspondente no vetor usando vet[i].

 */

