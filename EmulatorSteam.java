public class EmulatorSteam {
    static Steam steam = new Steam();
    static Player player = new Player();
    public static void main(String[] args){
        init();
    }
    public static void init() {
        Game[] game = steam.gamesInLibrary;
        game[0] = new Game();
        game[0].name = "WoW";
        game[0].cost = 3.0;
        game[0].ageLimit = 16;

        game[1] = new Game();
        game[1].name = "WoT";
        game[1].cost = 10.0;
        game[1].ageLimit = 14;

        game[2] = new Game();
        game[2].name = "RDR2";
        game[2].cost = 30.0;
        game[2].ageLimit = 18;

        game[3] = new Game();
        game[3].name = "Half-Life 3";
        game[3].cost = 27.0;
        game[3].ageLimit = 14;

        game[4] = new Game();
        game[4].name = "Need for speed";
        game[4].cost = 15.0;
        game[4].ageLimit = 8;

        game[5] = new Game();
        game[5].name = "Minecraft";
        game[5].cost = 5.0;
        game[5].ageLimit = 4;

        game[6] = new Game();
        game[6].name = "Dota 2";
        game[6].cost = 2.5;
        game[6].ageLimit = 16;

        game[7] = new Game();
        game[7].name = "CS:GO";
        game[7].cost = 5.0;
        game[7].ageLimit = 16;

        game[8] = new Game();
        game[8].name = "Dead space 3";
        game[8].cost = 4.5;
        game[8].ageLimit = 18;

        game[9] = new Game();
        game[9].name = "GTA 5";
        game[9].cost = 12.0;
        game[9].ageLimit = 16;

        player.cash = 85;
        player.nickname = "doubt";
        player.age = 14;
    }
}