
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // === HERO SELECTION ===
        System.out.println("Choose a character: 1. Mage  2. Archer  3. Warrior");
        System.out.print("> ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        Character hero;

        String heroName = "";

        switch (choice) {
            case 1:
                heroName = "Mage";
                System.out.println("You've chosen Mage");
                System.out.print("Enter your mage name: ");
                String mageName = scanner.nextLine();
                hero = new Mage(mageName);
                break;
            case 2:
                heroName = "Archer";
                System.out.println("You've chosen Archer");
                System.out.print("Enter your archer name: ");
                String archerName = scanner.nextLine();
                hero = new Archer(archerName);
                break;
            case 3:
                heroName = "Warrior";
                System.out.println("You've chosen Warrior");
                System.out.print("Enter your warrior name: ");
                String warriorName = scanner.nextLine();
                hero = new Warrior(warriorName);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Mage.");
                hero = new Mage("DefaultMage");
        }

        // === VILLAIN SELECTION ===
        System.out.println("Choose a villain to fight against:");
        System.out.println("1. Dark Overlord");
        System.out.println("2. Regional Warlord");
        System.out.println("3. Corrupted Mortal");
        System.out.print("> ");
        int villainChoice = scanner.nextInt();
        scanner.nextLine();

        Character villain;

        switch (villainChoice) {
            case 1:
                villain = new DarkOverlord("DarkOverlord");
                break;
            case 2:
                villain = new RegionalWarlord("RegionalWarlord");
                break;
            case 3:
                villain = new CorruptedMortal("CorruptedMortal");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Dark Overlord.");
                villain = new DarkOverlord("DarkOverlord");
        }

        System.out.println(hero.getName() + " the " + heroName + " enters the world of Aetherfall!");
        System.out.println(villain.getName() + " rises to spread chaos!");
        System.out.println("Battle Start!");

        // === GAME LOOP ===
        while (hero.isAlive() && villain.isAlive()) {
            System.out.print("> ");
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "attack":
                    hero.attack(villain);
                    break;
                case "special":
                    hero.specialMove(villain);
                    break;
                default:
                    System.out.println("Invalid move. Type 'attack' or 'special'");
                    continue;
            }

            displayStats(hero, villain);

            int villainMove = rand.nextInt(2);
            // System.out.println(villainMove);

            // Enemy turn
            if (villain.isAlive()) {
                System.out.println("Enemy Attacks");
                if (villainMove == 0) {
                    villain.attack(hero);
                } else if (villainMove == 1) {
                    villain.specialMove(hero);
                }
                displayStats(hero, villain);
            }
        }

        // === RESULT ===
        System.out.println("---------Results -----------------");
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " wins the battle!");
            System.out.println(villain.getName() + " has been defeated!");
        } else {
            System.out.println(villain.getName() + " wins the battle!");
            System.out.println(hero.getName() + " has been defeated!");
        }

        scanner.close();
    }

    public static void displayStats(Character hero, Character villain) {
        System.out.println("-------- Game Stats --------------");
        hero.displayStats();
        villain.displayStats();
    }
}
