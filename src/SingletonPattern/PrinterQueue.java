package SingletonPattern;
public class PrinterQueue {

    private static Singleton INSTANCE = null;

    private Singleton() {}

    private static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrinterQueue();
        }

        return INSTANCE;

    }

    private static String print(String) {
        System.out.println("Printing job: " + )
    }
}
