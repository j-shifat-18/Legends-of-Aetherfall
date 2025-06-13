public class Archer extends Character {

    public Archer(String name) {
        super(name, 100, 100);
    }

    @Override
    public void attack(Character opponent) {
        int damage = 15;
        int powerLoss = 8;

        if(this.power >= powerLoss && isAlive()){
            opponent.takeDamage(damage);
            opponent.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        }

    }

    @Override
    public void specialMove(Character opponent) {
        int damage = 30;
        int powerLoss = 25;

        if(this.power >= powerLoss && isAlive()){
            opponent.takeDamage(damage);
            opponent.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        }

    }
}
