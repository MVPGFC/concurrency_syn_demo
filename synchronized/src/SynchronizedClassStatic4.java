/**
 * 类锁的第一种描述形式，static
 * @author guofucheng
 * @version 1.0
 * @date 2020/11/26 下午5:40
 */
public class SynchronizedClassStatic4 implements Runnable{

    static SynchronizedClassStatic4 instance1 = new SynchronizedClassStatic4();
    static SynchronizedClassStatic4 instance2 = new SynchronizedClassStatic4();
    @Override
    public void run() {
        //methodWithoutStatic();
        methodWithStatic();
    }

    public synchronized void methodWithoutStatic() {
        System.out.println("我是类锁的第一种形式：static形式，我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public static synchronized void methodWithStatic() {
        System.out.println("我是类锁的第一种形式：static形式，我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {
        }
        System.out.println("finished");
    }

}
