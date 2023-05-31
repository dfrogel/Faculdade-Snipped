public class Pessoa {
    private int idade; // Variável privada para armazenar a idade da pessoa

    // Método getter para obter o valor da idade
    public int getIdade() {
        return idade;
    }

    // Método setter para definir o valor da idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

/* EXPLICANDO O CÓDIGO
 A classe Pessoa possui uma variável de instância privada chamada idade, que é usada para armazenar a idade da pessoa.
 O método getIdade() é um getter, que retorna o valor da idade armazenado na variável. 
 O método setIdade(int idade) é um setter, que permite definir o valor da idade recebendo um argumento do tipo int.

 Os getters e setters são comumente usados para garantir o encapsulamento dos dados. 
 Ao tornar a variável idade privada, ela não pode ser acessada diretamente de fora da classe. 
 Em vez disso, os métodos getters e setters são usados para obter e definir o valor da idade, 
 fornecendo um controle mais preciso sobre como os valores são manipulados.

 Por exemplo, se você deseja obter a idade de uma pessoa, pode chamar o método getIdade(). 
 Se você deseja definir a idade de uma pessoa, pode chamar o método setIdade(int idade) e passar o valor desejado 
 como argumento.

 Essa abordagem ajuda a garantir a consistência e integridade dos dados, 
 permitindo que você controle as operações de leitura e gravação dos valores da idade.

 */


