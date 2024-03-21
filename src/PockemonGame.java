import Pokemons.Pockemon;

public class PockemonGame {
    public static void main(String[] args) {
        Pockemon p2 = new Pockemon("Squirtle", 70);  // parameter constructor

        Pockemon p1 = new Pockemon();
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        p1.setHp(50);
        p1.setName("Pikachu");
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        System.out.println(p2.getName() + "'s health is " + p2.getHp() + ".");
    }
}
