public class task3 {
    public static void main(String args[]) {
        Double HP = -0.75;
        if (HP <= 0.25 & HP > 0) {
            System.out.println("Color: RED");
        } else if (HP > 0.25 & HP <= 0.5) {
            System.out.println("Color: ORANGE");
        } else if (HP > 0.5 & HP <= 0.75) {
            System.out.println("Color: YELLOW");
        } else if (HP > 0.75 & HP <= 1) {
            System.out.println("Color: GREEN");
        } else if (HP <= 0 || HP >= 100) {
            System.out.println("\\\\\\YOU DIED///");
        }
    }
}