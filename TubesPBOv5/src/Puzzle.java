import java.util.ArrayList;
import java.util.Scanner;

public class Puzzle {
    private ArrayList<Puzzle> arrPuzzle = new ArrayList<>();
    private String soal;
    private String pg1;
    private String pg2;
    private String pg3;
    private int jawaban;

    public void init(){
        Puzzle hororPuzzle1 = new Puzzle();
        hororPuzzle1.setSoal("Sosok penghisap jiwa dan penjaga Azkaban yang eksis di 7 series film Hollywood?");
        hororPuzzle1.setPg1("Voldemort");
        hororPuzzle1.setPg2("Dementor");
        hororPuzzle1.setPg3("Goblin");
        hororPuzzle1.setJawaban(2);
        arrPuzzle.add(hororPuzzle1);

        Puzzle hororPuzzle2 = new Puzzle();
        hororPuzzle2.setSoal("Bertaring dan penyuka darah, dimalam haria dia aktif,  disiang hari dia lenyap. Makhluk apakah itu?");
        hororPuzzle2.setPg1("Nyamuk");
        hororPuzzle2.setPg2("Lintah");
        hororPuzzle2.setPg3("Vampire");
        hororPuzzle2.setJawaban(3);
        arrPuzzle.add(hororPuzzle2);

        Puzzle hororPuzzle3 = new Puzzle();
        hororPuzzle3.setSoal("Didalam cerita Yunani kuno. Sosok yang dapat merubah manusia menjadi batu disaat melihatnya?");
        hororPuzzle3.setPg1("Medusa");
        hororPuzzle3.setPg2("DewiHera");
        hororPuzzle3.setPg3("Zeus");
        hororPuzzle3.setJawaban(1);
        arrPuzzle.add(hororPuzzle3);

        //initialisasi Kategori Pertanyaan Pengetahuan Sihir
        Puzzle knowladge1 = new Puzzle();
        knowladge1.setSoal("Buah sihir berwarna merah yang akan membuat tidur apabila dimakan?");
        knowladge1.setPg1("Strawberry");
        knowladge1.setPg2("Cherry");
        knowladge1.setPg3("Apel");
        knowladge1.setJawaban(3);
        arrPuzzle.add(knowladge1);

        Puzzle knowladge2 = new Puzzle();
        knowladge2.setSoal("Hewan mitologi Eropa serupa tapi tak sama dengan KUDA?");
        knowladge2.setPg1("Keledai");
        knowladge2.setPg2("Unicorn");
        knowladge2.setPg3("Kuda");
        knowladge2.setJawaban(2);
        arrPuzzle.add(knowladge2);

        Puzzle knowladge3 = new Puzzle();
        knowladge3.setSoal("Hewan mitologi yang mempunyai sayap, serupa tapi tak sama dengan flaminggo juga sebagai simbol keabadian?");
        knowladge3.setPg1("Burung Hantu");
        knowladge3.setPg2("Naga");
        knowladge3.setPg3("Phoenix");
        knowladge3.setJawaban(3);
        arrPuzzle.add(knowladge3);

        //initialisasi Kategori Pertanyaan Sejarah Sihir
        Puzzle history1 = new Puzzle();
        history1.setSoal("Pulau yang penuh dengan keindahan serta penuh dengan kekayaan yang melimpah, memiliki sistem tekhnologi modern jauh sebelum manusia modern menciptakan. Pulau apakah itu?");
        history1.setPg1("Pulau Atlantis");
        history1.setPg2("Pulau Mediterania");
        history1.setPg3("Pulau Jawa");
        history1.setJawaban(1);
        arrPuzzle.add(history1);

        Puzzle history2 = new Puzzle();
        history2.setSoal("Sosok Legendaris penghuni Gunung Merapi?");
        history2.setPg1("Mak Lampir");
        history2.setPg2("Leak");
        history2.setPg3("Genderuwo");
        history2.setJawaban(1);
        arrPuzzle.add(history2);

        Puzzle history3 = new Puzzle();
        history3.setSoal("Penyihir legenda pemimpin pasukan \"Sembilan Pembawa Cincin\" serta memiliki peran pada triloggy Lord of The Rings?");
        history3.setPg1("Zeus");
        history3.setPg2("Gandalf");
        history3.setPg3("Dumbeldore");
        history3.setJawaban(2);
        arrPuzzle.add(history3);
    }

    public boolean isMulaiBenar(){
        //obj Grup
        Scanner in = new Scanner(System.in);
        boolean value = false;

        System.out.println(this.soal);
        System.out.println("[1] "+this.pg1);
        System.out.println("[2] "+this.pg2);
        System.out.println("[3] "+this.pg3);
        System.out.print("Pilih : ");
        int pil = in.nextInt();
        if(pil==this.jawaban){
            System.out.println("Kamu benar...");
            value = true;
        }
        else{
            System.out.println("Jawaban mu salah HAHAHAHA!");
        }
        return value;
    }

    //Setter n Getter
    public ArrayList<Puzzle> getArrPuzzle() {
        return this.arrPuzzle;
    }

    public void setArrPuzzle(ArrayList<Puzzle> arrPuzzle) {
        this.arrPuzzle = arrPuzzle;
    }

    public String getSoal() {
        return this.soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getPg1() {
        return this.pg1;
    }

    public void setPg1(String pg1) {
        this.pg1 = pg1;
    }

    public String getPg2() {
        return this.pg2;
    }

    public void setPg2(String pg2) {
        this.pg2 = pg2;
    }

    public String getPg3() {
        return this.pg3;
    }

    public void setPg3(String pg3) {
        this.pg3 = pg3;
    }

    public int getJawaban() {
        return this.jawaban;
    }

    public void setJawaban(int jawaban) {
        this.jawaban = jawaban;
    }

}
