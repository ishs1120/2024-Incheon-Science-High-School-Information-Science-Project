package Pokemons;

import java.util.*;

public class Pikachu extends Pokemon {
    public Pikachu() {
        System.out.println("Pika Pika");
    }



    public Pikachu(String name, int hp) {
        super(name, hp, new HashSet<>(Set.of(PokemonType.Electric)));
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

        this.skilltype = new HashMap<>();
        skilltype.put("Cheeks bulging", PokemonType.Electric);
        skilltype.put("Electric shock", PokemonType.Electric);
        skilltype.put("100,000 Volts", PokemonType.Electric);

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
