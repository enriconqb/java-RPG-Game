import java.util.Scanner;

public class Boss extends NPC{
    private double attack = 50;
    public Boss(String name){
        super(name);
    }

    
    @Override
    public void tanya(){
        //obj Grup
        Scanner in = new Scanner(System.in);
        Player player = GameInfo.objPlayer;
        MenuUi ui = new MenuUi();
        
        //Program
        ui.spasi();
        System.out.print("\n"+
        "Holaa amigos...\n"+
        "Omaewa "+this.getName()+"\n"+
        "Aku akan memberimu soal teka-teki,\n"+ 
        "bila benar maka kamu mendapat item istimewa dan aku akan pergi dari sini\n"+
        "bila salah maka kamu akan terkena damage kutukan\n");
        if(this.getSyaratItem()!=null){
            System.out.print("Tapi sebelum itu kamu harus menggunakan '"+this.getSyaratItem().getName()+"'\n");
        }
        System.out.print(""+
        "Apakah kamu sudah siap?\n"+
        "[1] Sudah\n"+
        "[2] Belum\n"+
        "Pilih : ");
        int pil = in.nextInt();
        if(pil==1){
            if(player.getPegangItem()==this.getSyaratItem() || this.getSyaratItem()==null){
                ui.spasi();
                System.out.println("Mari kita mulai teka-tekinya....");
                if(this.getObjPuzzle().isMulaiBenar()){
                    this.beriItem();
                    GameInfo.isDone = true;
                    GameInfo.isOver = true;
                    GameInfo.isTamat = true;
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
            System.out.println("Siapa suruh belum siap!!!");
            System.out.println("JDERRRR HAHAHAHAHAHAHA");
            this.serang(player,this.attack);
        }
    }
}
