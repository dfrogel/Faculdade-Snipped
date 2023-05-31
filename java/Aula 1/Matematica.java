public class Matematica {
    // Método para multiplicar dois inteiros
    static int mult(int a, int b) {
        return a * b;
    }
    
    // Método para multiplicar dois números de ponto flutuante
    static double mult(double a, double b) {
        return a * b;
    }
    
    // Método para multiplicar três números de ponto flutuante
    static double mult(double a, double b, double c) {
        return a * b * c;
    }
    
    public static void main(String[] args) {
        System.out.println("Mult:" + Matematica.mult(5, 3));
        System.out.println("Mult:" + Matematica.mult(3.2, 4.1));
        System.out.println("Mult:" + Matematica.mult(1.4, 2));
        System.out.println("Mult:" + Matematica.mult(2, 3.5));
        System.out.println("Mult:" + Matematica.mult(4.5, 5.2, 2));
    }
}

/* EXPLICANDO O CÓDIGO
 A classe Matematica contém três métodos chamados mult, que são exemplos de sobrecarga de métodos. 
 Cada um desses métodos tem uma assinatura diferente, permitindo que eles sejam chamados com argumentos de tipos diferentes.

 O primeiro método mult(int a, int b) recebe dois argumentos inteiros e retorna o resultado da multiplicação desses números como um inteiro.

 O segundo método mult(double a, double b) recebe dois argumentos de ponto flutuante e retorna o resultado da multiplicação desses números como um double.

 O terceiro método mult(double a, double b, double c) recebe três argumentos de ponto flutuante e retorna o resultado da multiplicação desses números como um double.

 No método main, várias chamadas desses métodos são feitas para demonstrar a sobrecarga de métodos. 
 Os resultados são impressos no console usando System.out.println, que exibe a mensagem "Mult:" seguida do valor retornado pelos métodos.

 A sobrecarga de métodos é uma técnica útil para tornar o código mais flexível e permitir a reutilização de nomes de métodos para operações semelhantes.
 */