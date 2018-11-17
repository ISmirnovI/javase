public class BrucWayne {
    public static void main(String args[]){
        BatMobile batMobile = new BatMobile();
        batMobile.start();
        batMobile.healthPoint(5000);
        batMobile.drive(3000);
        batMobile.shoot();
        batMobile.ram(200);
        batMobile.stop();
    }
}
