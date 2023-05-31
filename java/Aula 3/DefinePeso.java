public class DefinePeso {

    public static void main(String[] args) {
        // Declaração e inicialização das variáveis nome, idade e peso
        String nome = "Eduarda";     // Variável para armazenar o nome
        int idade = 21;              // Variável para armazenar a idade
        double peso = 50.5;          // Variável para armazenar o peso

        // Imprime uma mensagem formatada com os valores das variáveis
        System.out.printf("%s, %d anos, pesa %.2f kg!", nome, idade, peso);
    }
}

/* EXPLICANDO O CÓDIGO
 Este programa simples demonstra o uso de variáveis e a impressão de uma mensagem formatada no console. 
 Ele declara e inicializa três variáveis: nome, idade e peso. 
 
 Em seguida, utiliza o método System.out.printf() para imprimir uma mensagem no formato especificado,
 onde %s representa uma String, %d representa um valor inteiro e %.2f representa um valor decimal com duas casas decimais.

 Ao executar o programa, a mensagem será exibida no console, mostrando o nome, a idade e o peso. 
 Por exemplo: "Eduarda, 21 anos, pesa 50.50 kg!".
 */
