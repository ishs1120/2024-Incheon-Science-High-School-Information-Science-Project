package Pokemons;

public class Pikachu extends Pockemon{
    public Pikachu() {
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Electric");
    }
}
