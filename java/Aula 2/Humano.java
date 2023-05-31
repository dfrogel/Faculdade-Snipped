public class Humano {
    String sexo; // Variável para armazenar o sexo do humano
    String corPele; // Variável para armazenar a cor da pele do humano
    int peso; // Variável para armazenar o peso do humano

    // Método 1: Comer
    public void comer() {
        System.out.println("Estou com fome!");
    }

    // Método 2: Sono
    public void sono() {
        System.out.println("Estou com sono!");
    }

    // Método 3: Estudar
    public void estudar() {
        System.out.println("Vou estudar!");
    }

    // Exemplo de método privado. Este método não pode ser acessado fora da classe.
    private void correr() {
        System.out.println("Necessário correr para exercitar");
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Humano
        Humano pessoa = new Humano();

        // Acessando os métodos da classe Humano
        pessoa.comer();
        pessoa.sono();
        pessoa.estudar();
        pessoa.correr(); // Esse método é privado e não pode ser acessado fora da classe
    }

    // Getters e setters para as variáveis sexo, corPele e peso
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

/* EXPLICANDO O CÓDIGO
 O código define uma classe chamada Humano, que possui três variáveis de instância: 
 sexo, corPele e peso, para representar características de um ser humano. 
 
 Em seguida, são declarados três métodos: comer(), sono() e estudar(), 
 que imprimem mensagens relacionadas a essas atividades.

 Além disso, há um exemplo de método privado correr(), que imprime uma mensagem relacionada 
 à necessidade de correr para exercitar. 
 Métodos privados são acessíveis apenas dentro da própria classe e não podem ser chamados fora dela.

 O método main() é o ponto de entrada do programa. 
 Nele, uma instância da classe Humano é criada e os métodos comer(), sono(), estudar() e correr() 
 são chamados para essa instância.

 Por fim, a classe também possui getters e setters para acessar e modificar os valores das variáveis sexo, 
 corPele e peso.
 */


