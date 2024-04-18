package Pokemons;

import java.util.ArrayList;
import java.util.Arrays;

public class Pikachu extends Pockemon{
    public Pikachu() {
        System.out.println("Pika Pika");
    }



    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFly(new NoFly());
        this.attackPoint = 15;
//        this.skills = new String[]{"Cheeks bulging","Electric Shock","100,000 Volt"};
//        this.skillpoints = new Integer[]{5, 10, 30};
        this.skills = new ArrayList<>(Arrays.asList("Cheeks bulging", "Electric shock", "100,000 Volts"));
//        this.skills.add("Cheeks bulging");
//        this.skills.add("Electric shock");
//        this.skills.add("100,000 Volts");

        this.skillPoints = new ArrayList<>(Arrays.asList(5, 10, 30));
//        this.skillPoints.add(5);
//        this.skillPoints.add(10);
//        this.skillPoints.add(30);
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
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint/10+ this.skillPoints.get(s)));
        if (targetPokemon.getHp() <= 0)
            targetPokemon.setHp(0);
        System.out.println(this.getName()+" attack " + targetPokemon.getName()+ " with "+this.skills.get(s));
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);

    }


}
