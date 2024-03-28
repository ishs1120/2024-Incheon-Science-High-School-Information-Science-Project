package Pokemons;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println(" Can't fly");
    }
}
