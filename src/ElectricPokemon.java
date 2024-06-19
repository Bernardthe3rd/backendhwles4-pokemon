public class ElectricPokemon extends Pokemon {
    private int attack;
    private int defense;
    private String special;

    public ElectricPokemon(String name, int level, int hp, String type) {
        super(name, level, hp, type);
    }

    public void specialAttack(Pokemon opponent) {
        setSpecial("ThunderBolt");
        setAttack(40);
    }

    public void dodgeAttack() {
        setDefense(35);
        System.out.println("To fast for you!");
    }

    @Override
    public void speaks() {
        System.out.println("Pika Pika");
    }

    public void eats() {
        System.out.println(getName() + " likes to have some powerfood");
    }

    //    getters and setters....
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
