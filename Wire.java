//everything must connect to a wires
//components cant connect to eachother directly
//They are auto-configured
//but you can extend the wire by adding one extra

public class Wire extends Electric{
    private static String output = "---";

    public Wire(){
        name = "Wire";
    }

    public void run(){
        System.out.print(output);
    }
}