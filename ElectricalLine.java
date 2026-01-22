//class for the electrical line (circuit)
//it holds the line as an ArrayList
//dual constructors
//methods: add, run, stats

import java.util.ArrayList;
public class ElectricalLine{
    private ArrayList<Electric> circuit;

    public ElectricalLine(){
        circuit = new ArrayList<Electric>();
        //default circuit
        circuit.add(new BatteryNegative());
        circuit.add(new Wire());
        circuit.add(new BatteryPositive());
    }

    // public ElectricalLine(new ArrayList<Electric> inputLine){
    //     circuit = inputLine;
    // }
    // this won't be that good 
    // circuit and inputLine both will have the same refrence 
    // and that would defeat the purpose of private circuit

    public ElectricalLine(ArrayList<Electric> inputLine){
        circuit = new ArrayList<Electric>();
        circuit.add(new BatteryNegative());
        circuit.add(new Wire());
        circuit.add(new BatteryPositive());
        for(Electric i : inputLine){
            circuit.add(i);
        }
    }

    public void run(){
        for(Electric component : circuit){
            component.run();
        }
    }

    public void add(Electric InputComponent){
        if (InputComponent.getName().equals("BatteryPositive") || InputComponent.getName().equals("BatteryNegative")){
            System.out.println("The circuit comes with batteries included!");
            return;
        }else if(InputComponent == null){
            System.out.println("The Component cannot be null");
            return;
        }
        //add the component before the BatteryPositive and the last Wire.
        circuit.add(circuit.size() - 2, new Wire());
        circuit.add(circuit.size() - 2, InputComponent);
    }

    public void stats(){
        //report the numbers for each components
        String[] names = new String[]{"LED", "Buzzer", "Speaker", "Motor", "Wire"};
        int[] freq = new int[5];
        for(Electric component : circuit){
            for(int i = 0; i < names.length; i++){
                if(names[i].equals(component.getName())){
                    freq[i]++;
                    break;
                }
            }
        }

        for(int i = 0; i < names.length; i++){
            System.out.println("# of " + names[i] + ": " + freq[i]);
        }
    }
}