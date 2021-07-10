import java.util.ArrayList;

public class TheGame {
    //Var Group
    private int pil;
    private ArrayList<Ruangan> arrRuang = new ArrayList<>();
    private Player player;

    //Obj Group
    private MenuUi ui = new MenuUi();
    private Story story= new Story();
    private Puzzle puzzle = new Puzzle();

    //Construct
    public TheGame(){
        GameInfo.objGame= this;
    }

    public void game(){
        // === AlurGame === 
        while(!GameInfo.isOver){//Selama game tidak berakhir
            pil = ui.menuStart();//Menu memulai game
            if(pil==1){
                init();//Initialisasi game
                story.begin();//cerita awal game
                ui.enterPlayer();//Masukkan player
                player = GameInfo.objPlayer;//deklar data player
                
                while(!GameInfo.isTamat){//Selama game belum selesei
                    ui.spasi();
                    ui.cls();//ClearScreen
                    player.halfDisplay();//Status player
                    pil=ui.menuLorong();//menu lorong
                    if(pil > player.getPass()){//Belum berkeliling
                        System.out.println(player.getName()+" bingung...");
                        ui.pause();
                        continue;
                    }
                    if (pil==1) {//inventory player
                        ui.menuInventory(player);
                    }
                    else if(pil==2){//Berkeliling
                        player.jalan();
                    }
                    else if(pil==0){//Keluar game
                        GameInfo.isTamat = true;
                        GameInfo.isOver = true;
                    }
                    else{//Memasuki ruangan
                        ui.ruangan(pil);
                    }
                    ui.pause();
                }
                if(GameInfo.isDone){//Story Good ending
                    story.good_ending();
                }
                else{//Story bad ending
                    story.bad_ending();
                }
            }
            else if(pil==2){//Mematikan game
                GameInfo.isOver = true;
            }
            else{
                System.out.println("Pilihan tidak ada!");
            }
        }
    }
    
    
    public void init(){
        // ======= D.E.K.L.A.R AREA ======= 
        // === Item Misi ===
        MissionItem tongkatSihir = new MissionItem("Tongkat Sihir","+50 Attack ; Alat yang dapat membuat lawan pingsan");
        tongkatSihir.init(50);
        MissionItem ktm_laptop = new MissionItem("Ktm&Laptop","Sebuah kartu tanda pengenal");
        MissionItem jubah = new MissionItem("Jubah","Pakaian yang bisa membuatmu tidak terlihat");
        MissionItem pin = new MissionItem("Pin Sekolah","Sebuah pin yang berlogo sekolah");
        MissionItem ramuan = new MissionItem("Ramuan","Sebuah ramuan yang dapat mengembalikan monster kembali ke wujud manusia");

        
        
        // === Puzzle === 
        puzzle.init();
        ArrayList<Puzzle> arrPuzzle = puzzle.getArrPuzzle();
        // Puzzle Pruang1 = new Puzzle("makanan enak?", "sate", "bakpau", "mantau", 1);
        // Puzzle Pruang2 = new Puzzle("makanan enak?", "sate", "bakpau", "mantau", 1);
        // Puzzle Pruang3 = new Puzzle("makanan enak?", "sate", "bakpau", "mantau", 1);
        // Puzzle Pruang4 = new Puzzle("makanan enak?", "sate", "bakpau", "mantau", 1);
        // Puzzle Pruang5 = new Puzzle("makanan enak?", "sate", "bakpau", "mantau", 1);
        
        // === NPC === 
        NPC Nruang1 = new NPC("Sasandooooo");
        NPC Nruang2 = new NPC("Arigataoooooo");
        NPC Nruang3 = new NPC("Miyahoooo");
        NPC Nruang4 = new NPC("Ninzoooo");
        Boss Nruang5 = new Boss("Lavernaaaaaaa");
        Seller Nseller = new Seller("Zeller");
        
        // === Puzzle Terurut === 
        Nruang1.init(arrPuzzle.get(0), ktm_laptop, null);
        Nruang2.init(arrPuzzle.get(1), tongkatSihir, ktm_laptop);
        Nruang3.init(arrPuzzle.get(2), jubah, ktm_laptop);
        Nruang4.init(arrPuzzle.get(3), pin, ktm_laptop);
        Nruang5.init(arrPuzzle.get(4), ramuan, tongkatSihir);
        
        // === Random Puzzle === 
        // int randomNum = (int) (Math.random()*(arrPuzzle.size()));
        // Nruang1.init(arrPuzzle.get(randomNum), ktm_laptop, null);
        // Nruang2.init(arrPuzzle.get(randomNum), tongkatSihir, ktm_laptop);
        // Nruang3.init(arrPuzzle.get(randomNum), jubah, ktm_laptop);
        // Nruang4.init(arrPuzzle.get(randomNum), pin, ktm_laptop);
        // Nruang5.init(arrPuzzle.get(randomNum), ramuan, pin);
        
        // === Ruangan === 
        Ruangan ruang1 = new Ruangan("Ruang Elektronik", Nruang1,null);
        Ruangan ruang2 = new Ruangan("Ruang Sihir", Nruang2,null);
        Ruangan ruang3 = new Ruangan("Ruang Jahit", Nruang3,null);
        Ruangan ruang4 = new Ruangan("Ruang Tempa", Nruang4,jubah);
        Ruangan ruang5 = new Ruangan("Ruang Boss", Nruang5,pin);
        Ruangan toko = new Ruangan("Ruang Kantin", Nseller, null);
        

        // === Item Buff === 
        BuffItem potionHP = new BuffItem("PotionHP", "+40 HP");
        potionHP.init(40, 0);
        BuffItem roti = new BuffItem("Roti Panggang", "+10 HP ; Gurih gurih nyoiii");
        roti.init(10, 0);
        BuffItem lasagna = new BuffItem("Lasagna", "+20 HP ; Maknyussss");
        lasagna.init(20, 0);
        BuffItem potionDewa = new BuffItem("PotionDewa", "+999 HP +999 Attack");
        potionDewa.init(999, 999);


        // === Enemy === 
        Enemy monster1 = new Enemy("Monster Momon");

        // ======= A.D.D AREA =======  
        // === Ruangan add item === 
        ruang1.addItemruangan(potionHP);
        // ruang2.addItemruangan(potionDewa);

        // === Seller add item ===
        Nseller.addDagangan(potionHP, 50);
        Nseller.addDagangan(roti, 20);
        Nseller.addDagangan(lasagna, 30);
        Nseller.addDagangan(potionDewa, 100);
        
        // === Ruangan add enemy === 
        ruang3.addEnemyruangan(monster1);
        
        // === Add ke Ruang === 
        arrRuang.add(ruang1);
        arrRuang.add(toko);
        arrRuang.add(ruang2);
        arrRuang.add(ruang3);
        arrRuang.add(ruang4);
        arrRuang.add(ruang5);
        
        // === Program === 
        GameInfo.objMenu = ui;
        ui.setupLorong();
    }
    
    //Setter n Getter
    public ArrayList<Ruangan> getArrRuang() {
        return this.arrRuang;
    }

    public void setArrRuang(ArrayList<Ruangan> arrRuang) {
        this.arrRuang = arrRuang;
    }
}
