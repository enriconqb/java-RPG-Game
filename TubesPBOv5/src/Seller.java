import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Seller extends NPC{
    private HashMap<Item,Integer> dagangan = new HashMap<Item,Integer>();
    private ArrayList<Item> key = new ArrayList<>();
    
    public Seller(String name){
        super(name);
    }

    @Override
    public void tanya(){
        //obj Grup
        Scanner in = new Scanner(System.in);
        MenuUi ui = new MenuUi();
        
        //Program
        ui.spasi();
        ui.cls();
        System.out.print("\n"+
        "Holaa amigos...\n"+
        "Omaewa "+this.getName()+"\n"+
        "Aku adalah penjual\n"+
        "Apakah kamu ingin beli sesuatu?\n"+
        "[1] Ya\n"+
        "[2] Tidak\n"+
        "Pilih : ");
        int pil = in.nextInt();
        if(pil==1){
            if(!key.isEmpty()){
                displayDagangan();
                System.out.print("Pilih : ");
                pil = in.nextInt();
                giveDagangan(pil);
                ui.pause();
            }
            else{
                System.out.println("Barang dagangan sudah habis!");
            }
        }
    }

    public void addDagangan(Item objItem, int coin){
        dagangan.put(objItem,coin);
        key.add(objItem);
    }

    public void giveDagangan(int value){
        Player player = GameInfo.objPlayer;
        if(value <= (key.size()) && value>0){
            value--;
            Item objItem = key.get(value);
            if(cukupCoin(objItem)){
                int harga = dagangan.get(objItem);
                player.setCoin(player.getCoin()-harga);
                player.takeItem(objItem);
                dagangan.remove(objItem);
                key.remove(objItem);
            }
            else{
                System.out.println("Coin tidak cukup!");
                System.out.println("Dapatkan dengan menyelesaikan misi!");
            }
        }
    }

    public void displayDagangan(){
        Player player = GameInfo.objPlayer;
        int i=0;
        System.out.println("+-----------------------");
        System.out.println("| K.A.N.T.I.N           ");
        System.out.println("| Coin "+player.getName()+": "+player.getCoin());
        System.out.println("+-----------------------");
        for (Item item : key) {
            i++;
            int coin = dagangan.get(item);
            System.out.printf("|%2d|%-15s|%4d Coin| Desc: %s%n",i,item.getName(),coin,item.getDeskripsi());
        }
        System.out.println("+-----------------------");
    }

    public boolean cukupCoin(Item objItem){
        Player player = GameInfo.objPlayer;
        boolean value = false;
        if(player.getCoin()>=dagangan.get(objItem)){
            value=true;
        }
        return value;
    }
}
