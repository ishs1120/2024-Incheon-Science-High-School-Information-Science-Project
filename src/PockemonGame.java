import Pokemons.*;

public class PockemonGame {
    public static void main(String[] args) {

        Charizard c1 = new Charizard("Charizard", 250, new Wings());
        c1.setFly(new Wings());
        c1.performFly();


        Pikachu p1 = new Pikachu("Pikachu", 50, new NoFly());
        p1.performFly();
        Rocket rocket = new Rocket();
        p1.setFly(rocket);
        p1.performFly();
//        Squirtle s2 = new Squirtle("Squirtle", 70);
//        Charizard c1 = new Charizard("Charizard", 270);
//        c1.fly();
//        p1.info();
//        s2.info();
//        c1.info();
//        s2.attack(p1);
//        p1.attack(s2);
//        c1.attack();



    }
}
