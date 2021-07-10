public class GameEngine {
    //ObjGroup
    TheGame startGame = new TheGame();

    public static void main(String[] args) {
        GameEngine game = new GameEngine();
        game.mulai();
    }

    public void mulai(){
        while(!GameInfo.isOver){
            aksi();
        }
    }
    public void aksi(){
        startGame.game();
    }
}
