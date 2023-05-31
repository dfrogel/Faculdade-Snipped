public class MontaMatriz {
    public static void main(String[] args) {
        double[][] mat = {{1.5, 5.2}, {3.6, 4.9}, {2.4, 8.1}};

        // Percorrendo as linhas da matriz
        for (int i = 0; i < mat.length; i++) {
            // Percorrendo as colunas da matriz
            for (int j = 0; j < mat[i].length; j++) {
                // Imprimindo a posição da matriz e o valor correspondente
                System.out.println("M[" + i + "][" + j + "] = " + mat[i][j]);
            }
        }
    }
}

/* EXPLICAÇÃO DO CÓDIGO
 Neste código, estamos criando uma matriz bidimensional chamada mat com três linhas e duas colunas. 
 Os valores da matriz são inicializados durante a declaração.

 Em seguida, temos um loop externo for que percorre as linhas da matriz usando a variável i. 
 Esse loop percorre os índices de 0 a mat.length - 1, onde mat.length retorna o número de linhas da matriz.

 Dentro do loop externo, temos um loop interno for que percorre as colunas da matriz usando a variável j. 
 Esse loop percorre os índices de 0 a mat[i].length - 1, onde mat[i].length retorna o número de colunas 
 na linha i da matriz.

 Em cada iteração dos loops, imprimimos a posição atual da matriz (linha e coluna) e 
 o valor correspondente usando mat[i][j].

 */