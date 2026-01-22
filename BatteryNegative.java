//this will be at the starting of the circuit

public class BatteryNegative extends Electric{
    private static String output = "|-|";
    
    public BatteryNegative(){
        name = "BatteryNegative";
    }

    public void run(){
        System.out.print(output);
    }
}