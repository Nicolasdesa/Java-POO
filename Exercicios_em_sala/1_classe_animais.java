public class Animal{
    private String nome;
    private String tipo;
    private String som;
    private int idade;

    public Animal(String nome, String tipo, String som, int idade){
        this.nome = nome;
        this.tipo = tipo;
        this.som = som;
        this.idade = idade;

    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Clarice", "cão", "latido", 10);
        Animal animal2 = new Animal("Jade", "gato", "miado", 2);
        Animal animal3 = new Animal("Teresa", "cavalo", "relicho", 5);
        animal1.setSom("rosnado");
        System.out.println(animal1.getSom());
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSom(String som){
        this.som = som;
    }
    public String getSom(){
        return this.som;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void mostrarInfo(){
        System.out.println("nome:" + nome);
        System.out.println("tipo:" + tipo);
        System.out.println("som:" + som);
        System.out.println("idade:" + idade);
    }

}
