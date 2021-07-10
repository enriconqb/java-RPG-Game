import java.util.ArrayList;

public class BuffItem extends Item{
    private double health;
    private double attack;

    public BuffItem(String name, String deskripsi){
        super(name, deskripsi);
    }

    public void init(double health, double attack){
        this.health = health;
        this.attack = attack;
    }

    @Override
    public void used(){
        //obj Grup
        Player player = GameInfo.objPlayer;
        ArrayList<Item> arrInventory = player.getInventory();
        player.setHealth((player.getHealth()+this.health));
        player.setAttack((player.getAttack()+this.attack));
        //Hapus yang dipegang
        player.setPegangItem(null);
        //hapus inventory
        arrInventory.remove(this);
        player.setInventory(arrInventory);
    }
    
}
