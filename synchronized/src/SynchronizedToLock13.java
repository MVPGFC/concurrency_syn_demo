import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 等价代码
 * @author guofucheng
 * @Desc
 * @date 2020/11/27 15:27
 */
public class SynchronizedToLock13 {
    Lock lock = new ReentrantLock();

    public synchronized void method1() {
        System.out.println("我是Synchronized形式的锁");
    }
    public void method2() {
        lock.lock();
        try {
            System.out.println("我是Lock形式的锁");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SynchronizedToLock13 s = new SynchronizedToLock13();
        s.method1();
        s.method2();
    }
}
