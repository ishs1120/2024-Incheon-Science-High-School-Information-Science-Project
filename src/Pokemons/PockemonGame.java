package Pokemons;

import Pokemons.*;

import java.util.Random;
import java.util.Scanner;

public class PockemonGame {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your pokemon. 1) Pikachu 2) Squirtle 3) Charizard : ");
        int select = scanner.nextInt();
        Pockemon playerPokemon, wildPokemon;
        if(select == 1)
            playerPokemon = new Pikachu("Pikachu", 50);
        else if (select == 2) {
            playerPokemon = new Squirtle("Squirtle", 65);
        }
        else if (select == 3) {
            playerPokemon = new Charizard("Charizard", 180);
        }
        else
            playerPokemon = new Pikachu("Pikachu", 50);

        System.out.println("You meet wild Pokemon");



        select = random.nextInt(3);
        if(select == 1)
            wildPokemon = new Pikachu("Pikachu", 50);
        else if(select == 2) {
            wildPokemon = new Squirtle("Squirtle", 65);
        }else if(select == 3) {
            wildPokemon = new Charizard("Charizard", 180);
        }
        else{
            wildPokemon = new Pikachu("Pikachu", 50);
        }
        System.out.println("A wild "+ wildPokemon.getName() +" has appeared");

        //Random random = new Random();
        //random.setSeed(31);

        //int randomValue2 = random.nextInt(100)+1;

        while(true){
            System.out.print("1) Battle 2) Run 3) Quit :");
            int menu = scanner.nextInt();
            if (menu == 3){
                System.out.println("Exit the program...");
                break;
            } else if (menu ==1) {
                System.out.print("1) "+ playerPokemon.skills.get(0)+" 2) "+playerPokemon.skills.get(1)+" 3) "+playerPokemon.skills.get(2)+" : ");
                int skill = scanner.nextInt()-1;
                playerPokemon.attack(wildPokemon, skill);
                //wildPokemon.attack(playerPokemon, skill);
            } else if (menu == 2) {
                System.out.println("Run away");
                break;
            }


        }



    }
}
