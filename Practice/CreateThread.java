package Practice;

public class CreateThread extends Thread{
    public void run(){
        System.out.println("Megha Kumari");
    }
    public static void main(String[] args) {
        CreateThread thread1 = new CreateThread();
        thread1.start();
    }
}
