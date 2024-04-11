package Pokemons;

import java.util.ArrayList;

public class Squirtle extends Pockemon{
    public Squirtle() {
        System.out.println("Crrrrrr");
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFly(new NoFly());
        this.attackPoint = 10;
//        this.skills = new String[]{"Body Slam","Water Cannon","Hydropump"};
//        this.skillpoints = new Integer[]{5, 10, 30};
        this.skills = new ArrayList<>();
        this.skills.add("Body Slam");
        this.skills.add("Water Cannon");
        this.skills.add("Hydropump");

        this.skillPoints = new ArrayList<>();
        this.skillPoints.add(5);
        this.skillPoints.add(10);
        this.skillPoints.add(30);



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
        System.out.println(this.getName() +" attack " + targetPokemon.getName()+ " with "+this.skills.get(s));
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);
    }

}
