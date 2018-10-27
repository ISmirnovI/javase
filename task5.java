public class task5 {
    public static void main(String args[]){
        double regenerationPerMinute = 1500;
        int damagePerMinute = 1753;
        int HP0 = 12000;
        double HP = 12000;
        for(int minute = 0; minute < 60; minute++){
            HP = HP - damagePerMinute + regenerationPerMinute;
            for (int k = 1; k > 0; k -= 0.1) {
                if (HP0 == HP * k) {
                    regenerationPerMinute = regenerationPerMinute * 1.5;
                }
            }
            if(HP <= 0){
                System.out.println("Time for killing: " + minute + " minutes");
                break;
            }
        }
        if(HP > 0){
            System.out.println("You didnt kill the Raid Boss! HA-HA-HA-HA");
        }
    }
}