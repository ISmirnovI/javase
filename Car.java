public class Car {
    int maxSpeed = 130;
    public void start(){
        System.out.println("The car is on!");
    }
    public void stop(){
        System.out.println("The car is off!");
    }
    public void drive(int howFar){
        System.out.println("The car has driven " + howFar + " meters");
    }
}