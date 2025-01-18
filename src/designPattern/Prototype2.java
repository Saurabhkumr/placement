package designPattern;

import java.util.HashMap;

abstract class Enemy implements Cloneable{
    private String name;
    private int speed;
    private int health;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", health=" + health +
                '}';
    }

    @Override
    protected Enemy clone() throws CloneNotSupportedException {
        return (Enemy)super.clone();
    }
}

class Dragon extends Enemy{
    public Dragon(){
        setName("Dragon");
        setHealth(100);
        setSpeed(500);
    }
}


class Zombie extends Enemy{
    public Zombie(){
        setName("Zombie");
        setHealth(80);
        setSpeed(100);
    }
}


class EnemyRegistry{
    private static HashMap<Integer,Enemy> enemylist = new HashMap<>();

    public static void loadEnemy(){
        Dragon d = new Dragon();
        enemylist.put(1,d);

        Zombie z = new Zombie();
        enemylist.put(2,z);
    }

    public static Enemy getEnemylist(Integer key) throws CloneNotSupportedException {
        return enemylist.get(key).clone();
    }
}




public class Prototype2 {
    public static void main(String[] args) throws CloneNotSupportedException{
       EnemyRegistry.loadEnemy();

       Enemy e1 = EnemyRegistry.getEnemylist(1);
       e1.setName("dragon-1");
       Enemy e2 = EnemyRegistry.getEnemylist(1);
       e2.setName("dragon-2");
       Enemy e3 = EnemyRegistry.getEnemylist(1);
       e3.setName("dragon-3");
       Enemy e4 = EnemyRegistry.getEnemylist(2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    }


}
