import Pokemons.Pikachu;
import Pokemons.Pockemon;

public class PockemonGame {
    public static void main(String[] args) {
        Pikachu pika1 = new Pikachu("Pikachu", 50);
        Pikachu pika2 = new Pikachu();
        System.out.println(pika1.getName());
        System.out.println(pika1.getHp());

        Pockemon p2 = new Pockemon("Squirtle", 70);  // parameter constructor

        Pockemon p1 = new Pockemon();
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        p1.setHp(50);
        p1.setName("Pikachu");
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        System.out.println(p2.getName() + "'s health is " + p2.getHp() + ".");
    }
}
