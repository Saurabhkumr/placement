package designPattern;

class Phone{
    private String os;
    private int ram;
    private int storage;
    private int battery;
    private int camera;

    public Phone(String os , int ram , int storage , int battery , int camera){
        this.os=os;
        this.ram=ram;
        this.storage=storage;
        this.battery=battery;
        this.camera=camera;
    }
    public String toString(){
        return this.os+" "+this.ram+" "+this.storage+" "+this.battery+" "+this.camera;
    }


}

class PhoneBuilder{
    private String os;
    private int ram;
    private int storage;
    private int battery;
    private int camera;

    public PhoneBuilder getOs(String os){
        this.os=os;
        return this;
    }
    public PhoneBuilder getRam(int ram){
        this.ram=ram;
        return this;
    }
    public PhoneBuilder getStorage(int storage){
        this.storage=storage;
        return this;
    }
    public PhoneBuilder getBattery(int battery){
        this.battery=battery;
        return this;
    }
    public PhoneBuilder getCamera(int camera){
        this.camera=camera;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,ram,storage,battery,camera);
    }

}


public class BuilderDesign {
    public static void main(String[] args) {
        PhoneBuilder p1 = new PhoneBuilder().getOs("spandragon").getCamera(32).getRam(8);
        System.out.println(p1.getPhone());
    }
}
