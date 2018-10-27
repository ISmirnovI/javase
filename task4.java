public class task4 {
    public static void main(String args[]){
       double regenerationPerMinute =  400;
       double damagePerMinute = 1500;
       if (damagePerMinute < regenerationPerMinute){
           System.out.println("You didnt kill the raidboss!!!");
       }else{
           System.out.println("You killed the raidboss!!!");
       }
    }
}