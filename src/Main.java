
public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Chardy", 20, 100, "Fire");
        WaterPokemon squirtle = new WaterPokemon("Squitry", 19, 100, "Water");
        GrassPokemon bulbasaur = new GrassPokemon("Bulba", 18, 100, "Grass");
        ElectricPokemon pikachu = new ElectricPokemon("Pika", 28, 100, "Electricity");

        bulbasaur.speaks();
        pikachu.speaks();
        System.out.println();

        System.out.println("HP of squirtle: " + squirtle.getHp());
        System.out.println("HP of charmander: " + charmander.getHp());
        charmander.shoutTrainer("Ash");
        charmander.speaks();
        charmander.specialAttack(squirtle);
        System.out.println("HP of squirtle: " + squirtle.getHp());
        System.out.println();
        
        squirtle.shoutTrainer("Brock");
        squirtle.speaks();
        squirtle.specialAttack(charmander);
        System.out.println("HP of chardy: " + charmander.getHp());

    }
}