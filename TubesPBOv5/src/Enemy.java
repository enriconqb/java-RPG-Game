public class Enemy extends Karakter{
    private double health = 100;
    private double attack = 20;

    public Enemy(String name){
        super(name);
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return this.attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

}
