public class Steam {
    int totalCash;
    Game[] gamesInLibrary = new Game[10];
    public void sell(String gameTitle, int gameNumber, Player player) throws Exception{
        if (player.cash < gamesInLibrary[gameNumber].cost) {
            throw new Exception("You dont have enough money!!!");
        }
        if (player.age < gamesInLibrary[gameNumber].ageLimit) {
            throw new Exception("Your are not old enough to play this game!!!");
        }
        //if (player.gamesInLibrary = gamesInLibrary[gameNumber]) {
         //   throw new Exception("You have this game!!!");
        //}
        player.cash -= gamesInLibrary[gameNumber].cost;
        totalCash += gamesInLibrary[gameNumber].cost;
        System.out.println("Yov have bought the game!");
    }
}