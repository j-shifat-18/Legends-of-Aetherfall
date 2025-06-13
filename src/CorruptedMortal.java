public class CorruptedMortal extends Character {
    

    public CorruptedMortal(String name) {
        super(name, 90, 90);
    }

    @Override
    public void attack(Character opponent) {
        int damage = 18;
        int powerLoss = 9;
        if (this.power >= powerLoss && isAlive()) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
           
        } else {
            System.out.println(this.name + " does not have enough power to attack!");
        }
    }

    @Override
    public void specialMove(Character opponent) {
        int damage = 20;
        int powerLoss = 25;
        if (this.power >= powerLoss) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used summonDarkness on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage and weakened next attack.");
        } else {
            System.out.println(this.name + " does not have enough power to use Special Move!");
        }
    }
}
