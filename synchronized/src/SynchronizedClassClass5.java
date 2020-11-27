/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/11/26 下午6:45
 */
public class SynchronizedClassClass5 implements Runnable{
    static SynchronizedClassClass5 instance1 = new SynchronizedClassClass5();
    static SynchronizedClassClass5 instance2 = new SynchronizedClassClass5();

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {
        }
        System.out.println("finished");
    }

    @Override
    public void run() {
        method();
    }

    private void method(){
        synchronized (SynchronizedClassClass5.class) {
            System.out.println("我是类锁的第二种形式synchronized(*.class),我叫" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("运行结束");
        }
    }
}
