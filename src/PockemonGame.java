import Pokemons.Charizard;
import Pokemons.Pikachu;
import Pokemons.Pockemon;
import Pokemons.Squirtle;

public class PockemonGame {
    public static void main(String[] args) {


        Pikachu p1 = new Pikachu("Pikachu", 50);
        Squirtle s2 = new Squirtle("Squirtle", 70);
        Charizard c1 = new Charizard("Charizard", 270);
        c1.fly();
        p1.info();
        s2.info();
        c1.info();
        s2.attack(p1);
        p1.attack(s2);
        c1.attack();



    }
}
