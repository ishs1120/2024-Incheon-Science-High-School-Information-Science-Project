package Pokemons;

public class Pikachu extends Pockemon{
    public Pikachu() {
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
    }

    public Pikachu(String name, int hp, NoFly noFly) {
        super(name, hp);
        super.setFly(noFly);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Electric");
    }

    @Override
    public void attack() {
        System.out.println("Lightning Flash");
    }

    @Override
    public void attack(Pockemon targetPokemon) {
        System.out.println(this.getName()+" attack " + targetPokemon.getName()+ " with Lightning Flash");
    }
}
