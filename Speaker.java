//Speakers, unlike Buzzers, can actually say different things
//so they have a input for what to print

public class Speaker extends Electric{
    String output;

    public Speaker(){
        output = "LOUD_NOISE";
        name = "Speaker";
    }
    public Speaker(String output){
        this.output = output;
        name = "Speaker";
    }

    public void run(){
        System.out.print("|" + output + "|");
    }
}