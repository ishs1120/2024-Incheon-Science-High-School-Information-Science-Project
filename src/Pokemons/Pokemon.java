package Pokemons;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public abstract class Pokemon {
    private String name;
    private Set<PokemonType> types;
    private int hp;
    private int originalHp;
    protected int attackPoint;

    protected int speed;
    protected enum PokemonType{
        Fire,
        Grass,
        Water,
        Normal,
        Fighting,
        Flying,
        Acid,
        Ground,
        Rock,
        Bug,
        Ghost,
        Steel,
        Electric,
        Psychic,
        Ice,
        Dragon,
        Dark,
        Fairy

    }

    public class TypeEffectiveness {
        public static final double[][] TYPE_EFFECTIVENESS = {
                //              Fire,  Grass, Water, Normal, Fighting, Flying, Acid,  Ground, Rock,  Bug,   Ghost, Steel, Electric, Psychic, Ice,   Dragon, Dark,  Fairy
                /* Fire */     { 0.5,  2.0,   0.5,   1.0,    1.0,     1.0,    1.0,   1.0,    2.0,   2.0,   1.0,   2.0,   1.0,     1.0,     2.0,   0.5,    1.0,   1.0 },
                /* Grass */    { 0.5,  0.5,   2.0,   1.0,    1.0,     0.5,    0.5,   2.0,    2.0,   0.5,   1.0,   0.5,   1.0,     1.0,     1.0,   0.5,    1.0,   1.0 },
                /* Water */    { 2.0,  0.5,   0.5,   1.0,    1.0,     1.0,    1.0,   2.0,    1.0,   1.0,   1.0,   1.0,   1.0,     1.0,     1.0,   0.5,    1.0,   1.0 },
                /* Normal */   { 1.0,  1.0,   1.0,   1.0,    1.0,     1.0,    1.0,   1.0,    0.5,   1.0,   0.0,   0.5,   1.0,     1.0,     1.0,   1.0,    1.0,   1.0 },
                /* Fighting */ { 1.0,  1.0,   1.0,   2.0,    1.0,     0.5,    1.0,   1.0,    2.0,   0.5,   0.0,   2.0,   1.0,     0.5,     2.0,   1.0,    1.0,   0.5 },
                /* Flying */   { 1.0,  2.0,   1.0,   1.0,    2.0,     1.0,    1.0,   1.0,    0.5,   2.0,   1.0,   0.5,   0.5,     1.0,     1.0,   1.0,    1.0,   1.0 },
                /* Acid */     { 1.0,  2.0,   1.0,   1.0,    1.0,     1.0,    0.5,   0.5,    0.5,   1.0,   1.0,   0.0,   1.0,     1.0,     1.0,   1.0,    1.0,   2.0 },
                /* Ground */   { 2.0,  0.5,   1.0,   1.0,    1.0,     0.0,    2.0,   1.0,    2.0,   0.5,   1.0,   2.0,   2.0,     1.0,     2.0,   1.0,    1.0,   1.0 },
                /* Rock */     { 0.5,  1.0,   2.0,   1.0,    0.5,     2.0,    1.0,   0.5,    1.0,   2.0,   1.0,   0.5,   1.0,     1.0,     2.0,   1.0,    1.0,   1.0 },
                /* Bug */      { 0.5,  0.5,   1.0,   1.0,    0.5,     0.5,    1.0,   1.0,    1.0,   1.0,   0.5,   0.5,   1.0,     2.0,     1.0,   1.0,    2.0,   0.5 },
                /* Ghost */    { 1.0,  1.0,   1.0,   0.0,    1.0,     1.0,    1.0,   1.0,    1.0,   1.0,   2.0,   1.0,   1.0,     1.0,     1.0,   1.0,    0.5,   1.0 },
                /* Steel */    { 0.5,  1.0,   1.0,   1.0,    1.0,     1.0,    1.0,   1.0,    2.0,   1.0,   1.0,   0.5,   0.5,     1.0,     2.0,   1.0,    1.0,   2.0 },
                /* Electric */ { 1.0,  1.0,   2.0,   1.0,    1.0,     2.0,    1.0,   0.0,    1.0,   1.0,   1.0,   1.0,   0.5,     1.0,     1.0,   1.0,    1.0,   1.0 },
                /* Psychic */  { 1.0,  1.0,   1.0,   1.0,    2.0,     1.0,    1.0,   1.0,    1.0,   1.0,   1.0,   1.0,   1.0,     0.5,     1.0,   1.0,    0.0,   1.0 },
                /* Ice */      { 0.5,  2.0,   1.0,   1.0,    1.0,     2.0,    1.0,   1.0,    1.0,   1.0,   1.0,   0.5,   1.0,     1.0,     0.5,   2.0,    1.0,   1.0 },
                /* Dragon */   { 1.0,  1.0,   1.0,   1.0,    1.0,     1.0,    1.0,   1.0,    1.0,   1.0,   1.0,   1.0,   1.0,     1.0,     1.0,   2.0,    1.0,   0.0 },
                /* Dark */     { 1.0,  1.0,   1.0,   1.0,    0.5,     1.0,    1.0,   1.0,    1.0,   1.0,   2.0,   1.0,   1.0,     2.0,     1.0,   1.0,    0.5,   0.5 },
                /* Fairy */    { 0.5,  1.0,   1.0,   1.0,    2.0,     1.0,    1.0,   1.0,    1.0,   1.0,   1.0,   1.0,   1.0,     1.0,     1.0,   2.0,    2.0,   1.0 },
        };

        public static double getEffectiveness(PokemonType attackType, PokemonType defendType) {
            return TYPE_EFFECTIVENESS[attackType.ordinal()][defendType.ordinal()];
        }
    }



    //    protected String[] skills;
//    protected Integer[] skillpoints;
//    protected List<String> skills;
//    protected List<Integer> skillPoints;
    Map<Integer, String> skills = new HashMap<>();

    Map<String, Integer> skillpoints = new HashMap<>();
    Map<String, PokemonType> skilltype = new HashMap<>();

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
    public Pokemon(String name, int hp, Set<PokemonType> types) {
        this.name = name;
        this.hp = hp;
        this.originalHp = hp;
        this.types = types;
//        System.out.println("parameter construction");
    }


    public Set<PokemonType> getTypes() {
        return types;
    }

    public void addType(PokemonType type) {
        this.types.add(type);
    }
    public void removeType(PokemonType type) {
        this.types.remove(type);
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
    public int getOriginalHp() { // 원래 체력을 반환하는 메서드 추가
        return originalHp;
    }

    public void info(){
        System.out.println("Name : " +getName());
        System.out.println("Hp : " + getHp());
    }

    public abstract void attack();
    public abstract void attack(Pokemon targetPokemon, int skill);





    public Map<Integer, String> getSkills() { return skills;}
}