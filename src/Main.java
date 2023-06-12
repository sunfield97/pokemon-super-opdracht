// 1. Maak een main-klasse aan in de src-map.
public class Main {
// 2. Maak vervolgens binnen de main-klasse een main-methode aan. Anders kun je de applicatie immers niet draaien!
    public static void main(String[] args) {
// 5. Instantieer in de main methode jouw 4 verschillende Pokèmon met de verschillende attributen.
        ElectricPokemon pokemon1 = new ElectricPokemon("Pikachu", 10, 100, 0);
        FirePokemon pokemon2 = new FirePokemon("Charizard", 50, 200, 0, 80);
        WaterPokemon pokemon3 = new WaterPokemon("Blastoise", 60, 250, 0, 90);
        GrassPokemon pokemon4 = new GrassPokemon("Venusaur", 55, 220, 0, 85);

// 6. Voer in de main methode verschillende methodes uit van verschillende Pokemons, uit zowel de subklassen als uit de super klasse.
        pokemon1.thunderPunch();
        pokemon2.inferno();
        pokemon3.hydroPump();
        pokemon4.solarBeam();
    }
}
// 3. Maak een Pokèmon Super klasse aan en zorg ervoor dat deze voldoet aan de gestelde randvoorwaarden
class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int xp;

    public Pokemon(String name, int level, int hp, int xp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
    }

    // Override
    public void speak() {
        System.out.println(name + " is speaking.");
    }

    // Getters and setters
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

    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
}


// 4. Maak de volgende subklassen aan en laat deze voldoen aan de gestelde randvoorwaarden.
// Subklasse: ElectricPokemon
class ElectricPokemon extends Pokemon {
    private int electricPower;
    public ElectricPokemon(String name, int level, int hp, int xp) {
        super(name, level, hp, xp);
        this.electricPower = electricPower;
    }
    public void thunderPunch() {
        System.out.println(getName() + " uses Thunder Punch!");
    }
    @Override
    public void speak() {
        System.out.println(getName() + " says, 'I'm electrifying!'");
    }

    // Getters and setters
    public int getElectricPower() {
        return electricPower;
    }
    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }

}


// Subklasse: FirePokemon
class FirePokemon extends Pokemon {
    private int firePower;

    public FirePokemon(String name, int level, int hp, int xp, int firePower) {
        super(name, level, hp, xp);
        this.firePower = firePower;
    }
    public void inferno() {
        System.out.println(getName() + " uses Inferno!");
    }
    @Override
    public void speak() {
        System.out.println(getName() + " says, 'I'm on fire!'");
    }

    // Getters and setters
    public int getFirePower() {
        return firePower;
    }
    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }


}


// Subklasse: WaterPokemon
class WaterPokemon extends Pokemon {
    private int waterPower;

    public WaterPokemon(String name, int level, int hp, int xp, int waterPower) {
        super(name, level, hp, xp);
        this.waterPower = waterPower;
    }
    public void hydroPump() {
        System.out.println(getName() + " uses Hydro Pump!");
    }
    @Override
    public void speak() {
        System.out.println(getName() + " says, 'I love water!'");
    }

    // Getters and setters
    public int getWaterPower() {
        return waterPower;
    }
    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }

}


// Subklasse: GrassPokemon
class GrassPokemon extends Pokemon {
    private int leafPower;

    public GrassPokemon(String name, int level, int hp, int xp, int leafPower) {
        super(name, level, hp, xp);
        this.leafPower = leafPower;
    }
    public void solarBeam() {
        System.out.println(getName() + " uses Solar Beam!");
    }
    @Override
    public void speak() {
        System.out.println(getName() + " says, 'I'm in tune with nature!'");
    }

    // Getters and setters
    public int getLeafPower() {
        return leafPower;
    }
    public void setLeafPower(int leafPower) {
        this.leafPower = leafPower;
    }
}