public class task4 {
    public static void main(String args[]) {
        double damage = 20;
            int a = 1;
        if(a == -2){
            System.out.println("Damage, Undead: " + damage * 1.5);
        }
        if(a == -1){
            System.out.println("Damage, Zombie: " + damage * 1.5);
        }
        if(a == 0){
            System.out.println("Damage, Plant: " + damage);
        }
        if(a == 1){
            System.out.println("Damage, Animal: " + damage);
        }
        if(a == 2){
            System.out.println("Damage, Gumanoid: " + damage);
        }
        if(a == 3){
            System.out.println("Damage, Saint: " + damage / 2);
        }
        if(a == 4){
            System.out.println("Damage, Ghost: " + damage);
        }
        if(a != -2 && a != -1 && a != 0 && a != 1 && a != 2 && a != 3 && a != 4){
            System.out.println("THERE ARE NO MOBS!");
        }


    }
}