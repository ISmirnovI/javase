public class task6 {
    public static void main(String args[]) {
        int x = 2;
        int y = 3;
        int xNPS = 4;
        int yNPS = 13;
        double  S = Math.sqrt((xNPS - x)*(xNPS - x) + (yNPS - y)*(yNPS - y));
        System.out.println("Расстояние -- " + S + "метров");
    }
}