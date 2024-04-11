package Pokemons;

public class Squirtle extends Pockemon{
    public Squirtle() {
        System.out.println("Crrrrrr");
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFly(new NoFly());
        this.attackPoint = 10;
        this.skills = new String[]{"Body Slam","Water Cannon","Hydropump"};
        this.skillpoints = new Integer[]{5, 10, 30};

        System.out.println("Crrrrrrr");
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
    public void attack(Pockemon targetPokemon, int s) {
        int originHp = targetPokemon.getHp();
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint/10+ this.skillpoints[s]));
        System.out.println(this.getName() +" attack " + targetPokemon.getName()+ " with "+this.skills[s]);
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);
    }

}
