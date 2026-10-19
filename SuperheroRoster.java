
public class SuperheroRoster {
    public static void main(String[] args) {

       
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};

       
        System.out.println("=== Marvel Superhero Roster ===");

        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println();
        }

      
        System.out.println("=== Search Hero ===");
        searchHero(heroNames, abilities, powerLevels, "Iron Man");

       
        System.out.println("\n=== Average Power Level ===");
        double average = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + average);

      
        System.out.println("\n=== Superhero Objects ===");

        Superhero[] heroes = new Superhero[3];

        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = new Superhero(
                heroNames[i],
                abilities[i],
                powerLevels[i]
            );
        }

       
        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println();
        }
    }

  
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

   
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;

        for (int i = 0; i < powerLevels.length; i++) {
            sum += powerLevels[i];
        }

        return (double) sum / powerLevels.length;
    }
}


class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

  
    public void displayHero() {
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
    }
}

