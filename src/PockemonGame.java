import Pokemons.Pikachu;
import Pokemons.Pockemon;
import Pokemons.Squirtle;

public class PockemonGame {
    public static void main(String[] args) {

//        Pockemon p1 = new Pockemon();
//        p1.info();

        Pikachu pika1 = new Pikachu("Pikachu", 50);
        Pikachu pika2 = new Pikachu();
        System.out.println(pika1.getName());
        System.out.println(pika1.getHp());
        Squirtle s1 = new Squirtle();
        Squirtle s2 = new Squirtle("Squirtle", 70);
        System.out.println(s2.getName());
        System.out.println(s2.getHp());
        s1.setName("Squirtle");
        s1.setHp(65);
        System.out.println(s1.getName());
        pika1.info();

        //Pockemon p2 = new Pockemon("Squirtle", 70);

//        Pockemon p1 = new Pockemon();
//        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
//        p1.setHp(50);
//        p1.setName("Pikachu");
//        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
//        System.out.println(p2.getName() + "'s health is " + p2.getHp() + ".");
    }
}
