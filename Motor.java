//Motor taking a steps means they rotate 90 deg clockwise 
//each run, the Motor rotate a specific amount (given in the constructor).

public class Motor extends Electric{
    //representing different rotations
    private String[] states = new String[]{"/\\", ">", "\\/", "<"};
    private int state = 0;
    private int steps;

    public Motor(){
        steps = 1;
        name = "Motor";
    }
    public Motor(int steps){
        this.steps = Math.max(1, steps);
        name = "Motor";
    }

    public void run(){
        state += steps;
        state = state % 4;
        System.out.print("|" + states[state] + "|");
    }
}