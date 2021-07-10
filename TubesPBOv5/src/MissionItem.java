public class MissionItem extends Item{
    private double attack;

    public MissionItem(String name, String deskripsi){
        super(name, deskripsi);
    }

    public void init(double attack){
        this.attack = attack;
    }

    @Override
    public void used(){
        //obj Grup
        Player player = GameInfo.objPlayer;
        player.setAttack((10+this.attack));
    }

    public double getAttack() {
        return this.attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

}
