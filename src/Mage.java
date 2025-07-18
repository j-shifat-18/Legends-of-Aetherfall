

public class Mage extends Character {

    private int manaRegenRate;

    public Mage(String name) {
        super(name, 80, 100);
        this.manaRegenRate = 5; // Regain 5 power per turn
    }

    @Override
    public void attack(Character opponent) {
        int damage = 20;
        int powerLoss = 10;

        if (this.power >= powerLoss) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        } else {
            System.out.println(this.name + " does not have enough power to attack!");
        }

        this.power += manaRegenRate;
    }

    @Override
    public void specialMove(Character opponent) {
        int damage = 40;
        int powerLoss = 30;

        if (this.power >= powerLoss) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used special on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        } else {
            System.out.println(this.name + " does not have enough power to attack!");
        }

        this.power += manaRegenRate;

    }
}
