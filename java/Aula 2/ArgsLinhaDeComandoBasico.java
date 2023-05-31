public class ArgsLinhaDeComandoBasico {
    public static void main(String[] args) {
        System.out.printf("Quantidade de argumentos = %d%n", args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.printf("\targs[%d] =  %s%n", i, args[i]);
        }
    }
}

/* EXPLICANDO O CÓDIGO:

 Neste exemplo, temos um programa simples em Java que demonstra o uso de argumentos da linha de comando.

 O método "main" é o ponto de entrada da aplicação. Ele recebe um parâmetro "String[] args" que permite a 
 passagem de argumentos quando o programa é executado na linha de comando.
 
 No início do método, utilizamos "System.out.printf()" para exibir a quantidade de argumentos recebidos,
 utilizando "args.length" para obter o tamanho do array de argumentos.
 
 Em seguida, temos um loop "for" que percorre todos os elementos do array "args" e os imprime na saída padrão
 utilizando novamente "System.out.printf()". Utilizamos "%n" para imprimir uma nova linha.
 
 Dessa forma, ao executar o programa e passar argumentos na linha de comando, eles serão exibidos junto com
 sua posição no array "args".
 */