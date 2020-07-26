package March;

public class ThreadPrint {
    static ThreadPrint threadPrint = new ThreadPrint();
    int count = 0;

    public void threadPrint() {
        Thread thread1 = new Thread(() -> {
            synchronized (threadPrint) {
                while (count < 100) {
                    System.out.println(Thread.currentThread().getName() + " " + count++);
                    threadPrint.notify();
                    try {
                        threadPrint.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (threadPrint) {
                while (count < 100) {
                    System.out.println(Thread.currentThread().getName() + " " + count++);
                    threadPrint.notify();
                    try {
                        threadPrint.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        threadPrint.threadPrint();
    }
}
