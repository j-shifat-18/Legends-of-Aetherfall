package Characters;

public class DarkOverlord extends Character {
    private boolean weakenNextAttack = false;

    public DarkOverlord(String name) {
        super(name, 200, 150);
    }

    @Override
    public void attack(Character opponent) {
        int damage = weakenNextAttack ? 12 : 25;
        int powerLoss = 17;
        if (this.power >= powerLoss) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
            weakenNextAttack = false;
        } else {
            System.out.println(this.name + " does not have enough power to attack!");
        }
    }

    @Override
    public void specialMove(Character opponent) {
        int damage = 50;
        int powerLoss = 40;
        if (this.power >= powerLoss) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            weakenNextAttack = true;
            System.out.println(this.name + " used summonDarkness on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage and weakened next attack.");
        } else {
            System.out.println(this.name + " does not have enough power to use Special Move!");
        }
    }
}

