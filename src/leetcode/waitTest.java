package leetcode;

public class waitTest {

    static int count = 0;
    static waitTest s = new waitTest();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (s) {
                while (count <= 100) {
                    System.out.println("thread1 " + count++);
                    s.notify();

                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();


        new Thread(() -> {
            synchronized (s) {
                while (count <= 100) {
                    System.out.println("thread2 "+count++);
                    s.notify();
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

}
