package main;

import java.util.Scanner;

public class batalha {

    static String useless;

    static Scanner input = new Scanner(System.in);

    //Execução batalha

    public static void battle(robos robo1,robos robo2){

        //Loop dos ataques
        while(robo1.vivo == false || robo2.vivo == false){
        atacar(robo1.ataque,robo2.durabilidade);
        System.out.println("Aperte ENTER para prosseguir:");
        useless = input.nextLine();
        atacar(robo2.ataque,robo1.durabilidade);
        useless = input.nextLine();

        // Verificação da durabilidade
        
        if(robo1.durabilidade <= 0)
        verification(robo1.vivo);
        if(robo2.durabilidade <= 0)
        verification(robo2.vivo);

        }

        // Verificação do vencedor
        if(robo1.vivo){
            System.out.println("O robo " + robo1.modelo + " ganhou!!!!!");
        }else if(robo2.vivo){
            System.out.println("O robo " + robo2.modelo + " ganhou!!!!!");
        }
    }

    
    //Metodo da verificação da durabilidade
    private static boolean verification(boolean b) {
        return b = false;
    }


    //Metodo de ataque
    public static void atacar(int a,int b){
        boolean sucess = false;
        rand(sucess);
        
        if(sucess == false){
            System.out.println("Ataque falhou!");
        }else if(sucess == true){
            b -= a; 
            System.out.println("Ataque foi um sucesso!");
        }

        System.out.println("HP do robo adversario: " + b);

    }


    //Gerador de booleana aleatoria
    public static boolean rand(boolean s){
        double random = Math.random();

        if(random <= 4){
            s = false;
        }else if(random >= 5){
            s = true;
        }
        return s;

    }
    
}
