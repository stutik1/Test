package Practice;

public class ImplementRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Megha ");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ImplementRunnable());
        thread.start();
    }
}
