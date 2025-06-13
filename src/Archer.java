public class Archer extends Character {

    public Archer(String name) {
        super(name, 100, 100);
    }

    @Override
    public void attack(Character opponent) {
        int damage = 15;
        int powerLoss = 8;

        if (this.power >= powerLoss && isAlive()) {
            opponent.takeDamage(damage);
            this.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        }

    }

    public void quickShot(Character opponent) {
        int damage = 30;
        int cost = 25;

        if (this.power >= cost) {
            opponent.takeDamage(damage);
            this.reducePower(cost);
            System.out.println(this.name + " used Quick Shot on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        } else {
            System.out.println(this.name + " does not have enough power for Quick Shot!");
        }
    }

    public void multiShot(Character opponent) {
        int damage = 60;
        int cost = 50;

        if (this.power >= cost) {
            opponent.takeDamage(damage);
            this.reducePower(cost);
            System.out.println(this.name + " used Multi Shot on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        } else {
            System.out.println(this.name + " does not have enough power for Multi Shot!");
        }
    }

    @Override
    public void specialMove(Character opponent) {
        // Empty because we want to give user a choice in Main.java
        System.out.println("Choose a special move: 'quick' or 'multi'");
    }
}
