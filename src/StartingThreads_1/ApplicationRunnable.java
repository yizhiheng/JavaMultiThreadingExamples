package StartingThreads_1;

/*
* 通过类实现Runnable接口来实现多线程
* 需要重写run方法
* */
class RunnerRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello: " + i + " 我的名字是 " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ApplicationRunnable {

    public static void main(String[] args) {
        //此处有两个进程同时运行

        Thread thread1 = new Thread(new RunnerRunnable());
        Thread thread2 = new Thread(new RunnerRunnable());
        thread1.start();
        thread2.start();
    }

}
