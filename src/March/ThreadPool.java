package March;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static int i=0;
    static ThreadPool instance=new ThreadPool();
    public void getDataSource(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(()->{
            System.out.println(Thread.currentThread().getId()+" 对应的数字是 "+ i++);
        });
    }

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (instance){
                while(i<30){
                    System.out.println("number is "+ i++);
                    instance.notify();
                }
                try {
                    instance.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (instance) {
                while (i < 30) {
                    System.out.println("number2 is " + i++);
                    instance.notify();
                }
                try {
                    instance.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
       /* new ThreadPool().getDataSource();
        new ThreadPool().getDataSource();
        new ThreadPool().getDataSource();
        new ThreadPool().getDataSource();
        new ThreadPool().getDataSource();*/

    }
}
