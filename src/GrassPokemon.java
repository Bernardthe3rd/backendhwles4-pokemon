public class GrassPokemon extends Pokemon {
    private int attack;
    private int defense;
    private String special;

    public GrassPokemon(String name, int level, int hp, String type) {
        super(name, level, hp, type);
    }

    public void specialAttack() {
        setSpecial("Leafstorm");
        setAttack(30);
    }

    public void dodgeAttack() {
        setDefense(25);
        System.out.println("Pfieuw....");
    }

    @Override
    public void speaks() {
        System.out.println("Bulba Bulbasaur");
    }

    public void eats() {
        System.out.println(getName() + " likes a lot of grass!");
    }

    //    getters and setters.......
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
}
