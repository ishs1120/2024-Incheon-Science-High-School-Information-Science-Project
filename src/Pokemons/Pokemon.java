package Pokemons;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Pokemon {
    private String name;
    private int hp;
    protected int attackPoint;

    protected int speed;

//    protected String[] skills;
//    protected Integer[] skillpoints;
//    protected List<String> skills;
//    protected List<Integer> skillPoints;
    Map<String, Integer> skills = new HashMap<>();

    Flyable flyable; // has-a relationship



    public void setFly(Flyable flyable) {
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.print(this.getName());
        this.flyable.fly();
    }

    public Pokemon() {
        this.name = "nameless";
        this.hp = 10;
//        System.out.println("default constructor");
    }
    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
//        System.out.println("parameter construction");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void info(){
        System.out.println("Name : " +getName());
        System.out.println("Hp : " + getHp());
    }

    public abstract void attack();
    public abstract void attack(Pokemon targetPokemon, int skill);


}