package Pokemons;

public class Pikachu extends Pockemon{
    public Pikachu() {
        System.out.println("Pika Pika");
    }



    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFly(new NoFly());
        this.attackPoint = 15;
        this.skills = new String[]{"Cheeks bulging","Electric Shock","100,000 Volt"};
        this.skillpoints = new Integer[]{5, 10, 30};
        System.out.println("Pika Pika");
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
    public void attack(Pockemon targetPokemon, int s) {
        int originHp = targetPokemon.getHp();
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint/10+ this.skillpoints[s]));
        System.out.println(this.getName()+" attack " + targetPokemon.getName()+ " with "+this.skills[s]);
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);
    }


}
