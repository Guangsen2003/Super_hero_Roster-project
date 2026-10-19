
public class SuperheroRoster {
    public static void main(String[] args) {

        // 1. Declare and initialize arrays
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};

        // 2. Display all heroes
        System.out.println("=== Marvel Superhero Roster ===");

        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println();
        }

        // 3. Search for a hero
        System.out.println("=== Search Hero ===");
        searchHero(heroNames, abilities, powerLevels, "Iron Man");

        // 4. Calculate average power level
        System.out.println("\n=== Average Power Level ===");
        double average = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + average);

        // 5. Create an array of Superhero objects
        System.out.println("\n=== Superhero Objects ===");

        Superhero[] heroes = new Superhero[3];

        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = new Superhero(
                heroNames[i],
                abilities[i],
                powerLevels[i]
            );
        }

        // Display superhero objects
        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println();
        }
    }

    // Method: Search Hero
    public static void searchHero(String[] names, String[] abilities,
                                  int[] powerLevels, String target) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                return;
            }
        }

        System.out.println("Hero not found in the roster.");
    }

    // Method: Calculate Average Power
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;

        for (int i = 0; i < powerLevels.length; i++) {
            sum += powerLevels[i];
        }

        return (double) sum / powerLevels.length;
    }
}

// Superhero Class
class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    // Constructor
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    // Display Hero Method
    public void displayHero() {
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
    }
}

