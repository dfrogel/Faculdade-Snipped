import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        // Utilizar try-with-resources para criar o objeto Scanner
        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Informe um número inteiro: ");
            int numero = valor.nextInt();

            // Verificar se o número digitado é par
            if (numero % 2 == 0) {
                System.out.println("O número digitado é par!");
            } else {
                System.out.println("O número digitado é ímpar!");
            }
        } // O objeto Scanner será fechado automaticamente ao sair do bloco try
    }
}

/* EXPLICANDO O CÓDIGO
 A linha import java.util.Scanner; importa a classe Scanner, que será usada para ler a entrada do usuário.

 No método main, um objeto Scanner chamado valor é criado para ler a entrada do usuário.

 É exibida uma mensagem solicitando ao usuário que informe um número inteiro.

 O número digitado pelo usuário é lido usando valor.nextInt() e armazenado na variável numero.

 Em seguida, é verificado se o número é par usando o operador % para obter o resto da divisão por 2. Se o resto for igual a 0, significa que o número é par.

 Dentro do bloco if, a mensagem "O número digitado é par!" é exibida. Caso contrário, no bloco else, a mensagem "O número digitado é ímpar!" é exibida.

 O recurso try-with-resources, onde o objeto Scanner é criado dentro dos parênteses do try, e o Java se encarrega de fechá-lo automaticamente ao sair do bloco try. 
  Isso garante que os recursos sejam liberados corretamente, mesmo se ocorrerem exceções durante a execução.
 */