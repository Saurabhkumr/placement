package moocify;

class Clockhand{
    private int value;
    private int limit;
    public  Clockhand(int limit){
        this.limit = limit;
        this.value=0;
    }
    public void advance(){
        this.value=this.value+1;
        if(this.value>this.limit){
            this.value=0;
        }
    }
    public int getValue(){
        return this.value;
    }

    public String toString(){
        if(this.value<10){
            return "0"+this.value;
        }
        return ""+this.value;
    }
}

class Clock {
    private Clockhand hr ;
    private Clockhand min ;
    private Clockhand sec;

    public Clock(){
        this.hr = new Clockhand(24);
        this.min = new Clockhand(60);
        this.sec = new Clockhand(60);

    }

    public void increment(){
        this.sec.advance();
        if(sec.getValue()==0){
            this.min.advance();
            if(min.getValue()==0){
                this.hr.advance();
            }
        }
    }
    public String toString(){
        return hr+":"+min+":"+sec;
    }

}
