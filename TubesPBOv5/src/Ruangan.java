import java.util.Scanner;

public class Ruangan {
    private String name;
    private NPC objNpc;
    private Enemy objEnemy;
    private MissionItem syaratItem;
    private BuffItem itemRuangan;

    public Ruangan(String name, NPC objNpc, MissionItem syaratItem){
        this.name =  name;
        this.objNpc = objNpc;
        this.syaratItem = syaratItem;
    }

    public void addItemruangan(BuffItem objBuffitem){
        this.itemRuangan = objBuffitem;
    }

    public void addEnemyruangan(Enemy objEnemy){
        this.objEnemy = objEnemy;
    }
    public void aksi(){
        Player player = GameInfo.objPlayer;
        MenuUi ui = new MenuUi();
        System.out.println(player.getName()+" memasuki "+this.name);
        ui.pause();
        boolean value = true;
        while(value){
            value = aksiRuangan();
        }
    }

    public void display(){
        System.out.println("\n"+
        "+---------------------+\n"+
        "| "+this.name+"\n"+
        "+---------------------+");
    }

    public boolean aksiRuangan(){
        //obj Group
        Scanner in = new Scanner(System.in);
        Player player = GameInfo.objPlayer;
        MenuUi ui = new MenuUi();
        boolean value = true;

        //Main
        ui.spasi();
        ui.cls();
        this.display();
        player.halfDisplay();
        if(!player.isAlive()){
            GameInfo.isTamat = true;
            GameInfo.isOver = true;
            value = false;
            return value;
        }
        if(isEnemyAda() && objEnemy.isAlive()){
            System.out.println(player.getName()+" dihadang "+objEnemy.getName());
            System.out.println("Apa yang ingin kamu lakukan sekarang?");
            System.out.println("[1] Serang");
            System.out.println("[0] Keluar");
            System.out.print("Pilih: ");
            int pil = in.nextInt();
            if(pil==1){
                if(!objEnemy.isAlive()){
                    System.out.println(objEnemy.getName()+" sudah pingsan!");
                    ui.pause();
                    return value;
                }
                player.serang(objEnemy, player.getAttack());
                if(objEnemy.isAlive()){
                    objEnemy.serang(player,objEnemy.getAttack());
                }
                else{
                    System.out.println(objEnemy.getName()+" sudah pingsan!");
                }
                ui.pause();
                return value;
            }
            else if(pil==0){
                System.out.println(player.getName()+" keluar ruangan...");
                value = false;
                return value;
            }
            else{
                return value;
            }
        }

        if(isItemruanganAda()){
            System.out.println(player.getName()+" melihat "+itemRuangan.getName());
        }
        System.out.println(player.getName()+" melihat seseorang...");
        System.out.println("Apa yang ingin kamu lakukan sekarang?");
        System.out.println("[1] Inventory");
        System.out.println("[2] Tanya orang tersebut");
        if(isItemruanganAda()){
            System.out.println("[3] Ambil item");
        }
        System.out.println("[0] Keluar Ruangan");
        System.out.print("Pilih: ");
        int pil = in.nextInt();
        if(pil==1){
            ui.menuInventory(player);
        }
        else if(pil==2){
            objNpc.tanya();
            if(GameInfo.isDone){
                value = false;
            }
        }
        else if(pil==3){
            if(isItemruanganAda()){
                player.takeItem(itemRuangan);
                this.itemRuangan = null;
            }
        }
        else{
            value= false;
        }
        ui.pause();
        return value;
    }

    public boolean isItemruanganAda(){
        boolean value=false;
        if(this.itemRuangan!=null){
            value = true;
        }
        return value;
    }

    public boolean isEnemyAda(){
        boolean value = false;
        if(this.objEnemy!=null){
            value=true;
        }
        return value;
    }


    //Setter n Getter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NPC getObjNpc() {
        return this.objNpc;
    }

    public void setObjNpc(NPC objNpc) {
        this.objNpc = objNpc;
    }

    public MissionItem getSyaratItem() {
        return this.syaratItem;
    }

    public void setSyaratItem(MissionItem syaratItem) {
        this.syaratItem = syaratItem;
    }



    
}
