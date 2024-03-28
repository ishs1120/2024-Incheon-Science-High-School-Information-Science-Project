package Pokemons;
public class Pockemon{
    private String name;
    private int hp;

    public Pockemon() {
        this.name = "nameless";
        this.hp = 10;
        System.out.println("default constructor");
    }
    public Pockemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
        System.out.println("parameter construction");
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
}