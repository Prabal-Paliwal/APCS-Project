//parent class for all the electrical components
//every component has the run method and name

public abstract class Electric{
    public String name;

    public String getName(){
        return name;
    }

    public abstract void run();
}