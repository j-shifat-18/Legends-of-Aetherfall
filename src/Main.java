
import Characters.Character;
import Characters.DarkOverlord;
import Characters.Mage;

public class Main {
    public static void main(String[] args) {
        Character mage = new Mage("Elara");
        Character villain = new DarkOverlord("Kael'tharon");

        System.out.println("Battle Start!");
        mage.attack(villain);
        villain.attack(mage);
        mage.specialMove(villain);
        villain.specialMove(mage);

        mage.displayStats();
        villain.displayStats();
    }
}
