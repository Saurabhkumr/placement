package designPattern;

import java.util.ArrayList;

interface Subject{
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notification();
    void upload(String name);
}

interface Observer{
    void update();
    void subscribechannel(Channel ch);
}

class Channel implements Subject{
    public String name;
    public String title;
    ArrayList<Subscriber> sub = new ArrayList<>();

    @Override
    public void subscribe(Subscriber s) {
        sub.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        sub.remove(s);
    }

    @Override
    public void notification() {
        for(Subscriber s : sub)
          s.update();
    }

    @Override
    public void upload(String name){
        this.title=name;
        notification();
    }

    public String getName() {
        return name;
    }
    public void setName(String str) {
         this.name=str;
    }

    public String getTitle() {
        return title;
    }

}

class Subscriber implements Observer{
    public String name;
    Channel channel = new Channel();

    public Subscriber(String str) {
        this.name = str;
    }
    @Override
    public void update() {
        System.out.println(this.name + "::"+ channel.name + " has Uploaded a video...");
    }

    @Override
    public void subscribechannel(Channel ch) {
          channel=ch;
    }


}

public class ObserverPattern {
    public static void main(String[] args) {
        Subscriber s1 = new Subscriber("Rahul");
        Subscriber s2 = new Subscriber("Mohit");
        Subscriber s3 = new Subscriber("Ram");

        Channel ch = new Channel();
        ch.setName("SandUp");

        ch.subscribe(s1);
        ch.subscribe(s2);
        ch.subscribe(s3);

        s1.subscribechannel(ch);
        s2.subscribechannel(ch);
        s3.subscribechannel(ch);

        ch.upload("Bassi");
    }
}
