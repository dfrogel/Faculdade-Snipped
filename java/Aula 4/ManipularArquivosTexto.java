import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ManipularArquivosTexto {
    public static void main(String[] args) {
        // Criando um objeto File para representar o arquivo "Poemas.txt"
        File arquivo = new File("Documentos\\Poemas.txt");
        
        try (Scanner scanner = new Scanner(arquivo)) {
            // Usando um bloco "try-with-resources" para garantir que o recurso Scanner seja fechado automaticamente após o uso
            while (scanner.hasNextLine()) {
                // Verificando se ainda há linhas a serem lidas no arquivo
                // e avançando para a próxima linha usando o método nextLine()
                String linha = scanner.nextLine();
                // Exibindo a linha atual no console
                System.out.println(linha);
            }
        } catch (FileNotFoundException ex) {
            // Lidando com a exceção caso o arquivo não seja encontrado
            System.out.printf("Erro na abertura do arquivo: %s.%n", ex.getMessage());
        }
    }
}

/* EXPLICANDO O CÓDIGO
 Neste código, estamos lendo e manipulando um arquivo de texto chamado "Poemas.txt". 
 Inicialmente, criamos um objeto File que representa o arquivo desejado.

 Em seguida, usamos um bloco "try-with-resources" com um objeto Scanner para ler o conteúdo do arquivo. 
 O bloco "try-with-resources" garante que o recurso Scanner seja fechado automaticamente após o uso, 
 eliminando a necessidade de fechá-lo manualmente.

 Dentro do bloco while, usamos o método hasNextLine() para verificar se ainda há linhas a serem lidas no arquivo. 
 Em seguida, usamos o método nextLine() para ler a próxima linha e armazená-la em uma variável chamada linha. 
 Por fim, exibimos essa linha no console usando o System.out.println().

 Se ocorrer uma exceção FileNotFoundException, isso significa que o arquivo não foi encontrado. 
 Nesse caso, capturamos essa exceção e exibimos uma mensagem de erro apropriada.

 Esse código corrigido permite a leitura do arquivo "Poemas.txt" e a exibição de seu conteúdo linha por linha no console.

 */

