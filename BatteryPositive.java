//This will be at the end of the Circuit

public class BatteryPositive extends Electric{
    private static String output = "|+|";

    public BatteryPositive(){
        name = "BatteryPositive";
    }

    public void run(){
        System.out.print(output);
    }
}