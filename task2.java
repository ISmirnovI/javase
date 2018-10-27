public class task2 {
    public static void main(String args[]){
        int gems = 0;
        Player players[] = new Player[4];
        for (int i = 0; i < players.length; i++) {
            Player player = new Player();
            player.nickname = "user" + i;
            player.score = (int) (Math.random() * 3000);
            players[i] = player;
            if(players[i].score > 1337){
                gems = gems + 322;
            }
        }
        System.out.println("За этот Event было потрачено " + gems + " гемов");
    }
}
