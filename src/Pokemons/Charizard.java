package Pokemons;

import java.util.ArrayList;
import java.util.Arrays;

public class Charizard extends Pokemon {



    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFly(new Wings());
        this.attackPoint = 55;
        this.speed = 100;
        this.skills = new ArrayList<>(Arrays.asList("Claw","Dragon's Breath","FlareDrive"));
        this.skillPoints = new ArrayList<>(Arrays.asList(10,20,60));
        System.out.println("Rizarrrrrr");
    }

    public Charizard() {
        System.out.println("Rizarrrrrr");
    }

    @Override
    public void attack() {
        System.out.println("Wide Area Sirocco");
    }

    @Override
    public void attack(Pokemon targetPokemon, int s) {
        int originHp = targetPokemon.getHp();
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint/10+ this.skillPoints.get(s)));
        if (targetPokemon.getHp() <= 0)
            targetPokemon.setHp(0);
        System.out.println(this.getName()+ " attack "+targetPokemon.getName() +" with " +this.skills.get(s));
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);

    }


}
