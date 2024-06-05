public class WaterPokemon extends Pokemon {
    private int attack;
    private int defense;
    private String special;

    public WaterPokemon(String name, int level, int hp, String type) {
        super(name, level, hp, type);
    }

    public void shoutTrainer(String nameTrainer) {
        setSpecial("Tsunami");
        System.out.println(nameTrainer + ": " + getName() + " do " + getSpecial());
    }

    public void specialAttack(Pokemon opponent) {
        setAttack(35);
        opponent.setHp(opponent.getHp() - getAttack());
    }

    public void dodgeAttack() {
        System.out.println("Almost got me!");
    }

    @Override
    public void speaks() {
        System.out.println("Squirtleeeeeeeee");
    }

    public void eats() {
        System.out.println(getName() + " only likes cold food");
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
