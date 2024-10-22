public class ThreadingExample extends  Thread {
    @Override
    public void run() {
        System.out.println("Running");
        System.out.println(Thread.currentThread().getName());
    }
}
