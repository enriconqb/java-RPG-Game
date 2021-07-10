public class Item {
    private String name;
    private String deskripsi;

    public Item(String name, String deskripsi){
        this.name = name;
        this.deskripsi = deskripsi;
    }

    public void used(){
        //Kosong
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDeskripsi(){
        return this.deskripsi;
    }
}
