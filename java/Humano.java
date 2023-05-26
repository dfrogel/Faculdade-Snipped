public class Humano {
    String sexo;
    String corPele;
    int peso;

    //Método 1
    public void comer() {
        System.out.println("Estou com fome!");
    }
     //Método 2
     public void sono() {
        System.out.println("Estou com sono!");
    }
     //Método 3
     public void estudar() {
        System.out.println("Vou estudar!");
    }
    // Exemplo de método privado. Este não pode ser herdado
    private void correr() {
        System.out.println("Necessário correr para exercitar");
    }
}
