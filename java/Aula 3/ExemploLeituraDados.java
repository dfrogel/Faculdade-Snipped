import java.util.Scanner;

public class ExemploLeituraDados {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite um valor inteiro (int): ");
            int entradaInt = scan.nextInt();
            scan.nextLine(); // Limpa o buffer de entrada

            System.out.print("Digite um valor real (double): ");
            double entradaDouble = scan.nextDouble();
            scan.nextLine(); // Limpa o buffer de entrada

            System.out.print("Digite um valor lógico (boolean): ");
            boolean entradaBoolean = scan.nextBoolean();
            scan.nextLine(); // Limpa o buffer de entrada

            System.out.print("Digite uma string (palavra): ");
            String entradaString = scan.nextLine();

            // Imprimindo os valores lidos
            System.out.println("Valor inteiro: " + entradaInt);
            System.out.println("Valor real: " + entradaDouble);
            System.out.println("Valor lógico: " + entradaBoolean);
            System.out.println("String: " + entradaString);
        }
    }
}



/* EXPLICANDO O CÓDIGO
 Neste código, utilizamos a classe Scanner para realizar a leitura de dados a partir da entrada do usuário.

 No método main(), criamos uma instância de Scanner chamada scan e utilizamos métodos como nextInt(), 
 nextDouble(), nextBoolean() e nextLine() para ler os diferentes tipos de dados.
 
 No entanto, é necessário observar que ao ler tipos de dados diferentes em sequência (como int, double e boolean), 
 pode ocorrer um problema conhecido como "quebra de linha" (ou "newline") no buffer de entrada. 
 Isso acontece porque o método nextDouble(), por exemplo, não consome a quebra de linha deixada pelo nextInt(). 
 Para resolver esse problema, utilizamos o método nextLine() imediatamente após a leitura de cada tipo 
 de dado para limpar o buffer de entrada.

 Após a leitura dos valores, imprimimos os mesmos para verificar se foram lidos corretamente.

 */
