package Pokemons;

import java.util.*;

public class Squirtle extends Pokemon {
    public Squirtle() {
        System.out.println("Crrrrrr");
    }

    public Squirtle(String name, int hp) {
        super(name, hp, new HashSet<>(Set.of(PokemonType.Water)));
        super.setFly(new NoFly());
        this.attackPoint = 10;
        this.speed = 43;

        this.skills = new HashMap<>();
        skills.put(1, "Body Slam");
        skills.put(2, "Water Cannon");
        skills.put(3, "Hydropump");

        this.skillpoints = new HashMap<>();
        skillpoints.put("Body Slam", 5);
        skillpoints.put("Water Cannon", 10);
        skillpoints.put("Hydropump", 30);

        this.skilltype = new HashMap<>();
        skilltype.put("Body Slam", PokemonType.Normal);
        skilltype.put("Water Cannon", PokemonType.Water);
        skilltype.put("Hydropump", PokemonType.Water);

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
    public void attack(Pokemon targetPokemon, int s) {
        String skill = this.skills.get(s);
        PokemonType skillType = this.skilltype.get(skill);

        double effectiveness = 1.0;
        for (PokemonType defenderType : targetPokemon.getTypes()) {
            effectiveness *= TypeEffectiveness.getEffectiveness(skillType, defenderType);
        }

        int damage = (int)((this.attackPoint / 10 + this.skillpoints.get(skill)) * effectiveness);
        targetPokemon.setHp(targetPokemon.getHp() - damage);
        if (targetPokemon.getHp() <= 0) {
            targetPokemon.setHp(0);
        }

        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with " + skill);
        if(effectiveness >=2.0){
            System.out.println("Skill was very effective!");
        } else if (effectiveness==1.0) {
            System.out.print("");
        } else if (effectiveness>0) {
            System.out.println("Skill was not very effective...");
        } else {
            System.out.println("Skill was not effective...");
        }
        System.out.println(targetPokemon.getName() + "'s health left: " + targetPokemon.getHp() + "/" + targetPokemon.getOriginalHp());
    }
}
