public class FirePokemon extends Pokemon {
    private int attack;
    private int defense;
    private String special;

    public FirePokemon(String name, int level, int hp, String type) {
        super(name, level, hp, type);
    }

    public void specialAttack(Pokemon opponent) {
        setAttack(30);
        opponent.setHp(opponent.getHp() - getAttack());
    }

    public void shoutTrainer(String nameTrainer) {
        setSpecial("Fireball");
        System.out.println(nameTrainer + ": " + getName() + " do " + getSpecial());
    }

    public void dodgeAttack() {
        System.out.println("You missed!");
    }

    @Override
    public void speaks() {
        System.out.println("CharChar");
    }

    public void eats() {
        System.out.println(getName() + " only likes warm food");
    }


    //    getters and setters type pokemon
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
