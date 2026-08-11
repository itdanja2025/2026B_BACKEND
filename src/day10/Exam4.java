package day10;
public class Exam4 {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.tire = new Tire(); 
        myCar.run();
        myCar.tire = new HankookTire(); 
        myCar.run();
        myCar.tire = new KumhoTire();
        myCar.run(); 
        System.out.println( myCar.tire instanceof Tire ); 
        System.out.println( myCar.tire instanceof KumhoTire ); 
        System.out.println( myCar.tire instanceof HankookTire ); 

    } // main
} // class end

class Car{ 
 Tire tire;
 void run() { this.tire.roll(); }
}
class Tire{ 
 void roll(){
 System.out.println("[일반] 타이어가 회전");
 }
}
class HankookTire extends Tire{
 void roll(){ System.out.println("[한국] 타이어가 회전(업그레이드)"); }
}
class KumhoTire extends Tire{ 
 void roll(){ System.out.println("[금호] 타이어가 회전(업그레이드)"); }
}