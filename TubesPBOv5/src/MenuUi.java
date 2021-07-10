import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUi {
    //Obj group
    private Scanner in = new Scanner(System.in);
    private int pil=0;
    private ArrayList<String> arrMenu = new ArrayList<>();

    public int pilih(){
        pil=in.nextInt();
        return pil;
    }

    public int menuStart(){
        System.out.print(""+
        " /$$      /$$                     /$$                  /$$$$$$            /$$                           /$$\n"+
        "| $$$    /$$$                    |__/                 /$$__  $$          | $$                          | $$\n"+
        "| $$$$  /$$$$  /$$$$$$   /$$$$$$  /$$  /$$$$$$$      | $$  \\__/  /$$$$$$$| $$$$$$$   /$$$$$$   /$$$$$$ | $$\n"+
        "| $$ $$/$$ $$ |____  $$ /$$__  $$| $$ /$$_____/      |  $$$$$$  /$$_____/| $$__  $$ /$$__  $$ /$$__  $$| $$\n"+
        "| $$  $$$| $$  /$$$$$$$| $$  \\ $$| $$| $$             \\____  $$| $$      | $$  \\ $$| $$  \\ $$| $$  \\ $$| $$\n"+
        "| $$\\  $ | $$ /$$__  $$| $$  | $$| $$| $$             /$$  \\ $$| $$      | $$  | $$| $$  | $$| $$  | $$| $$\n"+
        "| $$ \\/  | $$|  $$$$$$$|  $$$$$$$| $$|  $$$$$$$      |  $$$$$$/|  $$$$$$$| $$  | $$|  $$$$$$/|  $$$$$$/| $$\n"+
        "|__/     |__/ \\_______/ \\____  $$|__/ \\_______/       \\______/  \\_______/|__/  |__/ \\______/  \\______/ |__/\n"+
        "                        /$$  \\ $$                                                                          \n"+
        "                       |  $$$$$$/                                                                          \n"+
        "                        \\______/                                                                           \n"+
        "\n"+
        "\n"+
        "                                [1] Start               [2] Exit\n"+
        "                                           Pilih: ");
        // System.out.print("" +
        //         "+----------------------------+\n" +
        //         "|                            |\n" +
        //         "|       M A G I C            |\n" +
        //         "|           S C H O O L      |\n" +
        //         "|                            |\n" +
        //         "|          1. Start          |\n" +
        //         "|          2. Exit           |\n" +
        //         "|                            |\n" +
        //         "|                            |\n" +
        //         "+----------------------------+\n" +
        //         "Pilih: ");
        pil=pilih();
        return pil;
    }

    public void enterPlayer(){
        System.out.print("Masukkan nama player: ");
        String name = in.next();
        Player player = new Player(name);
        GameInfo.objPlayer = player;
    }

    public void setupLorong(){
        arrMenu.add("Inventory Player");
        arrMenu.add("Berkeliling");
        for (Ruangan objRuang : GameInfo.objGame.getArrRuang()) {
            arrMenu.add(objRuang.getName());
        }
    }

    public int menuLorong(){
        //Deklar Var
        int batas=GameInfo.objPlayer.getPass();

        //Menu
        display();
        System.out.println("Apa yang ingin kamu lakukan sekarang?");
        for (int i=0;i<batas;i++) {
            System.out.println("["+(i+1)+"] "+arrMenu.get(i));
        }
        System.out.println("[0] Keluar Gedung");
        System.out.print("Pilih: ");
        pil=pilih();
        return pil;
    }

    public void display(){
        System.out.println(
        "+---------------------+\n"+
        "|   Lorong Gedung      \n"+
        "+---------------------+");
    }

    public void menuInventory(Player objPlayer){
        if(objPlayer.cekInventory()){
            objPlayer.display();
            System.out.print("Gunakan alat (nomer urut alat) : ");
            pil=pilih();
            objPlayer.useItem(pil);
        }
        else {
            System.out.println("Tidak ada barang");   
        }
    }

    public void ruangan(int pilihan_ruangan){
        Player player = GameInfo.objPlayer;
        ArrayList<Ruangan> arrRuang = GameInfo.objGame.getArrRuang(); 
        Ruangan objRuangan = arrRuang.get((pilihan_ruangan-3));
        //-------- Checker --------------------------
        // for (Ruangan ruangan : arrRuang) {
        //     System.out.println(ruangan.getName());
        // }
        //==========================================================================================================
        if(player.getPegangItem()==objRuangan.getSyaratItem() || objRuangan.getSyaratItem()==null){
            objRuangan.aksi();
        }
        else{
            System.out.println("Kamu tidak bisa memasuki ruangan karena belum memakai '"+objRuangan.getSyaratItem().getName()+"' !");
        }
    }

    public void spasi(){
        System.out.println("\n\n\n\n\n");
    }
    
    public void pause(){
        System.out.print("Press enter to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void cls(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    //Setter n Getter
    public ArrayList<String> getArrMenu() {
        return this.arrMenu;
    }

    public void setArrMenu(ArrayList<String> arrMenu) {
        this.arrMenu = arrMenu;
    }
    public void menuUtama(){
        
    }
}