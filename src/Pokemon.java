public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String sound;
    private String type;

    public Pokemon(String name, int level, int hp, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.type = type;
    }

    public abstract void speaks();

    public abstract void specialAttack(Pokemon opponent);

    public abstract void dodgeAttack();

    public void eats() {
        System.out.println(this.name + " likes to eat chocolate");
    }


    //    Start getters and setters.........
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
