package Pokemons;

import java.util.*;

public class Charizard extends Pokemon {



    public Charizard(String name, int hp) {
        super(name, hp, new HashSet<>(Set.of(PokemonType.Fire, PokemonType.Flying)));
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

        this.skilltype = new HashMap<>();
        skilltype.put("Claw", PokemonType.Normal);
        skilltype.put("Dragon's Breath", PokemonType.Dragon);
        skilltype.put("FlareDrive", PokemonType.Fire);

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
