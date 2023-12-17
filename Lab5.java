
class MyThread extends Thread {
    public void run() {
        System.out.println("This is a task running on a separate thread");
    }
}

public class Lab5 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("This is the main thread");
    }
}