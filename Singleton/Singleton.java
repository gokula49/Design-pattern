package Singleton;

public class Singleton {

    private volatile static Singleton singleton = null;

   private Singleton(){
        this.singleton = getInstance();
    }

    private static synchronized Singleton getInstance() {
        if(singleton==null)  singleton = new Singleton();
        return singleton;
    }
}
