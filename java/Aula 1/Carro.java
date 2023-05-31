public class Carro {
    private final String marca;
    private final String modelo;
    private final int ano;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método getter para a marca do carro
    public String getMarca() {
        return marca;
    }

    // Método getter para o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Método getter para o ano do carro
    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        // Criando um objeto carro com os valores fornecidos
        Carro ford = new Carro("Ford", "Mustang", 2022);

        // Exibindo informações do carro
        System.out.println("Marca: " + ford.getMarca());
        System.out.println("Modelo: " + ford.getModelo());
        System.out.println("Ano: " + ford.getAno());
    }
}

/* EXPLICAÇÃO DO CÓDIGO
 * 
 * As linhas 1 a 5 definem a classe Carro.
 * As linhas 2 a 4, são declarados os atributos privados marca, modelo e ano, que representam as características de um carro.
 * A linha 7, começa a definição do construtor da classe Carro. O construtor recebe três parâmetros: marca, modelo e ano. 
 * O this é utilizado para fazer referência aos atributos da instância atual e atribuir os valores recebidos aos atributos correspondentes.
 * Nas linhas 11 a 15, são declarados os métodos getter (getMarca(), getModelo() e getAno()) que permitem acessar os valores dos atributos privados.
 * Na linha 17, começa o método main, que é o ponto de entrada do programa.
 * Na linha 20, um objeto ford da classe Carro é criado utilizando o construtor da classe. Ele recebe os valores "Ford", "Mustang" e 2022 como argumentos.
 * Nas linhas 23 a 25, as informações do carro são exibidas utilizando os métodos getter e o comando System.out.println().
 */