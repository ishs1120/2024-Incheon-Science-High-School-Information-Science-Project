package Pokemons;
public abstract class  Pockemon{
    private String name;
    private int hp;
    protected int attackPoint;

    protected String[] skills;
    protected Integer[] skillpoints;

    Flyable flyable; // has-a relationship



    public void setFly(Flyable flyable) {
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.print(this.getName());
        this.flyable.fly();
    }

    public Pockemon() {
        this.name = "nameless";
        this.hp = 10;
//        System.out.println("default constructor");
    }
    public Pockemon(String name, int hp) {
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
    public abstract void attack(Pockemon targetPokemon, int skill);


}