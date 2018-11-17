public class BatMobile extends Car {
    public void shoot(){
        System.out.println("The BatMobile is shooting!");
    }
    public void bulletCapacity(int howMuch){
        System.out.println("The BatMobile's bullet capacity: " + howMuch);
    }
    public void healthPoint(int howMany){
        System.out.println("The BatMobile's helth points: " + howMany);
    }
    public void ram(int damage){
        System.out.println("The BatMobile has ramed an object with " + damage + " damage!");
    }
}