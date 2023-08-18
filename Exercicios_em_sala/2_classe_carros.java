// Objetivo: criar e manipular uma classe Carro que represente as características e comportamentos
// básicos de um carro.

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano, boolean ligado){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar(){
        this.ligado = true;
        System.out.println("Carro ligado!");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("Carro desligado!");
    }
    public void mostrarInfo(){
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
        System.out.println("Ligado:" + ligado);
    }

    public static void main(String[] args){
        Carro carro1 = new Carro("Ford", "Fiesta", 2020, false);
        carro1.mostrarInfo();
        carro1.ligar();
        carro1.mostrarInfo();
        carro1.desligar();
        carro1.mostrarInfo();
    }
}
