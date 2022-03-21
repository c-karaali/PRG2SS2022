package SingletonPattern;

public class PrinterQueue{

    private static PrinterQueue printerQueue = null;
    private PrinterQueue() {}

    public static PrinterQueue getInstance() {
        if (printerQueue == null) {
            printerQueue = new PrinterQueue();
        }
        return printerQueue;
    }
}