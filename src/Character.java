public abstract class Character {
    String name;
    int health;
    int power;

    public Character(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName(){
        return name;
    }

    public boolean isAlive() {
        return this.health > 0;
    };

    public void takeDamage(int damage) {
        this.health -= damage;
    };

    public void reducePower(int powerLoss) {
        this.power -= powerLoss;
    };

    public void displayStats() {
        System.out.println(this.name + " - Health: " + this.health + ", Power: " + this.power);
    };

    public abstract void attack(Character opponent) ;
    public abstract void specialMove(Character opponent) ;

}
