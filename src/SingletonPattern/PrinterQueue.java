package SingletonPattern;

public class PrinterQueue{

    private static PrinterQueue INSTANCE = null;
    private PrinterQueue() {}

    public static PrinterQueue getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrinterQueue();
        }
        return INSTANCE;

    }

}