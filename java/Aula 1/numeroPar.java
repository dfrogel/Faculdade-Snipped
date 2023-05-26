
import java.util.*;
//Importar o scanner
public class numeroPar {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = valor.nextInt();
        // caso o número digitado seja par 
        if(numero % 2 == 0) {
            System.out.println("O número digitado é par!");
        }
        // caso o número digitado seja impar
        else{
            System.out.println("O número digitado não é par!");
        }
        System.exit(0);
    }
}