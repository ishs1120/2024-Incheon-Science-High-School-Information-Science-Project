import Pokemons.Pikachu;
import Pokemons.Pockemon;
import Pokemons.Squirtle;

public class PockemonGame {
    public static void main(String[] args) {


        Pikachu p1 = new Pikachu("Pikachu", 50);
        Squirtle s2 = new Squirtle("Squirtle", 70);
        p1.info();
        s2.info();
        s2.attack(p1);
        p1.attack(s2);



    }
}
