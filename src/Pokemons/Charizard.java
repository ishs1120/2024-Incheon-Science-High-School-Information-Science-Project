package Pokemons;

public class Charizard extends Pockemon {



    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFly(new Wings());
    }

    @Override
    public void attack() {
        System.out.println("Wide Area Sirocco");
    }

    @Override
    public void attack(Pockemon targetPokemon) {
        System.out.println(this.getName()+ " attack "+targetPokemon.getName() +" with Uppercase Letters");

    }


}
