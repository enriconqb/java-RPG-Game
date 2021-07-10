public class Karakter {
    private String name;
    private double health;

    //Constructor
    public Karakter(String name){
        this.name = name;
    }

    //Method
    public boolean isAlive(){
        boolean value = false;
        if(this.getHealth()>0){
            value = true;
        }
        return value;
    }

    public void serang(Karakter target, double attack){
        target.setHealth(target.getHealth()-attack);
        System.out.println(target.name+" menerima damage sebesar "+attack+" dari "+this.name+"!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }




    

}
