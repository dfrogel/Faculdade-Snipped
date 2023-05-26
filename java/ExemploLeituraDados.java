import java.util.Scanner;

public class ExemploLeituraDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor inteiro (int):");
        int entradaInt = scan.nextInt();

        System.out.print("Digite um valor real (double):");
        double entradaDouble = scan.nextDouble();

        System.out.print("Digite um valor lógico (boolean):");
        boolean entradaBoolean = scan.nextBoolean();

        System.out.println("Digite uma string (palavra):");
        String entradaString = scan.next();
    }
}
