package StartingThreads_1;

/**
 * Created by Zhiheng on 2015-09-03.
 * ApplicationSameClass类实现了Runnable接口, 在类内部的Main方法中start进程
 */
public class ApplicationSameClass implements Runnable {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ApplicationSameClass m1 = new ApplicationSameClass();
        Thread t1 = new Thread(m1);
        t1.start();
    }

}
