public class Story {
    public void begin(){
        scene1();
        GameInfo.objMenu.pause();
        scene2();
        GameInfo.objMenu.pause();
        scene3();
        GameInfo.objMenu.pause();
        scene4();
        GameInfo.objMenu.pause();
        scene5();
    }

    public void bad_ending(){
        scene6();
        GameInfo.objMenu.pause();
        scene7();
        GameInfo.objMenu.pause();
    }

    public void good_ending(){
        scene8();
        GameInfo.objMenu.pause();
        scene9();
        GameInfo.objMenu.pause();
        scene10();
        GameInfo.objMenu.pause();
        scene11();
        GameInfo.objMenu.pause();
        scene12();
        GameInfo.objMenu.pause();
    }

    public void scene1() {
        System.out.print("\n" +
                "+--------------------------------------------------------------------+\n" +
                "| Magic School merupakan kampus yang dikenal memiliki mahasiswa para |\n" +
                "| penyihir putih yang baik hati.                                     |\n" +
                "|          @@                                                        |\n" +       
                "|       @@@  @@@                                                     |\n" +   
                "| @@@@ @@      @@ @@@@                                               |\n" +  
                "|      @@@    @@@                 @@                 @@              |\n" +
                "|     @& .@@@@  @@                @&@@@#@@#@@@@@@&@@@@@              |\n" +
                "|   @@     @@     @               @@  &@@  @@&  @@*  @@              |\n" +
                "|                                 @@  &@@  @#&  @@*  @@              |\n" +
                "|                                 @@                 @@              |\n" +
                "|                                 @@  &&@  @@&  @#*  @@              |\n" +
                "|                                 @@  &&@  @@&  @#*  @@              |\n" +
                "|                                 @@  &@(  ((&  (@*  @@              |\n" +
                "|                          #@@@@@@&@                 @#@@@@@@@       |\n" +
                "|                          @@@@@@@@@      @@@@@      @@@@@@@@@       |\n" +
                "|                           @&%   @@    @@    ,@@    @@   @#@        |\n" +
                "|                           @@%   @@    @@     @@    @@   @@@        |\n" +
                "|                           @@%   @@    @@     @@    @@   @@@        |\n" +
                "|                           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@        |\n" +     
                "+--------------------------------------------------------------------+\n" +
                "\n");
    }
    
    public void scene2() {
        System.out.print("\n" +
                "+--------------------------------------------------------------------+\n" +
                "| Namun semuanya berubah ketika penyihir merah yang jahat bernama    |\n" +
                "| Laverna datang untuk menguasai Magic School.                       |\n" +
                "|          &                                                         |\n" +
                "|    @     @%    @                                                   |\n" + 
                "|     @@  @@@@ @@                                                    |\n" +
                "|      @@     @@                                                     |\n" +
                "|  %%  @@     @@  %%               @@@@@@@@@@@@@@@@@&                |\n" +         
                "|      .@@@@@@                     @@@@@@@@@@@@@@@@@@                |\n" +
                "|    @@    @    @@                 @@              @@                |\n" +
                "|          @*                      @@ @@   @@  @@  @@                |\n" +
                "|                                  @@              @@                |\n" +
                "|                                  @@ @@   @@  @@  @@                |\n" +
                "|                  @@*             @@ #@   ((  @@  @@                |\n" +
                "|                 *@@        @@@@@@@@              @@@@@@@&          |\n" +
                "|               .@ @@@&      @@@@@@@@   @@@(@@@    @@@@@@@           |\n" +
                "|                  //         @%   @@   @@    @@   @@   @@           |\n" +
                "|                @@  @        @%   @@   @@    @@   @@   @@           |\n" +
                "|               @     @.      @@@@@@@@@@@@@@@@@@%@@@@@%@@@           |\n" +
                "|                                                                    |\n" +
                "+--------------------------------------------------------------------+\n" +
                "\n");
    }
    public void scene3() {
        System.out.print("\n" +
                "+--------------------------------------------------------------------+\n" +
                "| Seketika aura dari Magic School berubah menjadi negative.          |\n" +
                "|               ,,,,,,,                                              |\n" +
                "|             ,,,,,,,,,                                              |\n" +
                "|            ,,,,,,,,,,                                              |\n" +
                "|                ,,,,                                                |\n" +
                "|                ,,,      @@                  @@                     |\n" +
                "|               ,,        @@@@@%@@@@@@@@@@@@@@@@                     |\n" +
                "|              ,          (@                  @@                     |\n" +
                "|                         @@   @@   %@   @@@  @@                     |\n" +
                "|                         @@                  @@                     |\n" +
                "|                         %@                  @@                     |\n" +
                "|                         @@   @@   @@   @@@  @@                     |\n" +
                "|                         @@                  %@                     |\n" +
                "|                 @@@     @@                  @@      @@@            |\n" +
                "|                  @@@@@@@@@     .@@%@@@@     @@@@@%@@@@             |\n" +
                "|                   @@    @@    @@@     @@    #@    @@               |\n" +
                "|                   @@    @@    @@@     @%    @@    @@               |\n" +
                "|                   @@    @@    @@@     @@    @@    @@               |\n" +
                "|                   @@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@               |\n" +
                "+--------------------------------------------------------------------+\n" +
                "\n");
    }
    public void scene4() {
        System.out.print("\n" +
                "+--------------------------------------------------------------------------------+\n" +
                "| Magic School membutuhkan aura positif untuk mengembalikan keadaan.             |\n" +
                "|                                                                                |\n" +
                "|            @@@@@@@@@@@@@@@.                                                    |\n" +
                "|        @@  @@               @@@@%           ,,,                                |\n" +
                "|     @@  @@   @,                  @@        ,,,                             ,,, |\n" +
                "|   @@  .@#@   &*@@                  @@       ,     @@/################@@   ,,,  |\n" +
                "|  @*      .@@@.%                      @            @@@@@@@@@@@@@@@@@@@@@    ,   |\n" +
                "| @          @     @@&@@@@@@@@          @           @@                 @@        |\n" +
                "| @                @ @  @ @  @          %           @@  @@    @@   @@  @@        |\n" +
                "| @                @         @          @           @@                 @@        |\n" +
                "| @@            @@@@         @@@@      @@           @@                 @@        |\n" +
                "|  @@           @  @   @.@   @  @     @@            @@  @@    @@   @@  @@        |\n" +
                "|    @&         @  @  @   @  @  @   ,@*      @@@@@@@@@                 @@@@@@@@@.|\n" +
                "|      @@       @@@@@@@@@@@@@@@@@ @@.       @@@     @@                 @@     @@@|\n" +
                "|         @@@                    #%          .@@....@@     @@@,@@@%    @@....@@. |\n" +
                "|              (@@@@@@@@@@@@@@   @@           @@    @@    @@     @@    @@    @@  |\n" +
                "|                              @@@@@@         @@    @@    @@     @@    @@    @@  |\n" +
                "|                                    ,@.      @@    @@    @@     @@    @@    @@  |\n" +
                "|                                             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  |\n" +
                "+--------------------------------------------------------------------------------+\n" +
                "\n");
    }
    public void scene5() {
        System.out.print("\n" +
                "+---------------------------------------------------------------+\n" +
                "| Permainan barulah dimulai. Mampukah player menyelesaikan misi |\n" +
                "| yang diberikan oleh utusan Laverna untuk merubah aura Magic   |\n" +
                "| School?                      &&&                              |\n" +
                "|                             &   &&  &&&&&&     &&&&           |\n" +
                "|                             &   &&&       &   &&  &           |\n" +
                "|                             &   &&         & &&   &           |\n" +
                "|                             &&   &&        &&&   &            |\n" +
                "|                              &&    &&&&&&&&     &             |\n" +
                "|                        &&&&                   &&              |\n" +
                "|                   &&&                        &                |\n" +
                "|              &&&                           &&                 |\n" +
                "|           &&&                    &&       &&                  |\n" +
                "|        &&                      &&&        &&&                 |\n" +
                "|      &&                      &&&&            &&               |\n" +
                "|    &&                 &&&&  &&&      &&&       &&             |\n" +
                "|   &  &&&&&        &&&      &&&     &&   &&     &&             |\n" +
                "|   &&       &&&&&          &&     &&      &&    &&             |\n" +
                "|                         &&    &&          &   &&              |\n" +
                "|                          &&&&              &&&                |\n" +
                "+---------------------------------------------------------------+\n" +
                "\n");
    }
    public void scene6() {
        System.out.print("\n" +
        "+--------------------------------------------------------------------------------------+\n" +
        "| Kekuatan player sudah habis. Player tidak dapat menyelesaikan misinya sehingga       |\n" +
        "| Laverna masih menguasai Magic School dan kutukan masih belum hilang.                 |\n" +
        "|                                                 @@@@@@@@@@@@@@@@@@@@@@@@@@@          |\n" +
        "|                                                 @@@@@@@@@@@@@@@@@@@@@@@@@@@          |\n" +
        "|            @@@@@@@(                             @@@                     @@@          |\n" +
        "|          *@@@@@@@@@@            .               @@@  ...    ...   ...   @@@          |\n" +
        "|          (@@@@@@@@@@      /    (**    (         @@@  @@@    @@@   @@@   @@@          |\n" +
        "|           .@@@@@@@@      ((.  ((*(   (((        @@@  #%%    %%#   %%%   @@@          |\n" +
        "|                         .##    (/   *.#(,       @@@                     @@@          |\n" +
        "|       #@@@@@@@@@@@@@@@@  #%    (/    .#(        @&@  @@@    @@@   @@@   @@@          |\n" +
        "|      /@@@@@@@@@@@@@@@@@@ .##//####*/##%         @@@  @@@    @#/   (@@   @@@          |\n" +
        "|      @@@@@@@@@@@@@@@@@@@@     *#//%     @@@@@@@@@@@                     @@@@@@@@@@@  |\n" +
        "|      @@@@@@@@@@@@@@@@@@@@@*     (%     @@@@@@@@@@@@                     @@@@@@@@@@@@ |\n" +
        "|     %@@@@.@@@@@@@@@@@@(@@@@     #/     @@@@@@@@@@@&       @#@@@@@       @@@@@@@@@@@@ |\n" +
        "|    .@@@@  @@@@@@@@@@@@ @@@@@    #/      @@@     @@@     @@@    #@@@     @@*    @@@   |\n" +
        "|    @@@@@  @@@@@@@@@@@@  @@@@&   #/      @@@     @@@    %@@      %@@     @@*    @@@   |\n" +
        "|   @@@@@   @@@@@@@@@@@@   @@@@   #/      @@@     @@@    &@@      @@@     @&*    @@@   |\n" +
        "|  @@@@@    @@@@@@@@@@@@   ,@@@@  #/      @@&     @@@    &@@      @@@     @@*    @@@   |\n" +
        "| @@@@     @@@@@@@@@@@@@    &@@@/ #/      @@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@   |\n" +
        "+--------------------------------------------------------------------------------------+\n" +
        "\n");
    }

    public void scene7() {
        System.out.print("\n" +
        "+---------------------------------------------------------------+\n" +
        "|                                                               |\n" +
        "|           /$$$$$$   /$$$$$$  /$$      /$$ /$$$$$$$$           |\n" +
        "|          /$$__  $$ /$$__  $$| $$$    /$$$| $$_____/           |\n" +
        "|         | $$  \\__/| $$  \\ $$| $$$$  /$$$$| $$                 |\n" +
        "|         | $$ /$$$$| $$$$$$$$| $$ $$/$$ $$| $$$$$              |\n" +
        "|         | $$|_  $$| $$__  $$| $$  $$$| $$| $$__/              |\n" +
        "|         | $$  \\ $$| $$  | $$| $$\\  $ | $$| $$                 |\n" +
        "|         |  $$$$$$/| $$  | $$| $$ \\/  | $$| $$$$$$$$           |\n" +
        "|          \\______/ |__/  |__/|__/     |__/|________/           |\n" +
        "|                                                               |\n" +
        "|           /$$$$$$  /$$    /$$ /$$$$$$$$ /$$$$$$$              |\n" +
        "|          /$$__  $$| $$   | $$| $$_____/| $$__  $$             |\n" +
        "|         | $$  \\ $$| $$   | $$| $$      | $$  \\ $$             |\n" +
        "|         | $$  | $$|  $$ / $$/| $$$$$   | $$$$$$$/             |\n" +
        "|         | $$  | $$ \\  $$ $$/ | $$__/   | $$__  $$             |\n" +
        "|         | $$  | $$  \\  $$$/  | $$      | $$  \\ $$             |\n" +
        "|         |  $$$$$$/   \\  $/   | $$$$$$$$| $$  | $$             |\n" +
        "|          \\______/     \\_/    |________/|__/  |__/             |\n" +
        "|                                                               |\n" +
        "+---------------------------------------------------------------+\n" +
        "\n");
    }

    public void scene8() {
        System.out.print("\n" +
                "+--------------------------------------|\n" +
                "| Ini Misi terakhir pada permainan     |\n" +
                "| Magic School. pemain harus bergegas  |\n" +
                "| dengan cepat untuk menyelamatkan     |\n" +
                "| teman - temannya dan menyelamatkan   |\n" +
                "| kampus karena jika tidak, maka       |\n" +
                "| kutuan laverna akan kekal abadi      |\n" +
                "| selamanya.                           |\n" +
                "|                                      |\n" +
                "MMWWNWMMWWNWMMWWNWWWMMWNWXo.   .:0WNWWMM\n" +
                "WWWWWWWWWWWWWWWWWWWWWWWWWd.      :XWWWWW\n" +
                "WWWWMWWWWMWWNKd:;lx0XNWMWk.      lNWWWWW\n" +
                "MMWWWWWMWWXk:.     ..,cdOXkc'..;xNWNWWMM\n" +
                "WWWWWWWW0l'  .,dOxc''.   ':dOXNWWWWWWWWW\n" +
                "WWWMWWW0,  'lONWMWW0o,      .dNWWWWMMWWW\n" +
                "MMWWNWMNOdkXMMWWWWO,          :KMMWWWWMM\n" +
                "WWWWWWWWWMWWWWWWNd.       ,o,  'xKXXXXXN\n" +
                "WWWMMWWWWWMWWWWXo.       ;0WKl.  ......,\n" +
                "MMWWWWMMWWWWWMXc        cXWWWNk:,,,,,,;c\n" +
                "WWWWWWWWWWWWWWK:       :XWWWWWWWWWWWWWWW\n" +
                "NNWWMWWWWWWWXooOo,.    .:kNWWMMWWWWMWWWW\n" +
                "WWXXXXXXXXX0c  .l0Ol:,   .c0NWWWMMWWWWMM\n" +
                "Nd'.........  .;kNWWWNkl'  .oXWWWWWWWWWW\n" +
                "Nx;,,,,,,,,,,:xNMWWWNWWWo. .oNWWNWWMMWWW\n" +
                "WWWWWNWWWNNNWWWWWWWWWWNd. .lXNWMWWWWWWMM\n" +
                "WWWWWWWWWWWWWWWWWWWWMWd. .lXWWWWWWWWWWWW\n" +
                "WWWMMWWWWMMWWWWWMWWNXd. .lXWWMMWWWWMMWWW\n" +
                "WMMWWWWMWWWWWWMWWWWk;. .lXWWWWWWWWWWWMMM\n" +
                "MMWWNWMMWNNWMMMWNWWx,. cXWWWWWWMMMWNWWMM\n" +
                "+--------------------------------------+\n" +
                "\n");
    }

    public void scene9() {
        System.out.print("\n" +
                "+---------------------------------------------------------------+\n" +
                "|  Kumpulan item yang telah diambil akan membantu untuk         |\n" +
                "|  melawan laverna. Kini pemain harus segera mengambil ramuan   |\n" +
                "|  ajaib untuk diminum oleh teman-temannya agar bisa mengubah   |\n" +
                "|  temannya yang menjadi monster kembali menjadi manusia normal |\n" +
                "|                                                               |\n" +
                "|              WWWWWWWWWWWW0:''.''..''.''cXWWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWW0::c,:c,'::,:;cXWWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWWKl,;,;:;,::;,,oXWWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWWXx;ck0KKKKK0l:xNWWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWXl,;ldxkxxxkxd:,lXWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWk,,:ccc;,,;cccc;,kWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWx;cddo:'..'coxxl;xWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWx;cddl;....;lxxl;xWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWx;coddoc;;cddddc;xWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWx,;ccllllllllll:,xWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWx;lxdxxxxxkkkkko;xWWWWWWWWWWW         |\n" +
                "|              WWWWWWWWWWWO:;;;;;;;;;;;;;;:OWWWWWWWWWWW         |\n" +
                "|                                                               |\n" +
                "+---------------------------------------------------------------+\n" +
                "\n");
    }

    public void scene10() {
        System.out.print("\n" +
                "+--------------------------------------------------------------------------+\n" +
                "|          YEAY akhirnya teman pemain kembali menjadi manuasi normal.      |\n" +
                "|          Kini saatnya melawan ratu laverna dengan memasangkan pin        |\n" +
                "|          ke baju laverna. pin tesebut akan memusnahkan laverna dan       |\n" +
                "|          mengahancurkan kutukannya.                                      |\n" +
                "|                                                                          |\n" +
                "|          pemain dan temannya berkata SSSEEERRRRAAAANNNGGG !!!!           |\n" +
                "|                                                                          |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNkc,.   .;ONWWWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWMWN0;    .c0WWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWO'     .dKKK00KNWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWWNOoc:;;::ldOKNWWNKx.       .;cokKNWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWXOo;.          .,:c:.        .,xKNWWWWMWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWNNWWWWXkl,.                        ..,xKWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWXOkxdc'                           'k00NWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWNX0xlc;.                              .dWWWWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWNNKl..           ..','.               'OWWWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWNXK0xc'.    .''.'lO00o'            .,.  ,kNWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWXOkxxxxkkkkkKWNk,          .,. .dO;  .;dKNWWWWMWWWWWWNN  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWWWWk.           cKO;..',.    .:occddoolllccl  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWWWX:            .,ox:.  .    .'...:xxkOO0KKN  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWMWWMWX:                .,dkd:,;o0NX00NWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWNNWWWKkocdOxdo,                  'lOXXNWWWWWWWWWWWWWWWW  |\n" +
                "|  WNXKOkdolc:;,,,,,:c:.   .codkOo.                  'OWWWWWWWWWWWWWWWWWW  |\n" +
                "|  O:..              .;cc:lkNWWWWNl                  ;0WWWWWWWWWWWWWWWWWW  |\n" +
                "|  d.              .cONWWWWWWWWWWNx'  .          .;;c0WWWWWWWWWWWWWWWWWWW  |\n" +
                "|  k,         ..;lxKWWWWWWWWWWWWXdodc'.. .';'  .l0NXNWWWWWWWWWWWWWWWWWWWW  |\n" +
                "|  Xl.  .';clxOXWWWWWWWWWWWWWNOo, .',;:::ld:.,dKWWWWWWWWWWWWWWWWWWWWWWWWW  |\n" +
                "|  N0xk0KXWWWWWWWWWWWWWWWWWWWNx' .oO0kd:..'lONWWWWWWWWWWWWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWO'.o0NWKo:. .xWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWx'dWWWWWd'.;0NWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWWWWWWWWWWWWWWWWX0XWWWWWXOloXWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW  |\n" +
                "|  WWWWWWWWWWWMWWMWWWWWMWWMWWMWWWWWWWWWNXWWWWWMWWMWWMWWMWWMWWWWWMWWWWWWMW  |\n" +                                                              
                "|                                                                          |\n" +
                "+--------------------------------------------------------------------------+\n" +
                "\n");
    }

    public void scene11() {
        System.out.print("\n" +
                "+-----------------------------------------------------------------------+\n" +
                "|  AARGGHHH TIDAKKKKKK!!!! TERKUTUK KAU !!!...teriak penyihir jahat              |\n" +
                "|                                                                       |\n" +
                "|  Akhirnya misi player dan teman-temannya berhasil memusnakan laverna  |\n" +
                "|  dan para budaknya (Monster jahat)                                    |\n" +
                "|                                                                       |\n" +
                "|       MMMMMMMMMMMMMN0xdddooddooooddoodddx0NMMMMMMMMMMMMM              |\n" +
                "|       MMMMMMMMMMWKdloxOKNWMMMMMMMMMMWNKOxoldKWMMMMMMMMMM              |\n" +
                "|       MMMMMMMMMNxcdKWMMMMMMMMMMMMMMMMMMMMWKdcxNMMMMMMMMM              |\n" +
                "|       MMMMMMMMXoc0WMMMMMMMMMMMMMMMMMMMMMMMMW0coXMMMMMMMM              |\n" +
                "|       MMMMMMMWd:0WWMMMMMMMMMMMMMMMMMMMMMMMMWW0:dWMMMMMMM              |\n" +
                "|       MMMMMMMXcoKokWMMMMMMMMMMMMMMMMMMMMMMM0oOo:KMMMMMMM              |\n" +
                "|       MMMMMMMK:dO:dMMMMMMMMMMMMMMMMMMMMMMMMk;kx:0MMMMMMM              |\n" +
                "|       MMMMMMMNlc0lcXMMMMMMMMMMMMMMMMMMMMMMNlc0ocKMMMMMMM              |\n" +
                "|       MMMMMMMMO:xx;kWNK0Okk0WMMMMWKkkO0KNW0:dk:xWMMMMMMM              |\n" +
                "|       MMMMMMMMWx:;;xx'.    .kMMMMO'    .'dk;,:xNMMMMMMMM              |\n" +
                "|       MMWXXWMMMWO';Oc      ,0MMMMK;      :O:'kWMMMNKKNMM              |\n" +
                "|       MNdcllOWMMXclN0;    :0WNXXNWKc.   ,0Wo:KMMWkll:oNM              |\n" +
                "|       Wk;xNx:dKWXclNMXkooONNd;:c:dNNOooxXMWo:KWKd:xWk;kW              |\n" +
                "|       dcdXMW0dooo:'lOXWMMMMk..;:..xWMMMWXOo';oood0WMNxcd              |\n" +
                "|       ;:dxddx0XKkd:..':o0WMx.,od;.dWWKd:'..:oOXXKkddxdc;              |\n" +
                "|       XOkkOkxooox0XKo';;;kWN0XWWX0NWO:;;,lKX0xdoodkOkkOX              |\n" +
                "|       MMMMMMMWN0xoooc';dllkOOOOOOOOkolo:'cooox0NWMMMMMMM              |\n" +
                "|       MMMMMMMMMMMMNOc.lxlloolloolloollxo':ONMMMMMMMMMMMM              |\n" +
                "|       MMMMMMMMMWKkdol'lKxoolclllccloox0o,codx0NMMMMMMMMM              |\n" +
                "|       MMNkdddddoodkKKl'xNNK0OOOOOO0KNNx'cKXOxoodddddkXMM              |\n" +
                "|       MM0::O00KXNKxoooollx0XNWWWWNX0xlloooox0NNK0KOc;OMM              |\n" +
                "|       MMW0lcOMNxloxOXWMN0xddddddddddx0NMMN0xolxXM0cl0WMM              |\n" +
                "|       MMMMXccOlcOWMMMMMMMMMWWNNNNWWMMMMMMMMMW0ccOo:KMMMM              |\n" +
                "|       MMMMWd''c0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKc''oNMMMM              |\n" +
                "|                                                                       |\n" +
                "+-----------------------------------------------------------------------+\n" +
                "\n");
    }

    public void scene12() {
        System.out.print("\n" +
                "+--------------------------------------------------------------------+\n" +
                "|  Akhirnya kampus Magic School kembali normal, semua kegiatan       |\n" +
                "|  dan aura kampus menjadi positif. tak hanya itu kekuatan           |\n" +
                "|  para mahasiswa semakin kuat dalam bertarung untuk mengamankan     |\n" +
                "|  diri dan kampus dari berbagai ancaman.                            |\n" +
                "|                                                                    |\n" +
                "|          &                                                         |\n" +
                "|    @     @%    @                                                   |\n" +
                "|     @@  @@@@ @@                                                    |\n" +
                "|      @@     @@                                                     |\n" +
                "|  %%  @@     @@  %%               @@@@@@@@@@@@@@@@@&                |\n" +
                "|      .@@@@@@                     @@@@@@@@@@@@@@@@@@                |\n" +
                "|    @@    @    @@                 @@              @@                |\n" +
                "|          @*                      @@ @@   @@  @@  @@                |\n" +
                "|                                  @@              @@                |\n" +
                "|                                  @@ @@   @@  @@  @@                |\n" +
                "|                  @@*             @@ #@   ((  @@  @@                |\n" +
                "|                 *@@        @@@@@@@@              @@@@@@@&          |\n" +
                "|               .@ @@@&      @@@@@@@@   @@@(@@@    @@@@@@@           |\n" +
                "|                  //         @%   @@   @@    @@   @@   @@           |\n" +
                "|                @@  @        @%   @@   @@    @@   @@   @@           |\n" +
                "|               @     @.      @@@@@@@@@@@@@@@@@@%@@@@@%@@@           |\n" +
                "|                                                                    |\n" +
                "|                                                                    |\n" +
                "|             MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM     |\n" +
                "|             MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM     |\n" +
                "|             MMMMMMWNNNNNNNNWMMMNNWMMMMMWNNWMMWWNNNNNWMMMMMMMMM     |\n" +
                "|             MMMMMMKc'''''.;OMMKc';kWMMNo',kMMKc''.'',ckNMMMMMM     |\n" +
                "|             MMMMMM0'  ;ooodKMM0'  .dNMN: .dMM0'  ;oc.  lNMMMMM     |\n" +
                "|             MMMMMM0'  :ddd0WMM0'    ckO: .dMM0' .xMMx. '0MMMMM     |\n" +
                "|             MMMMMM0'  ....oNMM0' .,.  .. .dMM0' .xMMO. .OMMMMM     |\n" +
                "|             MMMMMM0' .dXXXNMMM0' 'kk.    .dMM0' .xMWd. '0MMMMM     |\n" +
                "|             MMMMMM0'  ':::l0MM0' 'OW0d;  .dMM0'  ':;. .dNMMMMM     |\n" +
                "|             MMMMMMXo;;;;;;c0MMXo;oKMMMXd:cOMMXo;;;;:co0WMMMMMM     |\n" +
                "|             MMMMMMMWWWWWWWMMMMMMWMMMMMMMWMMMMMMWWWWMMMMMMMMMMM     |\n" +
                "|             MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM     |\n" +
                "|             MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM     |\n" +
                "+--------------------------------------------------------------------+\n" +
                "\n");
    }

}
