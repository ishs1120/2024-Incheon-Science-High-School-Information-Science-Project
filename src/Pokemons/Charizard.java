package Pokemons;

public class Charizard extends Pockemon {



    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFly(new Wings());
        this.attackPoint = 55;
        this.skills = new String[]{"Claw","Dragon's Breath","FlareDrive"};
        this.skillpoints = new Integer[]{10, 20, 60};

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
    public void attack(Pockemon targetPokemon, int s) {
        int originHp = targetPokemon.getHp();
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint/10+ this.skillpoints[s]));
        System.out.println(this.getName()+ " attack "+targetPokemon.getName() +" with " +this.skills[s]);
        System.out.println(targetPokemon.getName()+"'s health left : "+targetPokemon.getHp()+"/"+originHp);
    }


}
