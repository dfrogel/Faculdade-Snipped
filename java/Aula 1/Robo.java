public class Robo {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Robo obj1 = new Robo();
        obj1.setName("R.801");
        obj1.setColor("azul");

        System.out.println("O meu nome é " + obj1.getName());
        System.out.println("E minha cor é " + obj1.getColor());
    }
}

/* EXPLICANDO O CÓDIGO
 Neste código, temos a classe Robo que representa um robô. 
 Ela possui dois atributos: name (nome) e color (cor), ambos declarados como privados (private). 
 Isso significa que esses atributos só podem ser acessados diretamente dentro da própria classe.

 Em seguida, temos os métodos getName() e setName() para obter e definir o valor do atributo name, respectivamente. 
 Da mesma forma, temos os métodos getColor() e setColor() para obter e definir o valor do atributo color.

 No método main(), criamos uma instância da classe Robo chamada obj1 e, em seguida, usamos os métodos setName() e setColor() para definir os valores dos atributos name e color do robô. 
 No exemplo, definimos o nome como "R.801" e a cor como "azul".

 Por fim, utilizamos o System.out.println() para exibir no console as informações do robô, usando os métodos getName() e getColor() para obter esses valores.

 Dessa forma, o programa criará um objeto Robo, definirá seu nome e cor, e exibirá essas informações no console.

 Essa abordagem permite que você crie vários robôs diferentes, cada um com seu próprio nome e cor, mantendo os dados separados entre as instâncias da classe Robo.
 */