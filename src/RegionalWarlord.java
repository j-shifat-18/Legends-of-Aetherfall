public class RegionalWarlord extends Character {
    private boolean stopAttackFor20Sec = false;

    public RegionalWarlord(String name) {
        super(name, 130, 110);
    }

    @Override
    public void attack(Character opponent) {
        int damage = 20;
        int powerLoss = 10;
        if (this.power >= powerLoss && isAlive()) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
            stopAttackFor20Sec = false;
        } else {
            System.out.println(this.name + " does not have enough power to attack!");
        }
    }

    @Override
    public void specialMove(Character opponent) {
        int damage = 35;
        int powerLoss = 30;
        if (this.power >= powerLoss) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            stopAttackFor20Sec = true;
            System.out.println(this.name + " used summonDarkness on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage and weakened next attack.");
        } else {
            System.out.println(this.name + " does not have enough power to use Special Move!");
        }
    }
}
