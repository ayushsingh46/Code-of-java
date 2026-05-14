interface Bicycle{
   final int a = 45;
    void apply_brake(int decrement);
    void speed_up (int increment);
}
class avonCycle implements Bicycle{
    int speed = 70;
   public void apply_brake(int decrement){ //public is important
       speed = speed - decrement;
       System.out.println("applying brake");
    }
    public void speed_up(int increment){  //public is important
        speed = speed + increment;
        System.out.println("speeding up");
    }
}
public class Interface {
    public static void main(String[] args) {
        avonCycle av = new avonCycle();
        av.speed_up(32);
        //av.apply_brake(8);
        System.out.println( "current speed "+av.speed );
        System.out.println("The value of increment is "+Bicycle.a);
        //Bicycle.a = 46; as you cannot modify the properties in Interface as they are final!
    }
}
//