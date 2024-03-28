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

    @Override
    public void attack() {
        System.out.println("Wide Area Water Cannon");
    }

    @Override
    public void attack(Pockemon targetPokemon) {
        System.out.println("Attack " + targetPokemon.getName()+ " with Water Cannon ");
    }
}
