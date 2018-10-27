public class task3 {
    public static void main(String args[]){
        double HP = 100;
        int hoursSinceRespawn = 2;
        double regeneration = 0.2;
        for(int i = 0; i < hoursSinceRespawn; i++){
            HP = HP + (HP * regeneration);
        }
        System.out.println("HP after regeneration -- " + HP);
    }
}