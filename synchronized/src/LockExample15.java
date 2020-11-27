import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 展示lock的方法
 * @author guofucheng
 * @Desc
 * @date 2020/11/27 17:05
 */
public class LockExample15 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        lock.tryLock();
       // lock.tryLock(1000, TimeUnit.SECONDS);
    }
}
