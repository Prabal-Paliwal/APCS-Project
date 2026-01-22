//LEDs have a special atribute of color
//Used the terminal color to show different colors

public class Led extends Electric{
    //colorful terminal
    private static String[] colorCodes = new String[]{"black", "red", "green", "yellow", "blue", "magenta", "cyan", "white"};
    private String color;

    public Led(){
        color = "\u001b[31m";
        name = "LED";
    }
    public Led(String color){
        name = "LED";
        int i = 0;
        while(!colorCodes[i].equals(color) && i < colorCodes.length){
            i++;
        }
        this.color = "\u001b[" + (30 + i) + "m";
    }

    public void run(){
        System.out.print("|" + color + "O" + "\u001b[0m" + "|");
    }
}