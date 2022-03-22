package SingletonPattern;

public class PrinterQueueMain {
    public static void main(String[] args) {
        PrinterQueue printerQueue = PrinterQueue.getInstance();
        print("Hello, Singleton!");
    }
    public static void print(String s) {
        System.out.println("Printing job: " + s);

    }
}
