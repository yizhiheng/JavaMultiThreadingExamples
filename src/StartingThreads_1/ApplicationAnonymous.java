package StartingThreads_1;

/*
* Java 编程语言给我们提供了接口的概念，接口里可以定义抽象的方法。
* 接口定义了 API，并希望用户或者供应商来实现这些方法。
* 很多时候，我们并不为一些接口创建独立的实现类，我们通过写一个匿名内部类来写一个内联的接口实现。
* 匿名类使用的非常广泛。匿名内部类使用的最常见的场景就是事件处理器了。
* 其次匿名内部类还常被用在多线程的程序中，我们通常写匿名内部类,而不是创建 Runnable/Callable 接口的实现类。
*
* 下面是一个匿名类的多线程实现
* */
public class ApplicationAnonymous {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignored) {}
                }
            }
        });

        thread1.start();
    }

}
