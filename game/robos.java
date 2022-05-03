package main;

public class robos{

    //Atributos gerais

    String modelo;
    int durabilidade;
    int ataque;
    boolean vivo = true;


    // Metodo para declaração
    public void status(){

        System.out.println();
        System.out.println("INFORMAÇÔES DO ROBO:");
        System.out.println("-------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Durabilidade: " + durabilidade);
        System.out.println("Ataque: " + ataque);
        System.out.println();
    }

}