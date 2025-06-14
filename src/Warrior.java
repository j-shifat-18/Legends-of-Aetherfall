public class Warrior extends Character {

    private boolean shieldActive;

    public Warrior(String name) {
        super(name, 120, 100);
        this.shieldActive = false; // active when enemy has less health power than the warrior.

    }

    @Override
    public void attack(Character opponent) {
        int damage = 12;
        int powerLoss = 5;

        if (this.power >= powerLoss) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        }

        if (this.health > opponent.health)
            this.shieldActive = true;

    }

    @Override
    public void specialMove(Character opponent) {
        int damage = 35;
        int powerLoss = 35;

        if (this.power >= powerLoss && isAlive()) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        }

        if (this.health > opponent.health)
            this.shieldActive = true;

    }

}
