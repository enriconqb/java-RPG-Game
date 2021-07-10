import java.util.ArrayList;

public class Player extends Karakter{
    private double health = 100;
    private double attack = 10;
    private int coin = 0;
    private int pass=2;
    private Item pegangItem;
    private ArrayList<Item> inventory = new ArrayList<>();

    //Construct
    public Player(String name){
        super(name);
    }

    //Method
    public void jalan(){
        if(pass==GameInfo.objMenu.getArrMenu().size()){
            System.out.println("Semua ruangan sudah "+GameInfo.objPlayer.getName()+" telusuri...");
            return;
        }
        else{
            System.out.println(GameInfo.objPlayer.getName()+" berjalan menelusuri lorong...");
        }
        pass +=1;
    }

    public void display(){
        System.out.print("" +
                "+---------------------+\n" +
                "| Status "+this.getName()+"\n" +
                "| Health    : "+this.health+"\n" +
                "| Attack    : "+this.attack+"\n" +
                "| Coin      : "+this.coin+"\n" +
                "| Use Item  : ");
        if(this.pegangItem!=null) System.out.print(this.pegangItem.getName());
        System.out.println( "\n| Inventory : ");
        if(this.inventory!=null){
            int i=0;
            for(Item objItem : inventory){
                System.out.println("| "+(i+1)+". "+objItem.getName()+" ,Des : "+objItem.getDeskripsi());
                i++;
            }
        }
        System.out.println( "+---------------------+\n");
    }

    public void halfDisplay(){
        System.out.print("" +
                "+---------------------+\n" +
                "| Status "+this.getName()+"\n" +
                "| Health    : "+this.health+"\n" +
                "| Attack    : "+this.attack+"\n" +
                "| Coin      : "+this.coin+"\n" +
                "| Use Item  : ");
        if(this.pegangItem!=null) System.out.print(this.pegangItem.getName());
        System.out.println( "\n+---------------------+\n");
    }

    public void useItem(int pilihan_item){
        if(pilihan_item > inventory.size()){
            System.out.println("Nomer Item tidak ada!");
            return;
        }
        this.pegangItem = inventory.get((pilihan_item-1));
        this.pegangItem.used();
    }

    public boolean cekInventory(){
        boolean value = false;
        if(inventory.size()>0){
            value=true;
        }
        return value;
    } 

    public void takeItem(Item objItem){
        inventory.add(objItem);
        System.out.println(this.getName()+" mendapatkan '"+objItem.getName()+"'");
    }

    public void plusCoin(int value){
        this.coin +=value;
        System.out.println(this.getName()+" mendapatkan '"+value+" Coin!'");
    }

    //Setter n Getter
    public int getPass() {
        return this.pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public Item getPegangItem() {
        return this.pegangItem;
    }

    public void setPegangItem(Item pegangItem) {
        this.pegangItem = pegangItem;
    }

    public double getAttack() {
        return this.attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int getCoin() {
        return this.coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

}
