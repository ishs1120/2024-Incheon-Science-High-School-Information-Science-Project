package Pokemons;

public class Squirtle extends Pockemon{
    public Squirtle() {
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Water");
    }
}
