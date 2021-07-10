import java.util.Scanner;

public class NPC extends Karakter{
    private double attack = 30;
    private Puzzle objPuzzle;
    private MissionItem syaratItem;
    private MissionItem itemMisi;

    public NPC(String name){
        super(name);
    }

    public void init(Puzzle objPuzzle, MissionItem itemMisi, MissionItem syaratItem){
        this.objPuzzle = objPuzzle;
        this.itemMisi = itemMisi;
        this.syaratItem = syaratItem;
    }

    public void beriItem(){
        Player player = GameInfo.objPlayer;
        if(this.itemMisi!=null){
            player.takeItem(this.itemMisi);
            player.setCoin(player.getCoin()+30);
            this.itemMisi = null;
        }
        else{
            System.out.println(""+
            "Hahahahaha kamu lupa?\n"+
            "Aku sudah tidak punya apa-apa!");
        }
    }

    public void tanya(){
        //obj Grup
        Scanner in = new Scanner(System.in);
        Player player = GameInfo.objPlayer;
        MenuUi ui = new MenuUi();

        ui.spasi();
        ui.cls();
        System.out.print("\n"+
        "Holaa amigos...\n"+
        "Omaewa "+this.getName()+"\n"+
        "Aku adalah utusan dari Ratu Lavender...\n"+
        "Aku akan memberimu soal teka-teki,\n"+ 
        "bila benar maka kamu mendapat item istimewa\n"+
        "bila salah maka kamu akan terkena damage kutukan\n");
        if(syaratItem!=null){
            System.out.print("Tapi sebelum itu kamu harus menggunakan '"+syaratItem.getName()+"'\n");
        }
        System.out.print(""+
        "Apakah kamu sudah siap?\n"+
        "[1] Sudah\n"+
        "[2] Belum\n"+
        "Pilih : ");
        int pil = in.nextInt();
        if(pil==1){
            if(player.getPegangItem()==syaratItem || syaratItem==null){
                ui.spasi();
                System.out.println("Mari kita mulai teka-tekinya....");
                if(this.objPuzzle.isMulaiBenar()){
                    this.beriItem();
                }
                else{
                    this.serang(player,this.attack);
                    // System.out.println(player.getName()+" terkena kutukan! 30Hp diterima!");
                    // player.setHealth((player.getHealth()-30));
                }
            }
            else{
                System.out.println("Kamu berbohonggg!!");
                this.serang(player,this.attack);
                // System.out.println(player.getName()+" terkena kutukan! 30Hp diterima!");
                // player.setHealth((player.getHealth()-30));
            }
        }
        else if(pil==2){
            System.out.println("Okay aku tunggu kamu bersiap-siap...");
        }
        ui.pause();
    }

    //Setter n Getter
    public double getAttack() {
        return this.attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public Puzzle getObjPuzzle() {
        return this.objPuzzle;
    }

    public void setObjPuzzle(Puzzle objPuzzle) {
        this.objPuzzle = objPuzzle;
    }

    public MissionItem getSyaratItem() {
        return this.syaratItem;
    }

    public void setSyaratItem(MissionItem syaratItem) {
        this.syaratItem = syaratItem;
    }

    public MissionItem getItemMisi() {
        return this.itemMisi;
    }

    public void setItemMisi(MissionItem itemMisi) {
        this.itemMisi = itemMisi;
    }

}
