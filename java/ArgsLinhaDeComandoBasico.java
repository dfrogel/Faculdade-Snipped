public class ArgsLinhaDeComandoBasico {
    public static void main(String[] args) {
        System.out.printf("Quantidade de argumentos = %d%n", args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.printf("\targs[%d] =  %s%n", i, args[i]);
        }
    }
}

/* explicando o código:
 * public static void main: é a assinatura do ponto de entrada da aplicação
 * String[]: Vetor de strings que permite a passagem de quantos argumentos quisermos
 * args: Parâmetro que recebe valores no momento da execução do código
 */