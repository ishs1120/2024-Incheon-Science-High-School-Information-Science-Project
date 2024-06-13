package Pokemons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Charizard extends Pokemon {



    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFly(new Wings());
        this.attackPoint = 55;
        this.speed = 100;
//        this.skills = new ArrayList<>(Arrays.asList("Claw","Dragon's Breath","FlareDrive"));
//        this.skillPoints = new ArrayList<>(Arrays.asList(10,20,60));
        this.skills = new HashMap<>();
        skills.put(1, "Claw");
        skills.put(2, "Dragon's Breath");
        skills.put(3, "FlareDrive");

        this.skillpoints =new HashMap<>();
        skillpoints.put("Claw", 10);
        skillpoints.put("Dragon's Breath", 20);
        skillpoints.put("FlareDrive", 60);

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
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint/10+ this.skillpoints.get(this.skills.get(s))));
        if (targetPokemon.getHp()<= 0)
            targetPokemon.setHp(0);
        System.out.println(this.getName()+ " attack "+targetPokemon.getName() +" with " +this.skills.get(s));
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);

    }


}
