package Pokemons;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PokemonGame {

    static Pokemon wildPokemon;

    public static void produceEnemyPokemon() {
        Random random = new Random();


//        if (select == 0)
//            wildPokemon = new Pikachu("Pikachu", 50);
//        else if (select == 1)
//            wildPokemon = new Squirtle("Squirtle", 55);
//        else if (select == 2)
//            wildPokemon = new Charizard("Charizard", 74);
//        else
//            wildPokemon = new Pikachu("Pikachu", 50);
        wildPokemon = switch (random.nextInt()){
            case 0-> new Pikachu("Pikchu", 50);
            case 1-> new Squirtle("Squirtle", 65);
            case 2-> new Charizard("Charizard", 120);
            default -> new Pikachu("Pikchu", 50);
        };
        System.out.println("A wild " + wildPokemon.getName() + " has appeared");
    }

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your pokemon. 1) Pikachu 2) Squirtle 3) Charizard : ");
        int select = scanner.nextInt();
//        Pokemon playerPokemon;
//        if (select == 1)
//            playerPokemon = new Pikachu("Pikachu", 50);
//        else if (select == 2) {
//            playerPokemon = new Squirtle("Squirtle", 65);
//        } else if (select == 3) {
//            playerPokemon = new Charizard("Charizard", 180);
//        } else
//            playerPokemon = new Pikachu("Pikachu", 50);

        Pokemon playerPokemon = switch (select){
            case 1 -> new Pikachu("Pikchu", 50);
            case 2-> new Squirtle("Squirtle", 65);
            case 3 -> new Charizard("Charizard", 180);
            default -> new Pikachu("Pikchu", 50);
        };

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
//                    System.out.print("1) " + playerPokemon.skills.get(1) + " 2) " + playerPokemon.skills.get(2) + " 3) " + playerPokemon.skills.get(3) + " : ");
                    playerPokemon.getSkills().forEach((k, v) -> System.out.println(k + ")" + v));
                    int skill = scanner.nextInt();
//                    for(Map.Entry<Integer, String> mapskill : playerPokemon.getSkills().entryset())
//                        System.out.println(mapskill.getKey());
                    playerPokemon.attack(wildPokemon, skill);
                    if (wildPokemon.getHp() <= 0) {
                        System.out.println("Wild " + wildPokemon.getName() + " is knock down!");
                        wildPokemon = null;
                        produceEnemyPokemon();
                    } else {
                        System.out.println("=====================");
                        wildPokemon.attack(playerPokemon, random.nextInt(3)+1);
                        if (playerPokemon.getHp() <= 0) {
                            System.out.println("Player's " + playerPokemon.getName() + " is knock down!");
                            playerPokemon = null;
                            break;
                        }
                    }
                } else if (playerPokemon.speed == wildPokemon.speed) {
                    Random random1 = new Random();
                    int firstattack = random1.nextInt(2);
                    if (firstattack == 1) {
                        playerPokemon.getSkills().forEach((k, v) -> System.out.println(k + ")" + v));
                        int skill = scanner.nextInt();
                        playerPokemon.attack(wildPokemon, skill);
                        if (wildPokemon.getHp() <= 0) {
                            System.out.println("Wild " + wildPokemon.getName() + " is knock down!");
                            wildPokemon = null;
                            produceEnemyPokemon();
                        } else {
                            System.out.println("=====================");
                            wildPokemon.attack(playerPokemon, random.nextInt(3)+1);
                            if (playerPokemon.getHp() <= 0) {
                                System.out.println("Player's " + playerPokemon.getName() + " is knock down!");
                                playerPokemon = null;
                                break;
                            }
                        }
                    } else {
                        playerPokemon.getSkills().forEach((k, v) -> System.out.println(k + ")" + v));
                        int skill = scanner.nextInt();
                        wildPokemon.attack(playerPokemon, random.nextInt(3)+1);
                        if (playerPokemon.getHp() <= 0) {
                            System.out.println("Player's " + playerPokemon.getName() + " is knock down!");
                            playerPokemon = null;
                            break;
                        } else {
                            System.out.println("=====================");
                            playerPokemon.attack(wildPokemon, skill);
                            if (wildPokemon.getHp() <= 0) {
                                System.out.println("Wild " + wildPokemon.getName() + " is knock down!");
                                wildPokemon = null;
                                produceEnemyPokemon();
                            }
                        }
                    }

                } else {
                    playerPokemon.getSkills().forEach((k, v) -> System.out.println(k + ")" + v));
                    int skill = scanner.nextInt();
                    wildPokemon.attack(playerPokemon, random.nextInt(3)+1);
                    if (playerPokemon.getHp() <= 0) {
                        System.out.println("Player's " + playerPokemon.getName() + " is knock down!");
                        playerPokemon = null;
                        break;
                    } else {
                        System.out.println("=====================");
                        playerPokemon.attack(wildPokemon, skill);
                        if (wildPokemon.getHp() <= 0) {
                            System.out.println("Wild " + wildPokemon.getName() + " is knock down!");
                            wildPokemon = null;
                            produceEnemyPokemon();
                        }
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
