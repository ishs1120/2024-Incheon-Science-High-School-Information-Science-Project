package Pokemons;

import java.util.ArrayList;
import java.util.Arrays;

public class Squirtle extends Pockemon{
    public Squirtle() {
        System.out.println("Crrrrrr");
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFly(new NoFly());
        this.attackPoint = 10;
        this.speed = 43;
        this.skills = new ArrayList<>(Arrays.asList("Body Slam","Water Cannon","Hydropump"));
        this.skillPoints = new ArrayList<>(Arrays.asList(5,10,30));


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
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint/10+ this.skillPoints.get(s)));
        if (targetPokemon.getHp() <= 0)
            targetPokemon.setHp(0);
        System.out.println(this.getName() +" attack " + targetPokemon.getName()+ " with "+this.skills.get(s));
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);
    }

}
