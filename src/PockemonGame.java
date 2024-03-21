class Pockemon{
    private String name;
    private int hp;

    public Pockemon(String name, int hp) {
        name = name;
        hp = hp;
        System.out.println("parameter construction");
    }

    public Pockemon() {
        System.out.println("default construction");
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
}

public class PockemonGame {
    public static void main(String[] args) {
        Pockemon p2 = new Pockemon("Squirtle", 70);  // parameter constructor

        Pockemon p1 = new Pockemon();  // default consturctor
        //p1.hp = 50;  // hp has private access in Pokemon
        p1.setHp(50);
        p1.setName("Pikachu");
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        System.out.println(p2.getName() + "'s health is " + p2.getHp() + ".");
    }
}
