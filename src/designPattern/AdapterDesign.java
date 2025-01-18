package designPattern;

interface Pen{
    public void write(String str);
}
class PilotPen{
    public void write(String str){
        System.out.println("start writing "+str);
    }
}

class Assignment{
    private Pen p;
    public void setP(Pen p){
        this.p=p;
    }
    public Pen getP(){
        return p;
    }
    public void assignmentWrite(String str){
        p.write(str);
    }
}

class Adapter implements Pen{
    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.write(str);
    }
}

public class AdapterDesign {
    public static void main(String[] args) {

        Pen p = new Adapter();
        Assignment asg = new Assignment();
        asg.setP(p);
        asg.assignmentWrite("assignment");


    }
}
