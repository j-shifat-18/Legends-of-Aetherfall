public class Warrior extends Character {

    public Warrior(String name){
        super(name, 120, 100);
    }

    @Override
    public void attack(Character opponent) {
        int damage = 12;
        int powerLoss = 5;

        if(this.power >= powerLoss && isAlive()){
            opponent.takeDamage(damage);
            opponent.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        }

    }

    @Override
    public void specialMove(Character opponent) {
        int damage = 35;
        int powerLoss = 35;

        if(this.power >= powerLoss && isAlive()){
            opponent.takeDamage(damage);
            opponent.reducePower(powerLoss);
            System.out.println(this.name + " used Attack on " + opponent.name);
            System.out.println(this.name + " caused " + damage + " damage.");
        }

    }
    
}
