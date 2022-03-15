package SingletonPattern;
public class Singleton {

    private Singleton() {}

    private static Singleton theInstance;

    public static Singleton getInstance() {
        if (theInstance == null) {
            theInstance = new Singleton();
        }

        return theInstance;

    }
}
