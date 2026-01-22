import java.util.ArrayList;

//this is where you will make your circuit lines, run them, and test them.
//Steps to make a line
//1) define a line
//2) add electrical components to the line
//3) run it!

public class Main{
    public static void main(String[] args){
        sampleRun1();
    }

    private static void sampleRun1(){
        ElectricalLine line = new ElectricalLine();
        line.add(new Led("cyan"));
        line.add(new Speaker("I_am_a_Speaker"));
        line.add(new Led("green"));
        line.add(new Motor(15));
        line.add(new Buzzer());
        line.add(new Motor(13));
        System.out.println();
        line.run();
        System.out.println();
        System.out.println("Statistics");
        line.stats();
    }
}