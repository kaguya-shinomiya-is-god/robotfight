package main;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        robos robo1 = new robos(); //Primeiro robo
        robos robo2 = new robos(); //Segundo robo

        //Variaveis

        //Scanner

        Scanner input = new Scanner(System.in);

        // Configuração do primeiro robo:

        System.out.println("Bem vindo ao ULTRA ROBOT BATTLE!");
        System.out.println("Escolha o nome do seu robo: ");
        robo1.modelo = input.nextLine();
        System.out.println("Escolha o ataque de seu robo (em números!): ");
        robo1.ataque = input.nextInt();
        System.out.println("Escolha a durabilidade de seu robo (em números!): ");
        robo1.durabilidade = input.nextInt();

        robo1.status();

        //COnfiguração do segundo robo:

        System.out.println("Escolha o nome do seu segundo robo: ");
        robo2.modelo = input.nextLine();
        robo2.modelo = input.nextLine();
        System.out.println("Escolha o ataque de seu robo (em números!): ");
        robo2.ataque = input.nextInt();
        System.out.println("Escolha a durabilidade de seu robo (em números!): ");
        robo2.durabilidade = input.nextInt();

        robo2.status();

        //Inicialização da batalha

        batalha.battle(robo1,robo2);

    }
    
    
}