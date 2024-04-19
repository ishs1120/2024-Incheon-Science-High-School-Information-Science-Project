package Pokemons;

import Pokemons.*;

import java.util.Random;
import java.util.Scanner;

public class PockemonGame {

    static Pockemon wildPokemon;

    public static void produceEnemyPokemon() {
        Random random = new Random();


        int select = random.nextInt(3);
        if (select == 0)
            wildPokemon = new Pikachu("Pikachu", 50);
        else if (select == 1)
            wildPokemon = new Squirtle("Squirtle", 55);
        else if (select == 2)
            wildPokemon = new Charizard("Charizard", 74);
        else
            wildPokemon = new Pikachu("Pikachu", 50);
        System.out.println("A wild " + wildPokemon.getName() + " has appeared");
    }

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your pokemon. 1) Pikachu 2) Squirtle 3) Charizard : ");
        int select = scanner.nextInt();
        Pockemon playerPokemon;
        if (select == 1)
            playerPokemon = new Pikachu("Pikachu", 50);
        else if (select == 2) {
            playerPokemon = new Squirtle("Squirtle", 65);
        } else if (select == 3) {
            playerPokemon = new Charizard("Charizard", 180);
        } else
            playerPokemon = new Pikachu("Pikachu", 50);

        System.out.println("You meet wild Pokemon");
        produceEnemyPokemon();

        while (true) {
            System.out.print("1) Battle 2) Run 3) Quit :");
            int menu = scanner.nextInt();
            if (menu == 3) {
                System.out.println("Exit the program...");
                break;
            } else if (menu == 1) {
                if (playerPokemon.speed > wildPokemon.speed) {
                    System.out.print("1) " + playerPokemon.skills.get(0) + " 2) " + playerPokemon.skills.get(1) + " 3) " + playerPokemon.skills.get(2) + " : ");
                    int skill = scanner.nextInt() - 1;
                    playerPokemon.attack(wildPokemon, skill);
                    if (wildPokemon.getHp() <= 0) {
                        System.out.println("Wild " + wildPokemon.getName() + " is knock down!");
                        wildPokemon = null;
                        produceEnemyPokemon();
                    } else {
                        System.out.println("=====================");
                        wildPokemon.attack(playerPokemon, skill);
                    }
                } else if (playerPokemon.speed == wildPokemon.speed) {
                    Random random1 = new Random();
                    int firstattack = random1.nextInt(2);
                    if (firstattack == 1) {
                        System.out.print("1) " + playerPokemon.skills.get(0) + " 2) " + playerPokemon.skills.get(1) + " 3) " + playerPokemon.skills.get(2) + " : ");
                        int skill = scanner.nextInt() - 1;
                        playerPokemon.attack(wildPokemon, skill);
                        if (wildPokemon.getHp() <= 0) {
                            System.out.println("Wild " + wildPokemon.getName() + " is knock down!");
                            wildPokemon = null;
                            produceEnemyPokemon();
                        } else {
                            System.out.println("=====================");
                            wildPokemon.attack(playerPokemon, skill);
                        }
                    } else {
                        System.out.print("1) " + playerPokemon.skills.get(0) + " 2) " + playerPokemon.skills.get(1) + " 3) " + playerPokemon.skills.get(2) + " : ");
                        int skill = scanner.nextInt() - 1;
                        wildPokemon.attack(playerPokemon, skill);
                        if (playerPokemon.getHp() <= 0) {
                            System.out.println("Player's " + playerPokemon.getName() + " is knock down!");
                            playerPokemon = null;
                            break;
                        } else {
                            System.out.println("=====================");
                            playerPokemon.attack(wildPokemon, skill);
                        }
                    }

                } else {
                    System.out.print("1) " + playerPokemon.skills.get(0) + " 2) " + playerPokemon.skills.get(1) + " 3) " + playerPokemon.skills.get(2) + " : ");
                    int skill = scanner.nextInt() - 1;
                    wildPokemon.attack(playerPokemon, skill);
                    if (playerPokemon.getHp() <= 0) {
                        System.out.println("Player's " + playerPokemon.getName() + " is knock down!");
                        playerPokemon = null;
                        break;
                    } else {
                        System.out.println("=====================");
                        playerPokemon.attack(wildPokemon, skill);
                    }


                }


            } else if (menu == 2) {
            System.out.println("Run away");
            playerPokemon.performFly();
            produceEnemyPokemon();
        }
        }
    }
}
