/**
 * 可重入粒度测试:调用类内另外的方法
 * @author guofucheng
 * @Desc
 * @date 2020/11/27 14:43
 */
public class SynchronizedOtherMethod11 {
    public synchronized void method1(){
        System.out.println("我是方法1");
        method2();
    }
    public synchronized void method2(){
        System.out.println("我是方法2");
    }

    public static void main(String[] args) {
        SynchronizedOtherMethod11 synchronizedOtherMethod11 =
                new SynchronizedOtherMethod11();
        synchronizedOtherMethod11.method1();
    }
}
