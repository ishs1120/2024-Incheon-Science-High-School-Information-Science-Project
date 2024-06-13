package Pokemons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pikachu extends Pokemon {
    public Pikachu() {
        System.out.println("Pika Pika");
    }



    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFly(new NoFly());
        this.attackPoint = 15;
        this.speed = 90;
//        this.skills = new ArrayList<>(Arrays.asList("Cheeks bulging", "Electric shock", "100,000 Volts"));
//        this.skillPoints = new ArrayList<>(Arrays.asList(5, 10, 30));
        this.skills = new HashMap<>();
        skills.put(1, "Cheeks bulging");
        skills.put(2, "Electric shock");
        skills.put(3, "100,000 Volts");

        this.skillpoints =new HashMap<>();
        skillpoints.put("Cheeks bulging", 5);
        skillpoints.put("Electric shock", 10);
        skillpoints.put("100,000 Volts", 30);

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
    public void attack(Pokemon targetPokemon, int s) {
        int originHp = targetPokemon.getHp();
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint/10+ this.skillpoints.get(this.skills.get(s))));
        if (targetPokemon.getHp() <= 0)
            targetPokemon.setHp(0);
        System.out.println(this.getName()+" attack " + targetPokemon.getName()+ " with "+this.skills.get(s));
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);

    }


}
