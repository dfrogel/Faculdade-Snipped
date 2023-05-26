public static int div(int a, int b) {
    try {
        return a / b;
    } catch (ArithmeticException ex) {
        System.err.println("A divisão por zero é indefinida");
        throw ex; // Lança a exceção novamente após imprimir a mensagem de erro
    } finally {
        // Código a ser executado independentemente de ocorrer uma exceção ou não
        System.out.println("Execução do bloco finally");
    }
}